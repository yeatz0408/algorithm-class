package com.gmail.yeatz0408.recursion;

public class ProductOfArray {
	
	public static void main(String[] args) {
		
		int[] A = {1, 2, 3, 4, 5};
		
		System.out.println(productofArray(A, A.length));		
	}


	public static int productofArray(int A[], int N) {
		if (N == 0) {
			return 1;
		}

		return A[N - 1] * productofArray(A, N - 1);
	}
}
