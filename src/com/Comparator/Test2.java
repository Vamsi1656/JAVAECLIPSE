package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator1 implements Comparator<Integer>{

	
	public int compare(Integer I1,Integer I2) {
		
		return (I1>I2)?-1:(I1<I2)?+1:0;
//		if(I1>I2) {
//			return +1;
//		}
//		else if(I1<I2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
		
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(75);
		al.add(23);
		al.add(12);
		al.add(55);
		al.add(88);
		al.add(43);
		al.add(10);
		System.out.println(al);
		Collections.sort(al,new MyComparator1());
		System.out.println(al);

	}

}
