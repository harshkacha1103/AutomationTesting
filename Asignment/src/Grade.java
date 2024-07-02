//W.A.J.P. which will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD
//<=40 Fail



import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int java,php,html,css,c;
		float total,Percentage;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		java = sc.nextInt();	
		php = sc.nextInt();	
		html = sc.nextInt();	
		css = sc.nextInt();	
		c = sc.nextInt();	
		
		total = java + php + html + css + c;
	    Percentage = (total / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
	
	
	if(Percentage >= 90)
    {
		System.out.println("\n Grade AA");
	}
	else if(Percentage >= 80)
    {
		System.out.println("\n Grade AB");
	}
	else if(Percentage >= 70)
    {
		System.out.println("\n Grade BB");
	}
	else if(Percentage >= 60)
    {
		System.out.println("\n Grade BC");
	}

	else if(Percentage >= 50)
    {
		System.out.println("\n Grade CD");
	}
	
	else if(Percentage >= 40)
    {
		System.out.println("\n Grade DD");
	}
	else 
    {
		System.out.println("\n Fail");
	} 
}
}


