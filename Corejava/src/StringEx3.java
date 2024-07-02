
public class StringEx3 

{
	
    public static void main(String[] args)
	
	{
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = new String("sachin");
		String s4 = "tops";
		String s5 = "SACHIN";
		
		System.out.println("-------------------------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
		System.out.println("-------------------------------");
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s5));
		
		System.out.println("-------------------------------");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		
		System.out.println("-------------------------------");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
