import java.util.Scanner;

public class Sumofprimenumber 
{
	public static void main(String[] args) 
	{
	  System.out.println("Please enter the prime number");
	  int a = 0;
	  int sum = 0;
	  Scanner sc = new Scanner(System.in);
	  a = sc.nextInt();
	  
	  for(int i=2; i<=a;i++) 
	  {
		  Boolean isPrime = true;
		  
		  for(int j=2;j<i;j++)
		  {
			if(i%j==0) 
			{
			 isPrime = false;
			 break;
			}
		  }
		  
		  if(isPrime) {
			  System.out.println(i+ " is a prime number");
			  sum = sum+i;
		  }
	  }
	  System.out.println("sum of all prime number "  + sum);
	}

}
