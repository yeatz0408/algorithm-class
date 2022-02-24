package com.gmail.yeatz0408.recursion;

public class FibonacciSequence {

	
	// accepts a number and returns the nth number in the Fibonacci sequence
	public static int fib(int n) {

		if (n == 1 || n == 0)
			return n;
//		if (n == 0) return 1; // doesn't work
//		if (n < 0) return -1;

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

		System.out.println(fib(5));
		System.out.println(fib(6));
		System.out.println(fib(28));
		System.out.println(fib(35));
		System.out.println(fib(2));
	}

}
