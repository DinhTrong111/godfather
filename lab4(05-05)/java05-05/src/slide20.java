import java.util.ArrayList;

public class slide20 extends slide17 {
    public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<>();
		arr.add("Bui");
		arr.add("Hoang");
		arr.add("Long");
		arr.add(0,"Ten:");
		arr.remove(0);
		arr.set(1,"Trung");
		HienThi(arr);
		System.out.println("So luong phan tu la:"+arr.size());
	}
}
