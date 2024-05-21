package Scanner;

import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		
		int a,b,c,d,e;
		System.out.println("Enter marks of five subjects");
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		System.out.println("Total marks"+sum);
		
		int per = sum/5;
		System.out.println("percentage "+ per);
		
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}

}
