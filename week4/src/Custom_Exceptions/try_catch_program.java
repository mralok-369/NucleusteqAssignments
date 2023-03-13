package Custom_Exceptions;

import java.util.Scanner;

public class try_catch_program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter two numbers for division : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
        try {
            int c = a/b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("we failed to divide Reason: ");
            System.out.println(e);
        }
        
	}
}
