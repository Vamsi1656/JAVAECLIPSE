package com.FileHandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
	     File file=new File("./source");
	     file.createNewFile();
	     
	     
	     Scanner scanner=new Scanner(file);
	     
	     while(scanner.hasNextLine()) {
//	    	 System.out.println(scanner.next()); // It counts spaces also thats's why it takes to next line
	    	 
	    	 System.out.println(scanner.nextLine());
	    	 
	     }
	     scanner.close();
	  
	}
   

}
