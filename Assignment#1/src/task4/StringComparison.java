package task4;
/*
 * @Author : SAAD AHMED
 * @Description : Implement an algorithm to determine first common character in two character arrays.
 * 
 * Constraints : 
 * Time complexity for this code O(m+n).
 * The space complexity should be O(1), and try within 40 bits
 * The character array can only hold the lowercase letters a through z. 
 * No existing comparison functions are allowed.
 * 
 *  HINT: use bit vector (int for this task)
 */
public class StringComparison {
	public static void printFirstCommonCharacter(Character[] charArray, Character[] chrArray2) {
		 int checker = 0;
		 		 
		 for(char ch : charArray) {
			 checker |= (1 << (ch - 'a'));
		 }
		 
		 for(char ch : chrArray2) {
			 if ((checker & (1 << (ch - 'a')) ) > 0) {
				 System.out.println(ch + " is first common character.");
				 return;
			 }
		 }
		 
		 System.out.println("No character is common."); 
	}
}
