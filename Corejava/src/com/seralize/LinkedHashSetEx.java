package com.seralize;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
   public static void main(String[] args) {
	
	   LinkedHashSet set =  new LinkedHashSet<>();
	   
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
