package com.example.dynamicPrograming;

public class EqualSumPartition {
	
	public static void main(String[] args)
	{
		int arr[]= {1,5,11,5};
		int sum=0;
		System.out.println("Sum of the subset is present or not ? --- > "+ sumSubset(arr,sum));
	}

	private static boolean sumSubset(int[] arr, int sum) {
	
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		if(sum % 2 != 0)
			return false;
		else if(sum % 2 == 0)
			return isSumSubset(arr, arr.length,sum/2);
		return false;

	}

	private static boolean isSumSubset(int[] arr,int n, int sum) {
		if(sum ==0)
			return true;
		else if (n==0 && sum != 0)
			return false;
		if(arr[n-1]>sum)
			return isSumSubset(arr,n-1, sum);
			
		return isSumSubset(arr, n - 1, sum)
				||isSumSubset(arr, n - 1, sum - arr[n - 1]);
	}
	

}
