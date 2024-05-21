package Scanner;

import java.util.Scanner;

public class Year {
public static void main(String[] args) {
  
	int a;
	System.out.println("Enter any year");
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	
	if(a%100==0 && a%400==0 || a%100!=0 && a%4==0) 
	{
		System.out.println("Leap year");
	}
	
	else 
	{
		System.out.println("Not leap year");
	}

}
}
