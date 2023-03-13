package Generic_class;

import java.util.ArrayList;
import java.util.Iterator;

public class DriverClass {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(554);
		list.add(451);
		System.out.println("List Elements : ");
		for(int i : list) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		// creating object of generic class
		MyGeneric<String> object = new MyGeneric(21,"Hello World!");
		String str = object.getT1();
		System.out.println(str);
		
		System.out.println("\nValue of Generic class instance variable : " + object.getVal());
	}
}
