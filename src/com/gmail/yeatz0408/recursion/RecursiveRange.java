package com.gmail.yeatz0408.recursion;

public class RecursiveRange {

	// accepts a number and adds up all the numbers from 0 to the number passed to
	// the function

	public static void main(String[] args) {
		
		System.out.println(recursiveRange(6));
		System.out.println(recursiveRange(10));
	}

	public static int recursiveRange(int num) {

		if (num == 0) {
			return 0;
		}

		return num + recursiveRange(num - 1);
	}

}
