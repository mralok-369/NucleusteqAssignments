package Custom_Exceptions;

import java.util.Scanner;

public class specific_exceptions {
	public static void main(String[] args) {
		
		// Handling specific Exceptions
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no of elements in array : ");
		int n = scanner.nextInt();
		int[] marks = new int[n];
		
		System.out.println("Enter the "+n+" elements of array : ");
		for(int i=0; i<n; i++) {
			marks[i] = scanner.nextInt();
		}
		
	    System.out.println("Enter the array index : ");
	    int index = scanner.nextInt();
	    System.out.println("Enter the number you want to divide the value with : ");
	    int number = scanner.nextInt();
	    try {
	        System.out.println("The value at array index entered is : " + marks[index]);
	        System.out.println("the value of array-value/number is : " + marks[index]/number);
	    } catch (ArithmeticException e){
	        System.out.println("Arithmetic Exception occurred!");
	        System.out.println(e);
	    } catch (ArrayIndexOutOfBoundsException e1){
	        System.out.println("ArrayIndexOutOfBoundsException occurred!");
	        System.out.println(e1);
	    } catch (Exception e2){
	        System.out.println("Some other exception occurred!");
	        System.out.println(e2);
	    }
	    System.out.println("End of the program...!!");
	}
}
