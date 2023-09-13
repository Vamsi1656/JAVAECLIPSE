package com.collectionsExamples;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		 LinkedList<Integer> ll=new LinkedList<>();
         ll.add(4);
         ll.add(5);
         ll.add(0);
         ll.add(9);
         ll.add(8);
         ll.add(10);
         System.out.println("Input:"+ll);
         int sum=0;
         for(int i=0;i<ll.size();i++)
         {
        	 sum+=ll.get(i);
         }
         System.out.println("Sum:"+sum);
         System.out.println("Average:"+sum/ll.size());
	 
	}

}
