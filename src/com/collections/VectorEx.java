package com.collections;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
	   Vector v1=new Vector();
	   
	   v1.add("Vasu Anna");
	   v1.add("Naveen Anna");
	   v1.add(0,"Nani");
	   v1.add(1);
	   v1.add(4.2);
	   v1.add("Vasu Anna");
	   v1.add("Naveen Anna");
	   v1.add(0,"Nani");
	   v1.add(1);
	   v1.add(4.2);
	   
	   v1.add("Virat");
	   
	   
	   for(Object v2:v1)
	   {
		   System.out.println(v2);
		     
	   }
	   
	 
	   
//	   
//	   System.out.println(v1);

	}

}
