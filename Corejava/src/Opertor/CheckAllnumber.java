package Opertor;

import java.util.Scanner;

public class CheckAllnumber {
	 
	static int lastdigit=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number");
		int num =sc.nextInt();
	
	
	while(num>0) {
		lastdigit =lastdigit+num%10;
		num=num/10;
	}
	
	System.out.println("Sum of all digit is :"+lastdigit);
		
	}

}
