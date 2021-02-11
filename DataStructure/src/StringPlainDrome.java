import java.util.Arrays;

public class StringPlainDrome {

	public boolean isPlaindromme(String str)
	{
		if(str.length() == 0)
			return false;
		char[] store= new char[str.length()];
		//char temp[]= new char[str.length()];
		String t="";
		store=str.toCharArray();
		
		for(int i=str.length();i>0;i--)
		{
			t+=store[i];
			
		}
		
		//String compare=Arrays.toString(temp); //n/2
		
		if(t.equalsIgnoreCase(str))
			return true;
		
			
		
		return false;
	}
	
}
