package com.example.dynamicPrograming;

import java.util.Arrays;

public class GridTravller {

	
	public static void main(String[] args)
	{
		System.out.println("Grid Travller " +gridTravller(4,5));
		System.out.println("Grid Travller " +gridTravller(3,3));
		System.out.println("Grid Travller " +gridTravller(2,3));
		System.out.println("Grid Travller " +gridTravller(18,18));
	}

	
	
	private static int gridTravller(int i, int j) {
		int memo[][]= new int[i+1][j+1];
		//Arrays.fill(memo, 0);
		return gridTravllerRec(i, j,memo);
	}



	private static int gridTravllerRec(int m, int n ,int[][] memo) {
		// TODO Auto-generated method stub
		if(m == 1 && n == 1)
			return 1;
		
		if(m==0||n==0) return 0;
		
		return gridTravllerRec(m-1, n,memo)+gridTravllerRec(m, n-1,memo);
		
	}
}
