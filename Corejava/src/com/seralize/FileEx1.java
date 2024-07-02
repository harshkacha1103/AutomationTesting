package com.seralize;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileEx1 {
   public static void main(String[] args) throws IOException {
	FileWriter fw =  new FileWriter("D://tops.txt");
	fw.write("hfdsgh");
	fw.close();
	
	
	FileReader fr = new FileReader("D://tops.txt");
	int i=0;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	
}
}
