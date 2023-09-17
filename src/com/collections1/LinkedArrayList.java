package com.collections1;

import java.util.LinkedList;

public class LinkedArrayList {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(101);
		ll.add(102);
		ll.addFirst(103);
		ll.add(104);
		ll.addLast(105);
		
		ll.add(2, 106);
		
		
		System.out.println(ll);
		
		
		LinkedList ll1=new LinkedList();
		ll1.add(101);
		ll1.add(102);
		ll1.add(103);
		ll1.add(104);
		ll1.add(105);
		
		System.out.println(ll1);
		
//		for(Object hi:ll) {
//			System.out.println(hi);
//		}
		
		ll.addAll(ll1);
		
		System.out.println(ll);
		
		ll.spliterator();
		
	}

}
