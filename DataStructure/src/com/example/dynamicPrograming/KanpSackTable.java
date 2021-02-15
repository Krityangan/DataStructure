package com.example.dynamicPrograming;

public class KanpSackTable {

	
	
	public static void main(String[] args)
	{
		int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        
        int weight=50;
        int len=val.length;
        
        System.out.println("Maximum Profit :->  "+knapSack( wt, val,weight,len));
	}

	private static int knapSack(int[] wt, int[] val, int weight, int len) {
		int t[][]= new int[len+1][weight+1];
		
		for(int i=0;i<len+1;i++)
		{
			for(int j=0;j<weight+1;j++)
			{
				if(i==0 || j==0)
					t[i][j]=0;
				else
				{
					if(wt[i-1] <= j)
						t[i][j] = max( (val[i-1] + t[i-1][j-wt[i-1]]) , t[i-1][j] );
					else
						t[i][j]=t[i-1][j];
				}
			}
		}	
		
		return t[len][weight];
	}
	
	
	private static int max(int a, int b) {
		return (a>b?a:b);
	}
	
}


