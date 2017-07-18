import java.util.ArrayList;
import java.util.Collections;

public class wave {
	public static int isNumber(final String a) {
		String s = a.trim();
		System.out.println('|' + s + '|');
		if (s == "" || s == null)
		{
			return 0;
		}
	    int length = s.length();
	    int decimalCount = 0;		
	    if (s.charAt(length - 1) == '.') 
	    {
	        return 0;    
	    }
	    for (int i = 0; i < length; i++)
	    {
	    	/*if (a.charAt(i) == ' ')
	    	{
	    		return 0;
	    	}*/
	    	if (s.charAt(i) != '.' && s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '4' && s.charAt(i) != '5' && s.charAt(i) != '6' && s.charAt(i) != '7' && s.charAt(i) != '8' && s.charAt(i) != '9') 
	    	{
	    		return 0;
	    	}
	    	
	    	if (s.charAt(i) == '.') 
	    	{
	    		decimalCount++;
	    	}
	    }
	    if (decimalCount > 1) 
	    {
    		
	    	return 0;
	    }
	    return 1;
	}
	
	public static boolean anagram(String s1, String s2) {
		int s1Value = 0, s2Value = 0;
		for (int i = 0; i < s1.length(); i++) {
			s1Value += (int) s1.charAt(i);
		}
		
		for (int i = 0; i < s2.length(); i++) {
			s2Value += (int) s2.charAt(i);
		}
		
		if (s1Value == s2Value) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(anagram("tac", "cav"));
	}
}
