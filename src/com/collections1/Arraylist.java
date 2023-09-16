package com.collections1;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(4);
		
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		
		System.out.println(al);
		
		al.ensureCapacity(20); //The ensureCapacity() method is used to increase the capacity of this ArrayList instance, if necessary, 
		                       //to ensure that it can hold at least the number of elements which is not smaller than the specified size.

        al.add(105);
		System.out.println(al);
      
		ArrayList al1=new ArrayList();
		
		al1.add(105);
		al1.add(106);
		al1.add(107);
		al1.add(108);
		
		Integer i=new Integer(30);
        int hashvalue= i.hashCode();
        System.out.println(hashvalue);
        
      
		
		
	}

}
