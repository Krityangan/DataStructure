package com.example.dynamicPrograming;

import java.util.ArrayList;
import java.util.List;

public class WordBank {

	public static void main(String[] args)
	{
		String[] str= {"ab","abc","cd","def","abcd"};
		String[] str1= {"bo","rd","ate","t","ska","sk","boar"};
		
		System.out.println("Word Bank Search "+ wordBank("abcdef",str));
		if(memo!=null)
		System.out.println(memo);
		System.out.println("Word Bank Search "+ wordBank("skateboard",str1));
		
	}
	static List<String> memo = new ArrayList<String>();
	static int count;
	private static boolean wordBank(String string, String[] str) {
		
		if(string.equals("")) return true;
		String temp;
		for(String word: str)
		{
			if(string.indexOf(word) == 0)
			{
				  temp = string.substring(word.length());
				  memo.add(temp);
				  if(wordBank(temp, str) == true)
					  count++;
				  System.out.println(count);
				return true;
			}
		}
		
		return false;
	}
	
}
