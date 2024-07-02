package com.seralize;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		
		Vector v = new Vector<>(5);
		
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		v.addElement("d");
		v.addElement("d");
		v.addElement("c");
		v.addElement("d");
		v.addElement("d");
		v.addElement("d");
		v.addElement("d");
		v.addElement("e");
		v.addElement("f");

		
		System.out.println("Capacity: "+v.capacity());
		System.out.println("Size: "+v.size());
		
		
		Iterator i = v.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
		
}


