package java;

import java.util.Scanner;
import java.util.Set;

public class Employee2 extends Employee1{
	public static void ThemThongTin(Set<Employee2> Lepl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên");
		int n = sc.nextInt();
		for(int i =0 ; i<n ;i++) {
			Employee2 epl = new Employee2();
			epl.NhapThongTin();
			Lepl.add(epl);
			System.out.println("Thành công");
		}
	}
	public static void HienTHi(Set<Employee2> eplList) {
		for(Employee2 str : eplList) {
			System.out.printf("Nhân viên:%s có mã là: %s, %dtuổi,địa chỉ:%s,số điện thoại:%s\n",str.TenNhanVien,str.MaNhanVien,str.Tuoi,str.QueQuan,str.SoDienThoai);
		}
	}
	public static void Update (Set<Employee2> eplList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã nhân viên cần thay đổi:");
		 String abc=sc.nextLine();
		 boolean a=false;
		 for(Employee2 str : eplList) {
			 if(str.getMaNhanVien().equals(abc)) {
				 Employee2 ad = new Employee2();
				 eplList.remove(str);
				ad.NhapThongTin();
				 eplList.add(ad);
				 System.out.println("Thành công");
				 a=true;
				 break;
			 }
			 if(!a) 
				 System.out.println("Không tìm thấy nhân viên");
		 }
	}
	public static void deLete (Set<Employee2> eplList) {
		System.out.println("Nhập mã nhân viên cần xóa");
		Scanner sc = new Scanner(System.in);
		String abc = sc.nextLine();
		boolean a= false;
		for(Employee1 str : eplList) {
			 if(str.getMaNhanVien().equals(abc)) {
				 eplList.remove(str);
				System.out.println("Thành công");
				a=true;
				break;
			}
			if(!a)
				System.out.println("Không tìm thấy nhân viên");
		}
		
	}
}