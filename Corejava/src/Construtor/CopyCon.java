package Construtor;

public class CopyCon {
  int id;
  String name;
  
  CopyCon(int id,String name)
  {
	this.id=id;
	this.name=name;
  }
  
  CopyCon(CopyCon c1){
	  System.out.println(c1.id +" " + c1.name);
  }
  
  void display() {
	  System.out.println(id + " " + name);
  }
 
  public static void main(String[] args) 
  {
	CopyCon c1 = new CopyCon(101,"Harsh");
	CopyCon c2 = new CopyCon(c1);
	
	c1.display();
}
  
}
