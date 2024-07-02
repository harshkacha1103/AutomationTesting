package com.seralize;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx 
{
   public static void main(String[] args) 
   {
	
	    LinkedList linkedlist = new LinkedList<>();
		
		linkedlist.add('A');
		linkedlist.add(1);
		linkedlist.add("B");
		linkedlist.add("PQRS");
		
		LinkedList linkedlist2 = new LinkedList<>();
		
		linkedlist2.add("PQRS");
		linkedlist2.add("MN");
		linkedlist2.add("ABCD");
		linkedlist2.add("WERT");
		
		linkedlist.addFirst("V");
		linkedlist.addLast("P");
		
		//linkedlist.addAll(linkedlist2);
		//arrayList.remove(1);
		//arrayList.remove("MN");
		//arrayList.removeAll(arrayList2);
		//System.out.println(arrayList);
		//linkedlist.retainAll(linkedlist2);
		
		Iterator i = linkedlist.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	   
}
}
