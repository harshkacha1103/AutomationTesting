package Scanner;

import java.util.Scanner;

public class Userinput {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Firstname");
		String fname = sc.next();
		
		System.out.println("Enter your Lastname");
		String lname = sc.next();
		
		System.out.println("Enter your Email");
		String email = sc.next();
		
		System.out.println("Enter your password");
		String pass = sc.next();
		
		if(pass.equals("1234")) {
			System.out.println("welcome" + email);
		}
		
		else {
			System.out.println("Invaild credenties");
		}
		
	}

}
