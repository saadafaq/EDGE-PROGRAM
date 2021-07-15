package fibbonacciStack;

import java.util.Stack;

/*
 * @Author : SAAD AHMED
 * @Description : Implement Fibonacci series using STACK - no recursive function.
 * 
*/
public class FibbonaciStack {
	/**
	 * This method is used to print the fibbonacci series 
	 * of size n.
	 * @param size It is used to define the limit of the fibbonacci series.
	 * @return Nothing.
	 */
	public void printFibbnacci(int size) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		stack.add(1);

		while (stack.size() < size) {
			int b = stack.pop();
			int a = stack.pop();
			stack.push(a);
			stack.push(b);
			stack.push(a + b);
		}

		System.out.println(stack.size());
		System.out.println(stack);
	}
}
