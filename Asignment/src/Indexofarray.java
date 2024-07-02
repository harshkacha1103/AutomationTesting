//WAP to find the index of an array element.

import java.util.Scanner;

public class Indexofarray 
{
	public static void main(String[] args) 
	{
	  int a[] = new int[5];
	  int n,count=0;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Elements in Array ");
	  
	  for(int i = 0; i<a.length; i++)
	  {
		a[i]=sc.nextInt();  
	  }
	  
	  System.out.println("Array Elements ");
	  
	  for(int i = 0; i<a.length; i++)
	  {
		  System.out.println(a[i]+ " ");
	  }
	  
	  System.out.println("Enter Search Elements ");
	  n=sc.nextInt();
	  
	  for(int i=0; i<a.length; i++)
	  {
		  if(a[i]==n)
		  {
			  count++;
		  }
	  }
	  
	   if(count>0)
		   System.out.print("Item Found "+ count + " times" );
	   
	   else
		   System.out.print("Item not Found");
   }

}
