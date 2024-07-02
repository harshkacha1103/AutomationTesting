//WAP to create one thread by extending Thread class in another Class




class Mythread extends Thread
{
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Child Thread");
		}
	}
}


public class Extending {
  public static void main(String[] args) {
	
	  Mythread t = new Mythread();
	  t.start();
	  
	  for(int i=0; i<5; i++)
		{
			System.out.println("main Thread");
		}
	  
}
}
