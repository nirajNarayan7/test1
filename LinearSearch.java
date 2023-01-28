package com.app.test;

import java.util.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 18, 12, 4, 9, 12, 27, 7, 10 };
		int  target1=7;
		String str = "niarj";
		char target = 'j';
		System.out.println(search(str, target));
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(arr);
		System.out.println(linearSearch2(arr, target1, 1, 7));

	}

	// search in the index range
	// search 12 in the range of [1,7]
	static int linearSearch2(int[] arr, int target1, int start, int end) {
		if (arr.length == 0) {
			return -1;
		}
		// run a for loop
		for (int index = start; index <= end; index++) {
			// check for element at every index if it is = target
			int element = arr[index];
			if (element == target1) {
				return index;
			}
		}
		return end;

	}

	static boolean search2(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		for (char ch : str.toCharArray()) {
			if (ch == target) {
				return true;

			}
		}
		return false;
	}

	static boolean search(String str, char target) {
		if (str.length() == 0) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (target == str.charAt(i)) {
				return true;
			}

		}
		return false;

	}
}
