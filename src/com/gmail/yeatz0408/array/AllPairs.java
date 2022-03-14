package com.gmail.yeatz0408.array;

public class AllPairs {
	
	public static String pairSum(int[] myArray, int sum) {
        
		StringBuilder sb = new StringBuilder("");
		int index = 0;
		
		for (int i = 0; i < myArray.length; i++) {
			for (int k = i + 1; k < myArray.length; k++) {
				if (myArray[i] + myArray[k] == sum) {
					sb.append(myArray[i] + ":" +myArray[k] + " ");
				}
			}
		}
		
		String toReturn = sb.toString();
		
		return toReturn;
	}

	public static void main(String[] args) {
		
		System.out.println(pairSum(new int[]{2,4,3,5,6,-2,4,7,8,9}, 7));
		
		

	}

}
