package com.collections;

import java.util.Arrays;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
//		Vector v1=new Vector(20);
		
//		System.out.println(v1);
		
		Object[] arr=new Object[] {1,2,3,4,5};
		
//		Vector v1=new Vector(Arrays.asList(arr));
		
		Vector <Integer> v1=new Vector<>(); // Generics are used to specify the datatype.
											// Only non primitive datatypes only allowed.
											// Because in non primitive datatypes we create the objects.
											// We cannot create objects by using primitive datatypes.
											// Wrapper classes are used in generics. 
		
		v1.add(12);
		v1.add(null);
		v1.add(null);
		v1.add(12);
		
		System.out.println(v1);
		
		System.out.println(v1.size());
		
		System.out.println(v1.capacity());

	}

}
