
public class StringEx4 
{
   public static void main(String[] args) 
   {
	 String s1 = "sachin";
	 String s5 = "TOPS";
	 String l1 ="  laptop  ";
	 String data = "Java is a programming language. Java is a platform";

	    System.out.println(s1.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(l1.trim());
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("s"));
		System.out.println(s1.charAt(0));
		System.out.println(data.replace("Java","Php"));

   }
}
