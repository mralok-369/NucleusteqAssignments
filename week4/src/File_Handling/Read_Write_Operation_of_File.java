package File_Handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Read_Write_Operation_of_File {
	public static void main(String[] args) {
		
		// Creating a new file
		File myFile = new File("temp.txt");
		try {
            myFile.createNewFile();
            System.out.println("File created");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
		
		// Writing to a file
		 try {
	            FileWriter fileWriter = new FileWriter(myFile);
	            fileWriter.write("This is our first file from the java language.\n ok bye now");
	            System.out.println("writed in to the file");
	            fileWriter.close();
	        } catch (IOException e) {
	            System.out.println("Unable to write");
	            e.printStackTrace();
	        }
		
		
		// Reading a file
        try {
        	System.out.println("\n Reading the file \n");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        
        // deleting a file
//        if(myFile.delete()){
//        	System.out.println("Deleting the file....");
//            System.out.println("Deleted: " + myFile.getName());
//        }
//        else{
//            System.out.println("Some problem occurred while deleting the file");
//        }
        
        
		
	}
}
