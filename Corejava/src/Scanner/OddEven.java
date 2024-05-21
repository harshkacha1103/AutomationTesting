package Scanner;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Any number");
	int num = sc.nextInt();
	
	if(num%2==0) {
		System.out.println("number is Even");
	}
	else {
		System.out.println("number is odd");
	}
}
}
