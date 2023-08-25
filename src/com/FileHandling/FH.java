package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class FH {

	public static void main(String[] args) throws IOException {
//		File file=new File("D:\\FileHandling\\vamsi.txt"); This is Absolute path which path fully taken from the system.		
		
//		File file=new File("./resume"); // This is relative path taken from the project itself.
//		if(file.exists()) {
//			file.delete();
//		}
//		System.out.println(file.createNewFile());
//		System.out.println(file.exists()); // it shows file is there or not in the folder.
//		System.out.println(file.delete()); // it can delete a file,at the time execute it shows boolean value.
//		System.out.println(file.createNewFile()); it can create a file,at the time execute it shows boolean value.
//		System.out.println(file.isHidden()); // the file is in hidden or not.
		
//		System.out.println(file.canWrite()); // the file is in read only we cannot write anything. 
//		file.setWritable(true); // we can write something when it is true and we can't write when it is false.
//		System.out.println(file.canWrite());
		
//		
//		File file=new File("./Vamsi/Nani");
//		System.out.println(file.mkdir()); // Creation of Folder.mkdir means when we want to create 
		                                  // only one folder or last folder we use mkdir.
		
		File file=new File("./Nani/Virat/Vamsi");
		// System.out.println(file.mkdirs()); // With mkdirs we create multiple folders.
		 if(file.exists()) {
			file.delete();
		System.out.println(file.exists());
			
		 }
		 
		}

}
