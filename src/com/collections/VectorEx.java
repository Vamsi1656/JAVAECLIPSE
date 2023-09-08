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
	   v2.add("Nani");
	   
	   Vector v3=new Vector();
	   
	   v3.add("Virat");
	   v3.add("Pallavi");
	   
	     
//	   for(int i=0;i<v2.size();i++) {
//		   v1.add(v2.get(i));
//	   }
	   
	   
	   // Add method();
	   v1.addAll(v2);
	   
//	   System.out.println(v1);
	   
	   //Retrival method();
	   
	   System.out.println(v1.get(2));
	   
//	   System.out.println("Size:"+v1.size());  // No.of elements in an Array
//	   System.out.println("Capacity:"+v1.capacity()); // Total number of size like in this program total size is 40.
//	   												  // 40 is the capacity.
	 
	   
	   // Remove method();
	   
	   v1.remove(0); // remove particular index element.
//	   System.out.println(v1);
	   
//	   v1.remove("Virat"); // removes the given element
//	   System.out.println(v1);
	   
//	   v1.removeAll(v2);  // it removes all the elements in v2.
//	   System.out.println(v1);
//	   
//	   v1.clear();  // it clears the whole list.
//	   System.out.println(v1);
	   
	   
	   // Verify method();
	   
//	   System.out.println(v1.contains("Nani"));
//	   
//	   System.out.println(v1.containsAll(v2));
//	   
//	   System.out.println(v1.containsAll(v3)); // there is no imp in order it only see the elements.
	   
	   
	   //Updation method();
	   
	   v1.set(3, "Vamsi");
//	   System.out.println(v1);
	   
	   
	   // To get an index of particular element.
	   
	   System.out.println(v1.indexOf("Nani"));
	   System.out.println(v1.lastIndexOf("Nani"));
	   
	   Object[] arr=v1.toArray();
	   
	   System.out.println(Arrays.toString(arr));
	   
	   System.out.println(v1.firstElement());
	   System.out.println(v1.lastElement());


	}

}
