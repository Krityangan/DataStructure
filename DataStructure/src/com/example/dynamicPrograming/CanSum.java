package com.example.dynamicPrograming;

public class CanSum {

	public static void main(String[] args)
	{
		int [] arr1= {5,3,4,7};
		int [] arr2= {3,4,5,8,9,10};
		int [] arr3= {2,4};
		int [] arr4= {7,14};
		System.out.println("Grid Travller " +canSum(7 ,arr1) );
		System.out.println("Grid Travller " +canSum(10,arr2));
		System.out.println("Grid Travller " +canSum(7,arr3));
		System.out.println("Grid Travller " +canSum(300,arr4));
		
	}

	private static boolean canSum(int num, int[] arr) {
		int memo[]= new int[arr.length+1];
			return canSumRec(num, arr,memo);
				
	}

	private static boolean canSumRec(int num, int[] arr,int memo[]) {
		if(num == 0)
			return true;
		if(num<0)
			return false; 
		for(int i=0;i<arr.length;i++)
		{
			int rem=num-arr[i];
			if(canSumRec(rem, arr,memo) == true)
				return true;
			
		}
		return false;
	}
	
}
