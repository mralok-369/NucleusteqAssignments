package Custom_Exceptions;

import java.util.Scanner;

public class nested_try_catch {
	public static void main(String[] args) {
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
        
        try{
            System.out.println("Welcome to Nested try-catch exception");
            try{
                System.out.println(marks[index]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e){
            System.out.println("Exception in level 1");
        }  
	}
}
