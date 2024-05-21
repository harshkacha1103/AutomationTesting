package Opertor;

import java.util.Scanner;

public class Firstlastdigit {
   public static void main(String[] args) 
   {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int number = sc.nextInt();
	int lastdigit = number%10;
	
	int firstdigit=number;
	while(firstdigit>=10) {
		firstdigit=firstdigit/10;
		
	}
	System.out.println("firstDigit =" + firstdigit);
	System.out.println("lastDigit =" + lastdigit);
	System.out.println("Sum =" + (firstdigit + lastdigit));
}
}
