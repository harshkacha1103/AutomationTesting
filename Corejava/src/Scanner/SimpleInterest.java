package Scanner;

import java.util.Scanner;

public class SimpleInterest {
	   public static void main(String args[]) 
	    {
	       
	        Scanner sc = new Scanner(System.in);
	      
	        int p, r, t, si;
	        
	        System.out.println("Enter the Principal : ");
	        p = sc.nextInt();     
	        
	        System.out.println("Enter the Rate of interest : ");
	        r = sc.nextInt();   
	        
	        System.out.println("Enter the Time period : ");
	        t = sc.nextInt();
	    
	        
	        si = (p * r * t) / 100;
	        
	        System.out.println("Simple Interest is: " +si);
	    }
}
