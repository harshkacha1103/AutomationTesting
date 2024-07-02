//WAP to calculate the average value of array elements.


import java.util.Scanner;

public class Averageofarray {
	
	public static void main(String[] args) 
	{
		int a[] = new int[5];
	    int sum = 0;
	    double avg;
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Elements ");
		
		
		for(int i = 0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
		
//		System.out.println("Array Elements ");
		
//		for(int i = 0; i<5; i++)
//		{
//			System.out.println(a[i]+ " ");
//		}
		
		for(int i = 0; i<5; i++)
		{
			sum = a[i]+sum;
		}
		
		avg = sum/5;
		System.out.println("Addition of sum " + sum);
		System.out.println("Addition of ave " +avg);
		
	
		
	}

}
