//WAP to reverse an array of integer values.

import java.util.Scanner;

public class Reverseinteger {
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter elements in array ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("array elements ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\narray reverse elements ");
		for(int i=a.length-1; i>=0; i--)
		{
		    System.out.println(a[i]+" ");
		}
		
		
	}

}
