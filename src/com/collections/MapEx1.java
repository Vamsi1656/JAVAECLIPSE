package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<Integer,String> m=new Hashtable<>();
		m.put(101,"Nani");
		m.put(102,"Virat");
		m.put(103,"Pallavi");
		m.put(104,"Vamsi");
		m.put(105,"Sai");
		m.put(106,"Siva");
		m.put(107,"Jaggu");
		m.put(108,"Vasu Anna");
		m.put(109,null);
		m.put(110,null);
		
		System.out.println(m);

	}

}
