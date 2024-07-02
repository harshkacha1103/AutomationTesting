abstract class Parentt 
{
	abstract void message();
}

class Subclass1 extends Parentt {

	@Override
	void message() {
		System.out.println("This is first subclass");
	}

}

class Subclass2 extends Parentt {

	@Override
	void message() {
		System.out.println("This is second subclass");

	}

}



public class Abstract 
{
	public static void main(String[] args) 
	{
		
		Subclass1 sub1 = new Subclass1();
		sub1.message();
		Subclass2 sub2 = new Subclass2();
		sub2.message();
	}
	

}
