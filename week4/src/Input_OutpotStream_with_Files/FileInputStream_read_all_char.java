package Input_OutpotStream_with_Files;

import java.io.FileInputStream;

public class FileInputStream_read_all_char {
	public static void main(String args[]){    
        try{    
          FileInputStream file = new FileInputStream("writestring.txt");  
          
          int i=0;    
          while((i=file.read())!=-1){    
           System.out.print((char)i);    
          }  

          file.close(); 
          System.out.println("\nReading Successful....!!");
          
        }catch(Exception e){
        	System.out.println(e);
        }    
     }   
}
