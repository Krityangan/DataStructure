package com.datastructure.array;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Array <T> implements Iterable<T> {

	private T[] arr;
	private int len=0; //length user thinks array is
	private int capacity=0; // Actual array size

	public Array()
	{
		this(16);
	}

	public Array(int capacity) {
		if(capacity<0) throw new IllegalArgumentException("Illegal Capacity: "+ capacity);
		{
			this.capacity=capacity;
			arr=(T[])new Object[capacity];
		}
	}
	
	public int size()
	{
		return len;
	}
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public T get(int index)
	{
		return arr[index];
	}
	
	public void set(int index, T elem)
	{
		arr[index]=elem;
	}
	
	public void clear()
	{
		for(int i=0;i<capacity;i++)
			arr[i]=null;
		len=0;
	}
	
	public void add(T elem)
	{
		//time to resize
		if(len+1 >= capacity)
		{
			if(capacity==0)
				capacity=1;
			else 
				capacity*=2;//double the size
			T[] new_arr=(T[]) new Object[capacity];
			for(int i=0;i<len;i++)
			new_arr[i]=arr[i];
			arr=new_arr;//arr has extra null padded
		}
		arr[len++]=elem;
	}
	
	//remove the element at the specified index at the list
	public T removeAt(int rm_index)
	{
		if(rm_index>=len && rm_index<0) throw new IndexOutOfBoundsException("Size of the array is full");
		{
			T data= arr[rm_index];
			T[] new_arr=(T[]) new Object[capacity];
			for(int i=0,j=0;i<len;i++,j++)
				if(i==rm_index)j--;//skipping the rm_index by fixing the j temporarily
				else new_arr[j]=arr[i];
			arr=new_arr;
			capacity=--len;
			return data;
		}
	}
	
	public boolean remove(Object obj)
	{
		for(int i=0;i<len;i++)
		{
			if(arr[i].equals(obj)) {
				removeAt(i);return true;
			}
		}
		return false;
	}
	
	
	public int indexOf(Object obj)
	{
		for(int i=0;i<len;i++)
			if(arr[i].equals(obj))
				return i;
		return -1;
	}
	
	public boolean contains(Object obj)
	{
		return indexOf(obj) != -1;
	}
	
	//iterator is fast but not fast as iterative for loop
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index=0;
			@Override
			public boolean hasNext() {
				return index<len;
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return arr[index++];
			}
			
		};
	}
	
	@Override
	public String toString()
	{
		if(len ==0) return "[]";
		else
		{
			StringBuilder sb= new StringBuilder(len).append("[");
			for(int i =0 ;i<len-1;i++)
				sb.append(arr[i]+ ",");
			return sb.append(arr[len-1] + "]").toString();
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Dyanmic array Coding");
		Array<Object> arr= new Array<Object>();
		try (Scanner sc = new Scanner(System.in)) {
			String str;
			Object obj;
			while(true)
			{
				System.out.println("Enter the input in the array");
				str=sc.next();
				obj=str;
				arr.add(obj);
				System.out.println(arr.toString());
				System.out.println("Do you want to continue ? Y/N");
				str=sc.next();
				if(str.equalsIgnoreCase("N"))
					break;
				 
			}
			
				
				Iterator<Object> itr=arr.iterator();
				while(itr.hasNext())
				{
					Object object=itr.next();
					System.out.print(object + "\t");
					
				}
			
		}
		
	}
}
