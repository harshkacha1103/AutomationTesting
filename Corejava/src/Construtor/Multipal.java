package Construtor;

interface A111
{
	void a111();//abstract method
}
interface B111
{
	void b111();
}

class C111 implements A111,B111
{

@Override
public void b111() {
	// TODO Auto-generated method stub
	System.out.println("b111");
}

@Override
public void a111() {
	// TODO Auto-generated method stub
	System.out.println("a111");
}

//public void D111() {
//	System.out.println("D111");
//}


}

public class Multipal
{
	public static void main(String[] args) 
	{
		C111 c111 = new C111();
		c111.a111();
		c111.b111();
	}
}

