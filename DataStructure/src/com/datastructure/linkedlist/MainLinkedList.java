package com.datastructure.linkedlist;

public class MainLinkedList {
	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args)
	{
		DoublyLinkedList<T> d= new DoublyLinkedList<T>();
		
		System.out.println("Size  of the Linked List " + d.size());
		
		System.out.println("Add 1st Element" );
		d.add((T)"Krityangan");
		d.add((T)"Rahul");
		d.add((T)"Pooja Singh");
		d.add((T)"Resham Singh");
		d.add((T)"Jamuna Singh");
		d.add((T)"Priyaka Singh");
		d.add((T)"1");
		
		System.out.println("Lis is Empty or not " + d.isEmpty());
		
		System.out.println("The elements of the Linked List is " + d.toString());
		
		System.out.println("The elements at the first position ");
		d.addFirst((T)"Singh Famliy");
		System.out.println("The elements at the Last position ");
		d.addLast((T)"Hard Workers");
		System.out.println("The elements of the Linked List is " + d.toString());
		
		System.out.println("Remove the Elements" + d.remove("1"));
		System.out.println("The elements of the Linked List is " + d.toString());
	}
	

}
