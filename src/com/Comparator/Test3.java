package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;



public class Test3 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Nani");
		al.add("Virat");
		al.add("Pallavi");
		al.add("Vamsi");
		al.add("Sai");
		al.add("Siva");
		al.add("Vasu Anna");
		al.add("Naveen Anna");
		al.add("DSP");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
