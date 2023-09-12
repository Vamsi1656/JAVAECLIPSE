package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistEx {

	public static void main(String[] args) {
//		ArrayList<Integer> a=new ArrayList<>(200); // We can give the default capacity.
//		System.out.println(a); // By default the arraylist capacity is 0.
		
		Integer[] arr=new Integer[] {10,20,30,40,50};
		ArrayList<Integer> a=new ArrayList<>(Arrays.asList(arr));
		
		a.add(5);             // After adding min one element the capacity increses to 10.
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(0);
		a.add(11);   // After reaching the capacity of 10 it will increase to only 50% i.e.15.
		
		System.out.println(a);
		System.out.println(a.size());
		
//		for(int i=0; i<a.size();i++) {
//			System.out.print(a.get(i)+ " ");
//		} 
		
		for(Integer integer : a) {
			System.out.print(integer + " ");
		}

	}

}
