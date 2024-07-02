//WAP to demonstrate try catch block.



public class Trycatch 
{
	
	public static void main(String[] args) 
	{
		
		try {
			int data = 10/0;
			System.out.println(data);
			
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		finally 
		{
			System.out.println("Executed");
		}
	}

}
