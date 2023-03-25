package Map_task;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;

public class count_frequency {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		do {
			System.out.println("Want to perform operation with: ");
			System.out.println("1.INTEGER");
			System.out.println("2.STRING");
			System.out.println("0.EXIT");
			
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1: {
				System.out.println("Enter the no of elements in array: ");
				int n = scanner.nextInt();
				
				int[] arr = new int[n];
				System.out.println("Enter "+n+" elements of the array: ");
				for(int i=0; i<n; i++) {
					arr[i] = scanner.nextInt();
				}
				
				// displaying the elements of the array
				System.out.println("Array elements are: ");
				for(int i=0; i<n; i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				
				// creating map and counting the frequency of the  elements from list
				HashMap<Integer, Integer> map = new HashMap<>();
				
				for(int i=0; i<n; i++){
					if (map.containsKey(arr[i])) {
						map.put(arr[i],map.get(arr[i])+1);
					} else {
						map.put(arr[i],1);
					}
				}
				
								
				// showing frequency of the elements
				System.out.println("Printing the frequency of array elements: ");
				for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
					System.out.println("Frequency of "+entry.getKey()+" is: "+entry.getValue());
				}
				break;
			}
			case 2: {
				System.out.println("Enter the string: ");
				String str = sc.nextLine();
				
				// displaying the elements of the array
				System.out.println("Your entered string is: ");
				System.out.println(str);
				
				// creating map and counting the frequency of the alphabets from list
				HashMap<Character, Integer> map = new HashMap<>();
				for(int i=0; i<str.length(); i++) {
					char ch  = str.charAt(i);
					if (ch!=' ' && map.containsKey(ch)) {
						map.put(ch,map.get(ch)+1);
					} else if(ch!=' '){
						map.put(ch,1);
					}
				}
				
				// showing frequency of the elements
				System.out.println("Printing the frequency of alphabets: ");
				for(Map.Entry<Character,Integer> entry : map.entrySet()) {
					System.out.println("Frequency of "+entry.getKey()+" is: "+entry.getValue());
				}
				break;
			}
			default:
				System.out.println("Thank you for using...!!");
				break;
			}
			
		} while (choice!=0);
		
	}

}
