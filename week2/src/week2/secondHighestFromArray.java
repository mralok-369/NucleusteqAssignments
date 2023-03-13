package week2;

import java.util.Arrays;
import java.util.Scanner;

public class secondHighestFromArray {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the size of the array : ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        // taking input of array
	        System.out.println("Enter the "+n+ " elements of array : ");
	        for(int i=0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }

	        // printing the numbers of array
	        System.out.println("Array Elements are : ");
	        for(int i=0; i<n; i++){
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();

	        // finding second highest from array
	        Arrays.sort(arr);
	        System.out.println("Second largest number of array : " + arr[n-2]);
	    }
}
