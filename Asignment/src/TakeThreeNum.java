//W.A.J.P to Take three numbers from the user and print the greatest
//number.



import java.util.Scanner;

public class TakeThreeNum 
{
   public static void main(String[] args) 
   {
	   int a, b, c;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the first number:");
       a = sc.nextInt();
       System.out.print("Enter the second number:");
       b = sc.nextInt();
       System.out.print("Enter the third number:");
       c = sc.nextInt();
       if(a > b && a > c)
       {
           System.out.println("Greatest number is:"+a);
       }
       else if(b > c)
       {
           System.out.println("Greatest number is:"+b);
       }
       else
       {
           System.out.println("Greatest number is:"+c);
       }
}
}
