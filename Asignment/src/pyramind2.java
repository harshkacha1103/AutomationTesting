
public class pyramind2 
{
	
	public static void main(String[] args) 
	{
		for(int r = 1; r<=5; r++) 
		{
			for(int c=1; c<=5; c++) 
			{
				if(c == 3 || r == 3 ||(r==2 & c>1 & c<5) ||(r==4 & c>=2 & c<=4))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
		
 }
	
	
}


