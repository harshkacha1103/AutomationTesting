
public class ThrowEx 
{
	
	static void vaildate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Valid age");
		}
		
		else 
		{
			System.out.println("welcome to vote");
		}
	}
	
	public static void main(String[] args) 
	{
		 vaildate(12);
		
	}

}
