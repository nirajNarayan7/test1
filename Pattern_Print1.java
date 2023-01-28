package com.app.test;

public class Pattern_Print1 {

	public static void print(int n) {
        int count =0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; i + j < n; j++) {
				System.out.print(++count + " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		print(5);

	}

}
