import java.util.ArrayList;

public class slide17 {
    public static void main(String[] args) {
		ArrayList<String> arr=new  ArrayList<>();
		arr.add("Bui");
		arr.add("Hoang");
		arr.add("Long");
		HienThi(arr);
	}
	public static void HienThi(ArrayList<String> arr) {
		for(String number : arr) {
			System.out.print(number+"\t");
		}
}
}
