package Construtor;


class A11
{
	void a11()
	{
		System.out.println("A1 Executed");
	}
}

class B11 extends A11
{
	void b11()
	{
		System.out.println("B1 Executed");
	}
	
}

interface C11
{
	void c11();
	
}

class D11 extends B11 implements C11
{

	void d11()
	{
		System.out.println("D1 Executed");
	}

	@Override
	public void c11() {
		// TODO Auto-generated method stub
		System.out.println("C1 Executed");
		
	}
	
}

public class Hybrid
{
	public static void main(String[] args)
	{
		
		D11 d = new D11();
		d.a11();
		d.b11();
		d.c11();
		d.d11();
		
	}
}

