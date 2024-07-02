import java.io.FileInputStream;

public class FileEx2 {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("D://harsh.txt");
			int i =0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}	
			
		}
		
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		finally 
		{
//			System.out.println("File Read");
		}
		
	}
	
}
			

