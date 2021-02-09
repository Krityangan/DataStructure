package com.datastructure.array;

import java.util.Iterator;

public class DyanmicArray<T> implements Iterable<T> {

	public T[] arr;
	private int len=0;
	private int capacity=0;
	
	
	 public DyanmicArray() {
		this(16);
	}
	
		
	
	@SuppressWarnings("unchecked")
	public DyanmicArray(int capacity) {
		if(capacity<0) throw new IllegalArgumentException("Illegal Capacity "+capacity);
		this.capacity=capacity;
		arr= (T[]) new Object[capacity];
	}

	public int size() { return len;}
	
	public boolean isEmpty() { return size()==0;}
	
	public T get(int index) {return arr[index];}
	
	public void set(int index,T elem) {
		arr[index]=elem;
	}
	
	public void clear()
	{
		for(int i=0;i<capacity;i++)
		{
			arr[i]=null;
		}
	}

	
	public void add(T elem)
	{
		//time to resize
		if(len+1>=capacity)
		{
			if(capacity ==0)
				capacity=1;
			else
				capacity*=2;
			
		}
		
		@SuppressWarnings("unchecked")
		T[] new_arr= (T[]) new Object[capacity];
		for(int i=0;i<len;i++)
		{
			new_arr[i]=arr[i];	
		}
		
		arr[len++]=elem;
	}
	
	
	public T removeAt(int rm_index)
	{
		if(rm_index>= len && rm_index<0) throw new IndexOutOfBoundsException("The Length of the Array is Out of Bounds");
		T data=arr[rm_index];
		@SuppressWarnings("unchecked")
		T[] new_arr=(T[]) new Object[len-1];
		for(int i=0,j=0;i<len;i++,j++)
			if(i==rm_index)j--;
			else
				new_arr[j]=arr[i];
		arr=new_arr;
		capacity=--len;
		return data;	
	}
	
	public boolean remove(Object obj)
	{
		for(int i=0;i<len;i++)
		{
			if(arr[i].equals(obj)) {
				removeAt(i);
				return true;
			}
		}
		
		return false;
		
	}
	
	public boolean contains(Object obj)
	{
		return indexOf(obj) != -1;
	}
	
	public int indexOf(Object obj)
	{
		for(int i=0;i<len;i++)
		{
			if(arr[i].equals(obj))
				return i;
		}
		return -1;
	}
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			int index=0;
			public boolean hasNext() {
				return index<len;}
			@Override
			public T next() {
				return arr[index++];
			}
		};
	}
	
	public String toString()
	{
		if(len == 0) return "[]";
		else
		{
			StringBuilder sb = new StringBuilder(len).append("[");
			for(int i=0;i<len-1;i++)
				sb.append(arr[i]+ " \t, ");
			return sb.append(arr[len-1]+" ]").toString();
		}
				
	}
	

}
