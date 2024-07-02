package com.seralize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Desrialize {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream  in = new ObjectInputStream(new FileInputStream("D://harsh1.txt"));
		Student s = (Student) in.readObject();
	    System.out.println(s.id+" "+s.name);
	}

}
