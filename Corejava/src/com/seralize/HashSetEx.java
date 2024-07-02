package com.seralize;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	
	public static void main(String[] args) {
		
	   HashSet set = new HashSet<>();
	   
	   set.add("Abcd");
		set.add('A');
		set.add(1);
		set.add("B");
		set.add("PQRS");
		set.add("PQRS");
		set.add("MNP");
		set.add("XYZ");
		
		Iterator i = set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
	}

}
