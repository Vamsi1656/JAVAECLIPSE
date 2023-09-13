package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Vasu Anna");
		hs.add("Naveen Anna");
		hs.add("Vamsi");
		hs.add("Siva");
		hs.add("Koti");
		
		System.out.println(hs);
		
		
		System.out.println(hs.contains("Vamsi"));
		
	}

}
