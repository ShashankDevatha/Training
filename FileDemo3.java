package com.vir.file;
import java.util.*;
import java.io.*;

public class FileDemo3 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileReader fr= new FileReader("src/com/vir/file/abc.txt");
		FileWriter fw= new FileWriter("src/com/vir/file/abccopy.txt");
		BufferedReader br=new BufferedReader(fr);
		int sum=0;
		String line=br.readLine();
		while(line!=null)
		{
		}
		fr.close();
		fw.close();
		//sc.close();


	}
	}

}
