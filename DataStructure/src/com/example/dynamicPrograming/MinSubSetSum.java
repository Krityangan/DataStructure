package com.example.dynamicPrograming;

public class MinSubSetSum {

	public static void main(String args[])
	{
		int arr[]= {1,1,2,3};
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		
		
		System.out.println("Minimun Subset Sum is :---> "+ minSubSetSum(arr,sum));
	}

	private static int minSubSetSum(int[] arr, int sum) {
		
		int t[][]= new int[arr.length+1][sum+1];
		
		for(int i=0;i<arr.length+1;i++)
		{
			for(int j=0;j<sum+1;j++)
			{
				if(j==0)
					t[i][j+1]=0;
				if(j==0)
					t[i][j]=1;
				else if(i!=0 && j!=0)
				{
					if(arr[i-1]<=j) {
						t[i][j]=t[i-1][j]+ t[i-1][j-arr[i-1]];
					}
					else
						t[i][j] = t[i-1][j];
				}
				
				
				System.out.print(t[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
		int diff=Integer.MAX_VALUE;
		System.out.println("-------------");
		int counter=0;
		for(int i=0;i<=sum/2;i++) 
		{
			int f=i;
			int s=sum-i;
			if(t[arr.length][i]>0 && diff>Math.abs(f-s)) {
				diff=Math.abs(f-s);
				counter++;
			}
		}
		System.out.println("Counter "+counter);
		return diff;
}

}