package com.example.sorting;

public class QuickSort {
	
	
	
	
	public static void main(String[] args)
	{
		 int arr[] = {10, 7, 8, 9, 1, 5}; 
	        int n = arr.length; 
	        System.out.println("Before sorted array"); 
	        printArray(arr); 
	        QuickSort ob = new QuickSort(); 
	        ob.sort(arr, 0, n-1); 
	  
	        System.out.println("After sorted array"); 
	        printArray(arr); 
		
	}

	private static void printArray(int[] arr) {
		for(int n: arr)
			System.out.print(n + "\t");
		System.out.println();
	}

	private void sort(int[] arr, int low, int high) {
		
		if(low<high)
		{
			int pi=partition(arr,low,high);
			
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
		
	}

	private int partition(int[] arr, int low, int high) {

			int piviot=arr[high];
			
			int i=(low-1);
			for(int j=low;j<high;j++)
			{
				if(arr[j]<piviot)
				{
					i++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
			int temp=arr[i+1];
			arr[i+1]=arr[high];
			arr[high]=temp;
			
			
		
		return i+1;
	}

}
