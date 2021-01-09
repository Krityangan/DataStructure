package com.datastructure.linkedList;

import java.util.Iterator;
import java.util.Scanner;

public class ListData {
	public static void main(String[] args)
	{
		DoubleLinkedList<Object> list = new DoubleLinkedList<Object>();
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the elements in the list");
			while(true)
			{
				String str=sc.nextLine();
				if(list.isEmpty())
				list.addFirst(str);
				else
					list.add(str);
				System.out.println("Do you want to continue? Y/N");
				str=sc.next();
				if(str.equalsIgnoreCase("N"))break;
				sc.nextLine();
				System.out.println("Enter the elements in the list");
				
			}
		}
		System.out.println("Traverse the element in the list");
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext())
		{
			Object object=itr.next();
			System.out.print(object + "\t");
		}
		
		//add first 
		list.addFirst("First Element");
		System.out.println();
		 itr=list.iterator();
		while(itr.hasNext())
		{
			Object object=itr.next();
			System.out.print(object + "\t");
		}
	}

}
