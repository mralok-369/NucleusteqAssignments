package week2;

import java.util.Scanner;

public class sumOfEvenNumbersInArray {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
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

        // calculating the even numbers sum of array
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("The Sum of Even Numbers in Array is : "+sum);
    }
}
