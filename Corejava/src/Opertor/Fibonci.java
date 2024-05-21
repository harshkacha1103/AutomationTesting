package Opertor;

import java.util.Scanner;

public class Fibonci {
	public static void main(String[] args) 
	{
		int temp,a=0,b=1,c;
		System.out.println("Enter temp:");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextInt();
		
		for(int i=1;i<=temp;i++) 
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
