package com.collections;

import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		new Object(); // It creates dummy object in places of values in Hashmap.
//		HashSet<String> hs=new HashSet<>(); // Internally uses HashMap
//		LinkedHashSet<String> lhs=new LinkedHashSet<>(); // Internally uses LinkedHashMap
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Vasu Anna");  // Values are stored in keys place in Hashmap
		ts.add("Naveen Anna");
		ts.add("Vamsi");
		ts.add("Siva");
		ts.add("Koti");
		
		System.out.println(ts);
//		
//		System.out.println(ts.descendingSet());
//		
//		System.out.println(ts.subSet("Koti", "Vasu Anna"));
//		
		System.out.println(ts.subSet("Koti", true, " Vasu Anna", false));
		

		
	}

}
