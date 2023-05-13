package java2804;

import java.util.ArrayList;

public class slide20 extends slide17  {
	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<>();
		arr.add("Nguyen");
		arr.add("Dinh");
		arr.add("Trong");
		arr.add(0,"Ten:");
		arr.remove(0);
		arr.set(1,"Trung");
		HienThi(arr);
		System.out.println("So luong phan tu la:"+arr.size());
	}
}