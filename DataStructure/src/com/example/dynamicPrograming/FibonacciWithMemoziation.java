package com.example.dynamicPrograming;

import java.util.Arrays;

public class FibonacciWithMemoziation {

	
	public static void main(String[] args)
	{
		
		System.out.println("Fibonacci Number  " + fibo(50));
		System.out.println("Fibonacci Number  " + fibo(9));
		System.out.println("Fibonacci Number  " + fibo(6));
		System.out.println("Fibonacci Number  " + fibo(7));
		System.out.println("Fibonacci Number  " + fibo(8));
		
	}

	private static long fibo(long n) {
		long [] memo = new long[(int) (n+1)];
	
		
		
		Arrays.fill(memo, 0);
		return fibonacciMemo(n,memo);
	}



	private static long fibonacciMemo(long n, long[] memo) {
		
		if(memo.length == n)
			return memo[(int) n];
		if(n<=2)
			return 1;
		
		return memo[(int) n]=fibonacciMemo(n-1,memo)+fibonacciMemo(n-2,memo);
	}
}
