package task3;

public class PalindromeChecker {
	public static boolean isPalindrome(StringBuilder sb){  
	    StringBuilder sb2 = new StringBuilder(sb);  
	    sb2.reverse();
	    
	    String original = sb.toString();
	    String rev=sb2.toString();  
	    
	    if(original.equals(rev))
	        return true;  
	    else  
	        return false;  
	}
}
