import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializex {
	
	
	public static void main(String[] args) throws IOException 
	{
		Student s1 = new Student(101, "Harsh");
		FileOutputStream  fout = new FileOutputStream("D://abc1.txt");
		 ObjectOutputStream out = new ObjectOutputStream(fout);
	     out.writeObject(s1);
	     System.out.println("success");
		
	}

}
