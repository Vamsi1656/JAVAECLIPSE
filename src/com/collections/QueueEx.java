package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
//		Queue<Integer> q=new PriorityQueue<Integer>();
		
		//Creation
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		// Addition of elements-offer,add
		
		pq.offer(10);
		pq.add(6);
		pq.add(20);
		pq.offer(5);
		pq.offer(3);
		pq.offer(17);
		System.out.println(pq);
		
		//retrieval of elements
		
//		System.out.println(pq.peek());
		
		// removal of elements-poll,remove
//		
//		System.out.println(pq.poll());
//		System.out.println(pq.remove(10));
//		System.out.println(pq);
//		
		// verification of elements
		
//		System.out.println(pq.contains(6));
		
//		for(Integer elements:pq) {
//			System.out.println(elements);
//		}
//		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		

	}

}
