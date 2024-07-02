package Construtor;

public class Staticmethod {
	
		int id;
		String name;
		static String college ="xyz";
		static String sc ="abcd";
		
		public Staticmethod(int id,String name) 
		{
			// TODO Auto-generated constructor stub
			this.id=id;
			this.name=name;
		
		}
		
		void display()
		{
			System.out.println(id+" "+name+" "+ college +" "+ sc );
		}
		
		static void change()
		{
			college ="Harsh";
			sc ="Kacha";
			
			//System.out.println(id+" "+name);
		}
		
		public static void main(String[] args) 
		{
		      change();
			
			Staticmethod s1 = new Staticmethod(101,"H");
			Staticmethod s2 = new Staticmethod(102,"a");
			Staticmethod s3 = new Staticmethod(103,"r");
			Staticmethod s4 = new Staticmethod(104,"s");
			Staticmethod s5 = new Staticmethod(105,"H");
			
			s1.display();
			s2.display();
			s3.display();
			s4.display();
			s5.display();
			
		}

}
