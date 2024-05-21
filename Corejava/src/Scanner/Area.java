package Scanner;

import java.util.Scanner;

public class Area 
{
  public static void main(String[] args) {
	 double PI=3.14,area;
	int a;
	System.out.println("Enter of Radius of Circle");
	Scanner sc = new Scanner(System.in); 
	a=sc.nextInt();//a==4
	
	area=PI*a*a;//3.14*4*4
	System.out.println("Area of Circle"+area);
}  
}
