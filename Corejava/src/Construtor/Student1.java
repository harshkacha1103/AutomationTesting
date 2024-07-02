package Construtor;

public class Student1 {
	int id;
	String name;
	
	public static void main(String[] args) {
		
       Student1 s1 = new Student1();
       Student1 s2 = new Student1();
       Student1 s3 = new Student1();
       
     //assign value
     		s1.id=101;
     		s1.name="harsh";
     		
     		s2.id=102;
     		s2.name="anjali";
     		
     		s3.id=103;
     		s3.name="ajay";
     		
     		//print value
    		System.out.println(s1.id+" + "+s1.name);
    		System.out.println(s2.id+" + "+s2.name);
    		System.out.println(s3.id+" + "+s3.name);
       
	}

}
