package com.example.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountIsland {
	
	 public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int m = Integer.parseInt(br.readLine());
	      int n = Integer.parseInt(br.readLine());
	      int[][] arr = new int[m][n];

	      for (int i = 0; i < arr.length; i++) {
	         String parts = br.readLine();
	         for (int j = 0; j < arr[0].length; j++) {
	            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
	         }
	      }
	      
	      int count =0;
	      boolean [][]visited = new boolean[arr.length][arr[0].length];
	      for(int i=0;i<arr.length;i++)
	      {
	    	  for(int j=0;j<arr[i].length;j++)
	    	  {
	    		  if(arr[i][j] == 0 && visited[i][j] == false)
	    		  {
	    			  drawTreeForGraph(arr,i,j,visited);
	    			  ++count;
	    		  }
	    		  
	    	  }
	      }
	      
	      System.out.println("No of Island : "+ count);

	   }

	private static void drawTreeForGraph(int[][] arr, int i, int j, boolean[][] visited) {
		
		if(i<0 ||j <0 || i>=arr.length || j>= arr[0].length || arr[i][j] == 1 || visited[i][j] == true)
			return;
		
		visited[i][j] = true;
		drawTreeForGraph(arr, i-1, j, visited);//North
		drawTreeForGraph(arr, i, j+1, visited);//East
		drawTreeForGraph(arr, i, j-1, visited);//West
		drawTreeForGraph(arr, i+1, j, visited);//South
		
	}
}
