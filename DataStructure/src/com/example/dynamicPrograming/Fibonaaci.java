package com.example.dynamicPrograming;

public class Fibonaaci {

	
	public static void main(String[] args)
	{
		
		System.out.println("Fibonacci Number  " + fibo(10));
		System.out.println("Fibonacci Number  " + fibo(9));
		System.out.println("Fibonacci Number  " + fibo(6));
		System.out.println("Fibonacci Number  " + fibo(7));
		System.out.println("Fibonacci Number  " + fibo(8));
		
	}

	private static int fibo(int n) {
		if(n<=2) 
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
	
}
