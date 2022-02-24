package com.gmail.yeatz0408.recursion;

public class Reverse {
	
	// returns a given String reversed
	
	static String toReturn = "";
	
    public static String reverse(String str)
    {
    	
    	if(str.isEmpty()) {
    		return toReturn;
    	}
    	
    	toReturn += str.charAt(str.length()-1);
    	
    	reverse(str = str.substring(0, str.length()-1));
        
        return toReturn;
    }
    
    //answer
    public static String reverse2(String str)
    {
    	System.out.println(str);
    	
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse2(str.substring(1)) + str.charAt(0);
    }

	public static void main(String[] args) {

		System.out.println(reverse("reverse"));
		
		System.out.println();
		System.out.println(reverse2("reverse"));
		
	}

}
