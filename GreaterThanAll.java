package com.app.test;

import java.util.Stack;

class GreaterThanAll

{
	// Function to print all elements which are greater than all
	// elements present to their right
	public static void find(int[] arr)
	{
		// base case
		if (arr == null || arr.length == 0) {
			return;
		}

		// create an empty stack
		Stack<Integer> stack = new Stack<>();

		// do for each element
		for (int value: arr)
		{
			// pop all the elements that are less than the current element
			while (!stack.isEmpty() && stack.peek() < value) {
				stack.pop();
			}

			// push current element into the stack
			stack.push(value);
		}

		// print all elements in the stack
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 9, 10, 4, 6, 3, 5 };
		find(arr);
	}
}
