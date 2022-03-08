package com.gmail.yeatz0408.array;

public class SecondToSecondLast {
	
	public static int[] middle(int[] arr) {
        
		int[] toReturn = new int[arr.length-2];
		
		for (int i = 0; i < arr.length-2; i++) {
			
			toReturn[i] = arr[i+1];
		}
		
		return toReturn;
    }

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		
		int[] answer = middle(array);
		
		for (int i : answer) {
			System.out.println(i);
		}
	}

}
