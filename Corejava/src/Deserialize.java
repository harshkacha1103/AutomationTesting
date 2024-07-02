import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
   public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	  ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://abc1.txt"));
	  Student s = (Student) in.readObject();
	  System.out.println(s.id+" "+s.name);
}
}
