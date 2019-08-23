package com.vir.file;
import java.io.*;

public class FileDemo2 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		FileReader fr= new FileReader("src/com/vir/file/abc.txt");
		FileWriter fw= new FileWriter("src/com/vir/file/abccopy.txt");
		BufferedReader br=new BufferedReader(fr);
		
		
		int ch=0;
		while(ch!=-1)
		{
			ch=fr.read();
			if(ch==-1) break;
			while(ch=='\n')
			{
				ch=fr.read();
				if(ch=='\n')
					break;
				
			}
			fw.write(ch);
			
		}
		fr.close();
		fw.close();
		System.out.print("File copied");
	}

}
