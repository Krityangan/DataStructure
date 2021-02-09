package com.example.mitAlgo;

public class PeekOneDArray {

	
	public static void main(String[] args)
	{
		int[] arr1= {1,11,2,3,5,9,10,23,4};
		int[] arr3= {1,0,2,4,3,6,7};
		
		System.out.println("Index of the peek is : " +peekTheFirst(arr1,2));
	
		System.out.println("Index of the peek is : " +myPeekFirst(arr3,0,arr3.length-1,arr3.length));

	}

	private static int peekTheFirst(int[] arr, int n) {
		
		return myPeekFirst(arr,0,arr.length-1,arr.length);
	}


	
	private static int myPeekFirst(int arr[],int stInd, int laInd, int length)
	{
		int middleIndex=stInd + (laInd-stInd) /2;
		System.out.println("------> "+ middleIndex);
		
		if( (middleIndex == 0 || arr[middleIndex +1] <= arr[middleIndex]) && (middleIndex == length-1 || arr[middleIndex +1] <= arr[middleIndex]) )
			return middleIndex;
		else if(middleIndex > 0 && arr[middleIndex -1]> arr[middleIndex])
			return myPeekFirst(arr, stInd,(middleIndex-1), length);//searching from last
		else
			return myPeekFirst(arr,middleIndex+1, laInd, length);//searching from starting
		
		
		
	}
	
}
