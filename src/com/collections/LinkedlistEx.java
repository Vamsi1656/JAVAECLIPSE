package com.collections;

import java.util.*;

public class LinkedlistEx {

	public static void main(String[] args) {
//		List<String> ll=new LinkedList();
//		Deque<String> ll=new LinkedList();
//		Queue<String> ll=new LinkedList();
		
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Nani");
		ll.add("Virat");
		ll.add("Pallavi");
		ll.add("Virat");
		ll.add("Pallavi");
		ll.add("Virat");
		ll.add("Pallavi");
		System.out.println(ll);
		
//		ll.add(2, "Vamsi");
//		System.out.println(ll);
//		
//		ll.addFirst("Sai");
//		System.out.println(ll);
//		
//		ll.addLast("Siva");
//		System.out.println(ll);
//		
//		ll.removeFirst();
//		System.out.println(ll);
//		
//		ll.removeLast();
//		System.out.println(ll);
		
		ll.removeFirstOccurrence("Pallavi");
		System.out.println(ll);
		
		ll.removeLastOccurrence("Virat");
		System.out.println(ll);
		
		

	}

}
