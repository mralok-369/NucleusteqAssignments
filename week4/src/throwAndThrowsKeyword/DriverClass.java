package throwAndThrowsKeyword;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
//        try {
//            int c = divide(6,0);
//            System.out.println(c);
//        } catch (Exception e) {
//            System.out.println("Exception");
//        }
		throw_and_throws obj = new throw_and_throws();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		int radius = scanner.nextInt();

        try {
            double ar = obj.area(radius);
            System.out.println(ar);
            System.out.println();
        } catch (Exception e){
            System.out.println(e);
            System.out.println();
        }
        
        // Arithmetics operation 
        System.out.println("Enter two Integers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        try {
			int res = obj.divide(a, b);
			System.out.println("Division of numbers : " + res);
			System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println();
		}

    }
}
