package Construtor;

public class ParaEx2 {
	int id;
	String name;
	
	public ParaEx2(int id,String name) 
	{
		// TODO Auto-generated constructor stub
		//this - refrence keyword
		this.id = id;
		this.name = name;
		
	}
	public ParaEx2(ParaEx2 p1) 
	{
		
		System.out.println(p1.id+" "+p1.name);
	}
	
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		ParaEx2 p1 = new ParaEx2(101,"Harsh");
		ParaEx2 p2 = new ParaEx2(p1);
	
		p1.display();
		//p2.display();
	}
}
