package task4;
/*
 * @Author : SAAD AHMED
 * @Description : Implement an algorithm to determine first common character in two character arrays.
 * Constraints : 
 * Time complexity for this code O(m+n).
 * The space complexity should be O(1), and try within 40 bits
 * The character array can only hold the lowercase letters a through z. 
 * No existing comparison functions are allowed.
 * 
 *  HINT: use bit vector (int for this task)
 */

public class StringComparison {
	public static void printFirstCommonCharacter(String str, String str2) {
		 int checker = 0;
		 for (int i = 0; i < str.length(); i++) {
			 int val = str.charAt(i) - 'a';
			 int bitShifting = 1 << val;
			 if ((checker & bitShifting) > 0) {
				 continue;
			 }
			 checker |= bitShifting;
		 }
		 
		 for (int i = 0; i < str2.length(); i++) {
			 int val = str2.charAt(i) - 'a';
			 int bitShifting = 1 << val;
			 if ((checker &  (1 << val)) > 0) {
				 System.out.println( str2.charAt(i) + " is first common character.");
				 break;
			 }
			 checker |= bitShifting;
			 }
		
	}
}
