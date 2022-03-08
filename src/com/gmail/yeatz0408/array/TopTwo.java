package com.gmail.yeatz0408.array;

public class TopTwo {
	
	  static String firstSecond(Integer[] myArray) {
		  
		  int highest = 0;
		  int second = 0;
		  
		  for (int i = 0, k = 0; i < myArray.length; i++) {
			  if(myArray[i] > highest) {
				  highest = myArray[i];
			  }
			  
			  if(myArray[k] < highest && myArray[k] > second) {
				  second = myArray[i];
			  }
			  
			  if (i > 0) {
				  k++;
			  }
			  
			  if (i == myArray.length-1) {
				  if (myArray[i] > second && myArray[i] < highest) {
					  second = myArray[i];
				  }
			  }
		  }
		  
		  return highest + " " + second;
	  }

	public static void main(String[] args) {
		
		Integer[] myArray = {84,84,85,86,87,85,90,83,23,45,84,1,1,89};
		
		System.out.println(firstSecond(myArray));

	}

}
