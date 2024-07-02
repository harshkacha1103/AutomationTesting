package com.seralize;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx
{
	public static void main(String[] args) 
	{
		
		ArrayList arrayList = new ArrayList<>();
		
		arrayList.add('A');
		arrayList.add(1);
		arrayList.add("B");
		arrayList.add("PQRS");
		
		ArrayList arrayList2 = new ArrayList<>();
		
		arrayList2.add("PQRS");
		arrayList2.add("MN");
		arrayList2.add("ABCD");
		arrayList2.add("WERT");
		
		
		//arrayList.addAll(arrayList2);
		//arrayList.remove(1);
		//arrayList.remove("MN");
		//arrayList.removeAll(arrayList2);
		//System.out.println(arrayList);
		arrayList.retainAll(arrayList2);
		
		Iterator i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}