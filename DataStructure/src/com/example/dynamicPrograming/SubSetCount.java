package com.example.dynamicPrograming;

public class SubSetCount {

	public static void main(String[] args)
	{
		int arr[]= {2,3,5,6,8,10};
		int sum=10;
		System.out.println("Subset counnt is : "+ subSetCount(arr,sum));
		 sum=3;
		System.out.println("Subset counnt is : "+ subSetCount(arr,sum));
	}

	private static int subSetCount(int[] arr, int sum) {
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
		
		
	
		return t[arr.length][sum];
	}
	
}
