package com.example.dynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class AllConstruct {

	public static void main(String[] args)
	{
		String arr[]= {"purp","p","ur","le","purpl"};
		
		System.out.println("Word Construct --> "+ wordConstruct("purple",arr));
		System.out.println(memo.toString());
	}

	static List<String> memo = new ArrayList<String>();
	static int i=0;
	private static boolean wordConstruct(String string, String[] arr) {
		if(string.equals("")) return false;
		String temp;
		
		for(String word: arr)
		{
			memo.add(string.trim());
			if(string.indexOf(word) == 0)
			{
				memo.add(arr[i++]);
				temp=string.substring(word.length());
				
				wordConstruct(temp, arr);
				return true;
			}
			
		}
		return false;
	}
	
}
