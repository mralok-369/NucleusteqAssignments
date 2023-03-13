package Input_OutpotStream_with_Files;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStream_write_byte {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// creating file
			FileOutputStream file = new FileOutputStream("writebyte.txt");
			
			System.out.println("Enter how many char you want to add : ");
			int n = scanner.nextInt();
			
			// writing to the file
			System.out.println("Enter "+n+" ASCII code for character : ");
			while(n!=0) {
				int asciiCode = scanner.nextInt();
				file.write(asciiCode);
				n--;
			}
			file.close();
			System.out.println("Writing Successful....!");			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
