package com.FileHandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
	     File file=new File("./source");
	     file.createNewFile();
	     
	     FileInputStream fis=new FileInputStream(file);
	     
//	     System.out.println(fis.read()); // It returns the ASCII value of the characters.It gives only single character value.

//	     System.out.println((char)fis.read()); // It gives the character.
	     
	     int asciicode;
	     
	     while((asciicode=fis.read()) !=-1){
	     System.out.print((char)asciicode);
	}
	
	  fis.close();
	}
   

}
