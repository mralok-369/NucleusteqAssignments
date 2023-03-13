package week2;

import java.util.ArrayList;
import java.util.Scanner;

public class seprateEvenAndOddNumbersFromArray {
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

        //Separating the even odd numbers
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        // printing the separate arrays
        System.out.print("The even array is : "+even);
        System.out.println();
        System.out.print("The odd array is : "+odd);
        System.out.println();

    }
}
