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
public class TestStringComparison {
	public static void main(String[] args) {
		StringComparison.printFirstCommonCharacter("bca", "aef");
		StringComparison.printFirstCommonCharacter("ab", "bc");

	}
}
