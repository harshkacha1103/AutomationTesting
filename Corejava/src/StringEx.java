
public class StringEx 
{
	
	public static void main(String[] args) 
	{
      String s1 = "tops";//literal string
		
		String s2 = new String("tops");//object String
		
		char ch[]= {'t','o','p','s'};//character array string
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
