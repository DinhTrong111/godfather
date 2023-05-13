package java2804;

import java.util.ArrayList;
import java.util.ListIterator;

public class slide19 {
	public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList<>();
		arr.add("Nguyen");
		arr.add("Dinh");
		arr.add("Trong");
		ListIterator<String> it = arr.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
}
}