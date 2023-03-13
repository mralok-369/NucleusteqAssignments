package week2;

import java.util.Scanner;

public class highestFromThreeNumbers {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Three Integers : ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        if(a>b && a>c) {
	            System.out.println("Highest Number is : " + a);
	        } else if(b>a && b>c) {
	            System.out.println("Highest Number is : " + b);
	        } else {
	            System.out.println("Highest Number is : " + c);
	        }

	    }
}
