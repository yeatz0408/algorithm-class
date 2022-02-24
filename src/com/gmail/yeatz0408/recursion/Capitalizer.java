package com.gmail.yeatz0408.recursion;

public class Capitalizer {
	
	  static int i = 0;
	  static String toReturn = "";
	
	  public static String capitalizeWord(String str){
		 
		 if (i >= str.length()) {
			 return toReturn;
		 }
		 		 
		 if (i == 0 && (str.charAt(0) > 'Z' || str.charAt(0) < 'A')) {
			 toReturn += (char) (str.charAt(0) - 32);
			 str = str.substring(1);
		 }
		 
		 if (str.charAt(i) == ' ' && (str.charAt(i+1) > 'Z' || str.charAt(i+1) < 'A')) {
			 toReturn += ' ';
			 toReturn += (char) (str.charAt(i+1)-32);
			 i += 2;
		 }
		 
		 toReturn += str.charAt(i++);
		 
		 capitalizeWord(str);
		    
		 return toReturn;
	  }  
	  
	  
	  // use substring method and recursive
	  public static String trial2(String str) {
		  
		  System.out.println(str);
		  
		  if (str.length() == 0) {
			  return str;
		  }
		  
		  if (str.length() == 1) {
			  return str.toUpperCase();
		  }
		  
		  if (str.charAt(str.length()-2) == ' ') {
			  return trial2(str.substring(0, str.length()-2)) + ' ' + Character.toUpperCase(str.charAt(str.length()-1));
		  } else {
			  return trial2(str.substring(0, str.length()-1)) + str.charAt(str.length()-1);  
		  }
		  
		  
		  
		  
		  
	  }

	public static void main(String[] args) {

		System.out.println(capitalizeWord("i love java"));
		System.out.println(trial2("i love java"));
		
	}

}
