package Scanner;

import java.util.Scanner;

public class newclass {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Your Email");
	String email = sc.next();
	
	System.out.println("Enter Your password");
	String pass = sc.next();
	
	System.out.println("Enter Your confpassword");
	String confpass = sc.next();
	
	if(pass.equals(confpass))
	{
		System.out.println("sign up succesful");
	}
	
	else {
		System.out.println("sign up unsuceesuful");
	}
	
	}
  
}
