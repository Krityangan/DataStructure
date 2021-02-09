package com.datastructure.array;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicArrayMain {
	
	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) throws Exception
	{
		DyanmicArray<T> dy_arr=new DyanmicArray<T>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" The Array length " + dy_arr.size());
		
		System.out.println("Enter the Array Elements");
		Object obj;
		while(true)
		{
			obj=br.readLine();
			dy_arr.add((T)obj);
			System.out.println("Do you want to continue ? Y/N");
			if(br.readLine().equalsIgnoreCase("N"))
				break;
			System.out.println("Enter the Array Elements");
			
			
		}
		
		System.out.println("Elements in the array "+ dy_arr.toString());
		
		
		System.out.println("Element Index "+ dy_arr.indexOf(obj));
		
	}

}
