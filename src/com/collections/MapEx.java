package com.collections;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class MapEx {

	public static void main(String[] args) {
		
		// Creation of map
		Map<Integer,String> m=new TreeMap<>();
		
		// Add elements in the map 
		m.put(101,"Nani");
		m.put(102,"Virat");
		m.put(103,"Pallavi");
		m.put(104,"Vamsi");
		m.put(105,"Sai");
		m.put(106,"Siva");
		m.put(107,"Jaggu");
		m.put(108,"Vasu Anna");
		m.put(109,"Naveen Anna");
		m.put(110,"Koti Anna");
//		System.out.println(m);
		
		// Retrieval of keys from the map
		
//		Set<Integer> keys=m.keySet();
//		for(Integer key : keys) {
//			System.out.println(key);
//		}
		
		// Retrieval of values from the map
		
//		Collection<String>values=m.values();
//		for(String value:values) {
//			System.out.println(value);
//		}
		// Retrieval of values from the map based on map
//		System.out.println(m.get(107));
		
	    // Retrieval of keys and values from the map
//		
//		for(Integer key:keys) {
//			System.out.println(key+">>>>>>"+m.get(key));
//		}
		
		// Deletion of elements in the map
//		System.out.println(m);
//		m.remove(110);
//		m.remove(110, "Koti Anna");
//		System.out.println(m);
		
		// Verification of keys and values in the map
		
//		System.out.println(m.containsKey(103));
//		System.out.println(m.containsValue("Vamsi"));
		
		
		//Updation if elements in the map
		
//		System.out.println(m);
//		
//		m.put(110, "DSP");
//		
//		System.out.println(m);
		
		// If we want to insert some key into the map we don't know it is there or not but it is there it leads to
		// updation.So we have to restrict it by using 
		
//		m.putIfAbsent(110, "Karthik");
//		System.out.println(m);
		
		// For updation we use Replace method also
		
//		m.replace(110, "Gopi");
//		System.out.println(m);
		
		// We want to return both keys and values from the map.There are two methods i.e;
		// first used the keyset method and get the keys and iterate the keys.(or)
		// We can use entry set also to return the both keys and values.
		
		Set<Entry<Integer,String>> entries=m.entrySet();
		for(Entry<Integer,String>entry:entries) {
			Integer key=entry.getKey();
			String values=entry.getValue();
			System.out.println(key+">>>>>>>"+values);
//			System.out.println(entry);
		}
		
		
		
		
	}

}
