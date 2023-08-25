package com.FileHandling1;

import java.io.File;
import java.util.Arrays;

public class FH {

	public static void main(String[] args) {
		File file=new File("D:\\JavaEclipse\\src\\com");
//		System.out.println((Arrays.toString(file.list())));// If you want to print file names in particular directory.
		
		System.out.println((Arrays.toString(file.listFiles()))); // Path of each file in directory.
		
//		System.out.println(file.getName()); // File name
		
//		System.out.println(file.getAbsolutePath()); // entire path
		

	}

}
