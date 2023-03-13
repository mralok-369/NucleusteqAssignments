package Input_OutpotStream_with_Files;

import java.io.FileInputStream;

public class FileInputStream_read_single_char {
	public static void main(String args[]){    
        try{    
          FileInputStream file = new FileInputStream("writebyte.txt");    
          int i = file.read();  
          System.out.println((char)i);    

          file.close(); 
          System.out.println("Reading Successful....!!");
          
        }catch(Exception e){
        	System.out.println(e);
        }    
     }    
}
