//WAP to concatenate a given string to the end of another string.


public class ConcatString 
{
	public static void main(String[] args) {
		String str1 = "Harsh ";
		String str2 = "Kacha";
 
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2); 
 
		String str3 = str1.concat(str2);
		System.out.println("Concatenated string: " + str3);
	}

}
