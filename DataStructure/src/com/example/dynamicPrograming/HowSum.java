package com.example.dynamicPrograming;

public class HowSum {

	public static void main(String[] args)
	{
		int [] arr1= {5,3,4,7};
		int [] arr2= {3,4,5,8,9,10};
		int [] arr3= {2,4};
		int [] arr4= {7,14};
		
		System.out.println("How Sum " +howSum(7 ,arr1, new int[arr1.length]));
	System.out.println("How Sum " +howSum(10,arr2,new int[arr2.length]));
		System.out.println("How Sum " +howSum(7,arr3,new int[arr3.length]));
//		System.out.println("How Sum " +howSum(300,arr4,new int[arr4.length]));
		
	}

	//static String str;
	private static boolean howSum(int num, int[] arr, int[] memo) {
		if(num == 0)
			return true;
		if(num<0)
			return false;
		
				for(int i=0;i<arr.length;i++)
				{
					int rem=num-arr[i];
					if(rem >=0)
					System.out.print(rem + "\t");
					  if ((howSum(rem, arr,memo) == true))
							  return true;
					
				}
			
		return false;
		
	}
}
