package Lists;

import java.util.LinkedList;
import java.util.Scanner;

import java.Student1;

public class LinkedListDemo{
	public static void main(String[] args) {
		Scanner	 sc = new Scanner(System.in);
		LinkedList<Student1> lkList = new LinkedList<>();
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
		case 1: Student1.ThemMoi(lkList);
				break;
		case 2: Student1.HienThi(lkList);
				break;
		case 3: Student1.Update(lkList);
				break;
		case 4: Student1.Delete(lkList);
				break;
		}
	}
		}

}