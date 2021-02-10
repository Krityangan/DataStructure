package com.example.dynamicPrograming;

public class BestSum {

	public static void main(String[] args)
	{
		int [] arr1= {5,3,4,7};
		
		System.out.println(bestSum(7,arr1));
	}
	static String str;
	private static String bestSum(int num, int[] arr ) {
		
		if(num == 0)	
			return "[ ]";
		if(num<0) return null;
		
		for(int i=0;i<arr.length;i++)
		{
			int rem=num-arr[i];
			str=bestSum(rem, arr);
		}
	

		return str;
		
		
		
	}
	
}
