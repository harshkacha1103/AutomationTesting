package Construtor;


class Bank
{
	void bank()
	{
		System.out.println("Banking");
	}
}

class Current extends Bank
{
	void current() 
	{
		System.out.println("current");
	}
}

class Save extends Bank
{
   void save() 
   {	
	   System.out.println("saving");
   }
	
}

public class Hierechial {
	
	public static void main(String[] args) {
		Current c = new Current();
		Save  s = new Save();
		
		c.current();
		s.bank();
		c.bank();
		
	}

}
