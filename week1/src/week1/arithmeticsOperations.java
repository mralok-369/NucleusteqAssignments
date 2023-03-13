package week1;

import java.util.Scanner;

public class arithmeticsOperations {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("The Sum of Two Numbers "+a+" and "+b+" = "+(a+b));
        System.out.println("The Product of Two Numbers "+a+" and "+b+" = "+(a*b));
        System.out.println("The Difference of Two Numbers "+a+" and "+b+" = "+(a-b));
        System.out.println("The Division of Two Numbers "+a+" and "+b+" = "+(a/b));
        System.out.println("The Remainder of Two Numbers "+a+" and "+b+" = "+(a%b));
    }
}
