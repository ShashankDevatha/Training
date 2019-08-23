package com.vir.coll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListDemo implements Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(20);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i)+ " ");
	
		}
		@Override
		public int compare(Employee o)
		{
			return this.empid-o.empid;
		}
		public int compare (Employee o1,Employee o2)
		{
			if((o1.getExperience- o2.getExperience) >0)
			{
				return  1;
			
			}
		}
		

	}

}
?