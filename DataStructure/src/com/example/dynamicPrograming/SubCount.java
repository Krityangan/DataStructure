package com.example.dynamicPrograming;

public class SubCount {
	
	public static void main(String[] args)
	{
		int arr[]= {2,3,7,8,10};
		int sum =11;
		
		System.out.println("Subset of Sum is available ---> "+ subsetSum(arr,sum));
	}

	private static boolean subsetSum(int[] arr,int sum) {
		int t[][]=new  int[arr.length+1][sum+1];
		boolean flag=false;
		for(int i=0;i<arr.length+1;i++)
			for(int j=0;j<sum+1;j++)
			{
				if(j==0)
					t[i][j+1]=0;
				if(j==0)
					t[i][j]=1;
				else if(i!=0 && j!=0) {
						if(arr[i-1]<=j)
							{
								t[i][j]=t[i][j-arr[i-1]];
									flag= true;
								}
								
						else {
							t[i][j]=t[i-1][j];
							flag=false;
						}
				}
				
				
			}
		
		for(int[] a:t)
		{
			for(int b:a)
				System.out.print(b + " ");
			System.out.println();
		}
		return flag;
	}

}
