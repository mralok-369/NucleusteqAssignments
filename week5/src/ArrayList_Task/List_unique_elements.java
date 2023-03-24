package ArrayList_Task;

import java.util.ArrayList;
import java.util.Scanner;

public class List_unique_elements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=-1;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("0.EXIT");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter the value: ");
				int val = sc.nextInt();
				if(list.contains(val)) {
					System.out.println("list already have this value.");
					break;
				} else {
					list.add(val);
				}
				break;
			}
			case 2: {
				System.out.println("Elements of the list are : ");
				for(int val:list) {
					System.out.print(val +" ");
				}
				System.out.println();
				break;
			}
			default:
				System.out.println("Thank you..Visit again!!");
			}
			
		} while (choice!=0);
		
	}

}
