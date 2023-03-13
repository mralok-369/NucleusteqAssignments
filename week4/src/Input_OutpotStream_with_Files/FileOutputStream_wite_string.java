package Input_OutpotStream_with_Files;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileOutputStream_wite_string {
	public static void main(String args[]){   
		Scanner scanner = new Scanner(System.in);
		
        try{    
        	//creating file
        	FileOutputStream file = new FileOutputStream("writestring.txt"); 
        	
        	// taking input to write in file
        	System.out.println("Enter sentence to write in file : ");
        	String s = scanner.nextLine();    
        	
        	byte b[]=s.getBytes();//converting string into byte array    
        	file.write(b);    // writing 
        	file.close();    // closing the file
        	
        	System.out.println("Writing Successful...!!");    
        	
         } catch(Exception e){
        	 System.out.println(e);
        }    
   }    
}
