package Set_task;

import java.util.HashSet;
import java.util.Scanner;

public class store_unique_element_of_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter "+n+" elements of the array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements are: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// creating and adding elements of array in set
		HashSet<Integer> set = new HashSet<>();
		for(int val:arr) {
			set.add(val);
		}
		
		System.out.println("Array elements are in set: ");
		for(int val : set) {
			System.out.print(val+" ");
		}
		System.out.println();
		
	}
}
