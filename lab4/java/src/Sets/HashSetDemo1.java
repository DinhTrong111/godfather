package Sets;

import java.util.HashSet;
import java.util.Scanner;

import java.Employee1;
import java.Employee2;

public class HashSetDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		HashSet<Employee1> eplSet = new HashSet<>();
		int a=1;
		while(a==1) {
		System.out.println("\n1.Thêm Thông Tin.");
		System.out.println("2.Hiển Thị Thông Tin.");
		System.out.println("3.Sửa Thông Tin.");
		System.out.println("4.Xóa Thông Tin");
		int luachon;
		do {
			System.out.println("Nhập vào lựa chọn:");
			luachon=sc.nextInt();	
		}while((luachon<=0)||(luachon>4));
		switch(luachon) {
		case 1: Employee2.ThemThongTin(eplSet);
				break;
		case 2: Employee2.HienTHi(eplSet);
				break;
		case 3: Employee2.Update(eplSet);
				break;
		case 4: Employee2.DeLete(eplSet);
				break;
}
		}
	}
}