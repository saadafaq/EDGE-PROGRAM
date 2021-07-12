package task3;
/*
 * @author : SAAD AHMED
 * Description: Work on StringBuffer & solve Palindrome
 */

public class PalindromeChecker {
	public static boolean isPalindrome(StringBuffer stringBuffer){  
	    StringBuilder sb2 = new StringBuilder(stringBuffer);  
	    sb2.reverse();
	    
	    String original = stringBuffer.toString();
	    String rev=sb2.toString();  
	    
	    if(original.equals(rev))
	        return true;  
	    else  
	        return false;  
	}
}
