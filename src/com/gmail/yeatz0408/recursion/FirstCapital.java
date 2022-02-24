package com.gmail.yeatz0408.recursion;

public class FirstCapital {
	
	// returns the first upper case of the String
    public static char first(String str) {
        if (Character.isUpperCase(str.charAt(0))) {
        	        	
            return str.charAt(0);
        }
        
        return first(str.substring(1));
    }
    
    //answer
    public static char first2(String str) {
        if(str.isEmpty()) {
            return ' ';
        }
        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }else {
            return first(str.substring(1, str.length()));
        }
    }

	public static void main(String[] args) {
		
		System.out.println(first("millSerZ"));
	}

}
