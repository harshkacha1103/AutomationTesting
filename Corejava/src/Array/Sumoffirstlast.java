package Array;

import java.util.Scanner;

public class Sumoffirstlast 
{
	public static void main(String[] args) 
	   {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		
		
		int lastdigit = num % 10;//4
		
		int firstdigit=num;
		
		while(firstdigit>=10) 
		{
			firstdigit=firstdigit/10;
			
		}
		
		System.out.println("firstdigit = " + firstdigit);
		System.out.println("lastdigit = "  + lastdigit);
		System.out.println("Sum of all digit =" + (firstdigit + lastdigit));
	}

}
