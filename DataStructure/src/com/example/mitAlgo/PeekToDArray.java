package com.example.mitAlgo;

public class PeekToDArray {
	
	static int MAX=100;
	
	static int findMax(int[][] arr, int rows,int mid, int max) 
		{ 
			int max_index = 0; 
			for (int i = 0; i < rows; i++) 
			{ 
				 if (max < arr[i][mid]) 
				 { 
				     max = arr[i][mid]; 
				     max_index = i; 
				 } 
			} 
			return max_index; 
		} 
	
	static int Max(int[][] arr, int rows,int mid, int max) 
		{ 
			 for (int i = 0; i < rows; i++) 
			 { 
			     if (max < arr[i][mid]) 
			     { 
			         max = arr[i][mid]; 
			     } 
			 } 
			 return max; 
		} 
			
	public static void main(String[] args)
	{
		int[][] arr = {{ 10, 8, 10, 10 }, 
                { 14, 13, 12, 11 },  
                { 15, 9, 11, 21 },  
                { 16, 50, 19, 20 }};
		
		int rows = 4, columns = 4; 
        System.out.println(findPeak(arr, rows, columns)); 
	}

	private static int findPeak(int[][] arr, int rows, int columns) {
		return findPeakRec(arr,rows,columns,columns/2);
	}

	private static int findPeakRec(int[][] arr, int rows, int columns, int mid) {
		
		int max = 0; 
        int max_index = findMax(arr, rows, mid, max); 
        max = Max(arr, rows, mid, max); 
  
        if (mid == 0 || mid == columns - 1) 
            return max; 
  
        // If mid column maximum is also peak 
        if (max >= arr[max_index][mid - 1] &&  
            max >= arr[max_index][mid + 1]) 
            return max; 
  
        // If max is less than its left 
        if (max < arr[max_index][mid - 1]) 
            return findPeakRec(arr, rows, columns,  
                         (int)(mid - Math.ceil((double) mid / 2))); 
  
        // If max is less than its left 
        // if (max < arr[max_index][mid+1]) 
        return findPeakRec(arr, rows, columns,  
                     (int)(mid + Math.ceil((double) mid / 2)));
	}
	
	
}
