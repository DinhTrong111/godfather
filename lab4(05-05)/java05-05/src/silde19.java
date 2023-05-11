import java.util.ArrayList;
import java.util.ListIterator;


public class silde19 {
    public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList<>();
		arr.add("Bui");
		arr.add("Hoang");
		arr.add("Long");
		ListIterator<String> it = arr.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
}
}
