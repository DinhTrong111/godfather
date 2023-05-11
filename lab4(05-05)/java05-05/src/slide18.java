import java.util.ArrayList;
import java.util.Iterator;

public class slide18 {
    public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList<>();
		arr.add("Bui");
		arr.add("Hoang");
		arr.add("Long");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"\t");
		}
		
}
}
