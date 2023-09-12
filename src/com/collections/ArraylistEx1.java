package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArraylistEx1 {

	public static void main(String[] args) {

		
		ArrayList<String> enames=new ArrayList<>();
		
		enames.add("Nani");
		enames.add("Virat");
		enames.add("Pallavi");
		enames.add("Vamsi");
		enames.add("Sai");
		enames.add("Siva");
		enames.add("Jaggu");
		enames.add("Koti");
		
	  System.out.println(enames);
	  
//	  Iterator itr=enames.iterator();
//	  
//	  while(itr.hasNext()) {
//		  System.out.print(itr.next()+" ");
//	  }
	  
//	  for(String ename:enames) {
//		  System.out.println(ename+" ");
//	  }
	  
	  Collections.sort(enames);
	  
	  System.out.println(enames);

	}

}
