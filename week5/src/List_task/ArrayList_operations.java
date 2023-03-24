package List_task;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=-1;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		do {
			System.out.println("1.INSERT");
			System.out.println("2.REMOVE");
			System.out.println("3.DISPLAY");
			System.out.println("0.EXIT");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter the value: ");
				int val = sc.nextInt();
				list.add(val);
				System.out.println("added successfully..");
				break;
			}
			case 2: {
				System.out.println("Enter the value to remove: ");
				int val = sc.nextInt();
				list.remove(Integer.valueOf(val));
				System.out.println("Deleted Successfully.");
				break;
			}
			case 3: {
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
