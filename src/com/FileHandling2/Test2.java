package com.FileHandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
	     File file=new File("./source");
	     file.createNewFile();
	     
	     
	     FileReader fr=new FileReader(file);
	     
	     int asciicode;
	     while((asciicode=fr.read())!=-1) {
//	    	 System.out.println(scanner.next()); // It counts spaces also thats's why it takes to next line
	    	 
	    	 System.out.print((char)asciicode);
	    	 
	     }
	     fr.close();
	  
	}
   

}
