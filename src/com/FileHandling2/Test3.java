package com.FileHandling2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) throws IOException {
	     File file=new File("./source");
	     file.createNewFile();
	     
	     FileReader fr=new FileReader(file);
	     
	     BufferedReader br=new BufferedReader(fr);
	     
	     
	     int asciicode;
	     while((asciicode=br.read())!=-1) {
//	    	 System.out.println(scanner.next()); // It counts spaces also thats's why it takes to next line
	    	 
	    	 System.out.print((char)asciicode);
	    	 
	     }
	     br.close();

	}
   

}
