package Construtor;

class Color
{
	String color ="black";
}

class color2 extends Color{ 
	String  color ="white";
	
	void show() {
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx {
	public static void main(String[] args) {
		color2  c = new color2();
		c.show();
	}

}
