package com.collectionsExamples;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LinkedListExample3 {

	public static void main(String[] args) {
		// Split a list into two lists
		
		LinkedList<Integer> ll=new LinkedList<>();
				
		
		
	    ll.add(4);
	    ll.add(9);
	    ll.add(8);
	    ll.add(5);
	    ll.add(0);
	    ll.add(10);
	    
//	    System.out.println(ll);
	    List<Integer> head=ll.subList(0, 3);
		List<Integer> tail=ll.subList(3, 6);
		tail.add(100);
		
//	    System.out.println(head);
		System.out.println(tail);
	    
	    Map<String, Integer> mp = new HashMap<String, Integer>();
	    mp.put("One", 1);
	    
	    mp.entrySet().forEach(System.out::println);

	}

}
