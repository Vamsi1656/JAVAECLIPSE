package com.collections;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
	   Vector v1=new Vector();
	   
	   v1.add("Vasu Anna");
	   v1.add("Naveen Anna");
	   v1.add("Nani");
	   
	   System.out.println(v1);
       Vector v2=new Vector();
	   
	   v2.add("Pallavi");
	   v2.add("Virat");
	   
	     
//	   for(int i=0;i<v2.size();i++) {
//		   v1.add(v2.get(i));
//	   }
	   
	   v1.addAll(v2);
	  
	   
	   
//	   System.out.println("Size:"+v1.size());  // No.of elements in an Array
//	   System.out.println("Capacity:"+v1.capacity()); // Total number of size like in this program total size is 40.
//	   												  // 40 is the capacity.
	 
	      System.out.println(v1);


	}

}
