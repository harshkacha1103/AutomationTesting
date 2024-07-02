package Construtor;

import java.util.Scanner;

public class Student2 
{
	//data members	
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		//object creation
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		Student2 s3 = new Student2();
		
		//assign value
		Scanner sc = new Scanner(System.in);
		
		s1.id =  sc.nextInt();
		s1.name = sc.next();
		
		
		//print value
		System.out.println(s1.id +" "+ s1.name);
		//System.out.println(s2.id+" "+s2.name);
		//System.out.println(s3.id+" "+s3.name);
		
		
		
		
	}
	
}

