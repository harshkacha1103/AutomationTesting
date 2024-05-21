package Scanner;

import java.util.Scanner;

public class Areaoftringle {
 public static void main(String[] args) 
 {
	int height,base,area;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the height of the triangle ::");
    height = sc.nextInt();
    System.out.println("Enter the base of the triangle ::");
    base = sc.nextInt();
    area = (height* base);
    System.out.println("Area of the triangle is ::"+area);
	
}
}
