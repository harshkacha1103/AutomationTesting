import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx 
{
   public static void main(String[] args) throws IOException 
   {
	   
	
	    String s ="welcome to Harsh";
	    
	    FileOutputStream fout = new  FileOutputStream("D://harsh.txt");
	    fout.write(s.getBytes());
	    

   }
}
