//WAP to Copy one array into another


import java.util.Iterator;
import java.util.Scanner;

public class Copyarray {
	
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int b[]=new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value in first array ");
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("First array Elements ");
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\n  Second array Elements ");
		
		for(int i=0; i<5; i++)
		{
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
	}

}
