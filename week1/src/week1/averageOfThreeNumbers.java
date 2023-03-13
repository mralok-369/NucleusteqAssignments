package week1;

import java.util.Scanner;

public class averageOfThreeNumbers {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third Number : ");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The Sum of Numbers "+a+" and "+b+" and "+c+" = "+sum);
        System.out.println("The Average of Numbers "+a+" and "+b+" and "+c+" = "+(sum/3));
    }
}
