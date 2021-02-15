package com.example.dynamicPrograming;

import java.math.BigInteger;
import java.util.Arrays;

public class TableDpFibonacci {

	public static void main(String[] args) {
		
		System.out.println(fib(600));
		System.out.println(fib(700));
		System.out.println(fib(100));
	}
	private static BigInteger fib(int num) {
		BigInteger a = BigInteger.valueOf(0); 
        BigInteger b = BigInteger.valueOf(1); 
        BigInteger c = BigInteger.valueOf(1); 
        for (int j=2 ; j<=num ; j++) 
        { 
            c =  a.add(b); 
            a = b; 
            b = c; 
        } 
		 return (b);
	}

}
