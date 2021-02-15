package com.example.dynamicPrograming;

import java.util.Arrays;

public class KanpSack {

	static int dp[][] ;
	
	public static void initializeMemo(int n,int m)
	{
		dp=new int[n+1][m+1];
		
	}
	
	public static void main(String[] args)
	{
		
		
		
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        
        int weight=50;
        int len=val.length;
        
        initializeMemo(val.length, weight);
        for(int[] row:dp)
    		Arrays.fill(row, -1);
        
        System.out.println("Maximum Profit :->  "+knapSack( wt, val,weight,len));
		
		
	}

	private static int knapSack(int[] wt, int[] val, int weight, int len) {

		if(len == 0 || weight == 0)
			return 0;
		if(dp[len][weight] !=-1)
			return dp[len][weight];
		else if(wt[len-1] <= weight)
		{
			dp[len][weight]= max(val[len-1]+knapSack(wt, val, weight-wt[len-1], len-1),knapSack(wt, val, weight, len-1));
		}
		else if(weight > wt[len-1]) {
		
			 dp[len][weight]= knapSack(wt, val, weight, len-1);
		}
			
		return dp[len][weight];
		
	}

	private static int max(int a, int b) {
		// TODO Auto-generated method stub
		return (a>b?a:b);
	}
	
}
