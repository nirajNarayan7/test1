package com.app.test;

public class Practice2 {

	// function to print the alternate element
	// of an array

	/*
	 * static void alterNate(int[] arr, int n) {
	 * 
	 * // for loop to print the element at the odd position for (int cur_indx = 0;
	 * cur_indx < n; cur_indx += 2) { // prints the element of array
	 * System.out.print(arr[cur_indx] + " ");
	 * 
	 * }
	 * 
	 * }
	 */

	// second approach
//	--------------

	// Print elements
	// at odd positions
	static void alterNate(int[] arr, int N) {
		for (int currIndex = 0; currIndex < N; currIndex++) {

			// If currIndex stores even index
			// or odd position
			if (currIndex % 2 == 0) {
				System.out.print(arr[currIndex] + " ");
			}

		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 6, 9, 3, 9, 2 };

		int n = arr.length;

		alterNate(arr, n);

	}

}
