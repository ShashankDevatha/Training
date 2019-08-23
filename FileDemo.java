package com.vir.file;

import java.io.FileNotFoundException;
import java.io.*;


public class FileDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {

		// TODO Auto-generated method stub
		FileReader fr= new FileReader("src/com/vir/coll/ListDemo.java");
		FileWriter fw= new FileWriter("src/com/vir/coll/ListDemo2.java");
		int ch=0;
		while(ch!=-1)
		{
			ch=fr.read();
			if(ch==1) break;
			fw.write(ch);	
		}
		fr.close();
		fw.close();
		System.out.println("File copied");
		
	}

}
