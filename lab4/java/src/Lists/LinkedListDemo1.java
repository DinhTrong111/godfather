package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import java.Employee1;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Employee1> eplList = new LinkedList<>();
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
		case 1: Employee1.ThemThongTin(eplList);
				break;
		case 2: Employee1.HienTHi(eplList);
				break;
		case 3: Employee1.Update(eplList);
				break;
		case 4: Employee1.deLete(eplList);
				break;
}
		}
	}
}

