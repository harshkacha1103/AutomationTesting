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


