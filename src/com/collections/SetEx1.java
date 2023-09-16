package com.collections;

import java.util.TreeSet;

public class SetEx1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(67);
		ts.add(89);
		ts.add(3);
		ts.add(54);
		ts.add(23);
		ts.add(12);
		
		System.out.println(ts);

//	    System.out.println(ts.subSet(3, true, 89, false));
//	    System.out.println(ts.subSet(3, false, 89, true));
//	    System.out.println(ts.subSet(3, true, 89, true));
	    System.out.println(ts.subSet(12, true, 54, false));
		

	}

}
