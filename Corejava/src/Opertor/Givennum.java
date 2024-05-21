package Opertor;

import java.util.Scanner;

public class Givennum {
  public static void main(String[] args) {
	int num;
	System.out.println("Enter number of table");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	
	for(int i=1; i<=10;i++)
		System.out.println(num + " * " + i + " = " + (num * i));
}
}
