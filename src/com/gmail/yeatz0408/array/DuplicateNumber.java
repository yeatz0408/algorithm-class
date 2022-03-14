package com.gmail.yeatz0408.array;

import java.util.Arrays;

public class DuplicateNumber {
	
	// Do not use List
	public static int[] removeDuplicates(int[] arr) {
		
		Arrays.sort(arr);
		
		int count = 1;
		
		for (int i = 0, k = 1; k < arr.length; i++, k++) {
			if (arr[i] != arr[k]) {
				count++;
			}
		}
		
		int[] toReturn = new int[count];
		toReturn[0] = arr[0];
		
		int forward = 1;
		int back = 0;
		
		for (int i = 1; i < toReturn.length; i++) {
			while (arr[back] == arr[forward]) {
				forward++;
			}
			back = forward;
			toReturn[i] = arr[forward];
			
		}
		
		return toReturn;
	}

	public static void main(String[] args) {
		
		for (int i : removeDuplicates(new int[] {1,1,2,2,2,3,4,5,5})) {
			System.out.print(i);
		}
		
	}

}
