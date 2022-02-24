package com.gmail.yeatz0408.recursion;

public class IsPalindrome {
	
	public static boolean isPalindrome(String s)
    {   
        
		if (s.charAt(0) == s.charAt(s.length()-1)) {
			
			if (s.length() == 2 && s.charAt(0) == s.charAt(1)) {
				return true;
			}
			
			if (s.length() >= 3 && !(s.isEmpty()) && !(s.isBlank())) {
				isPalindrome(s = s.substring(1, s.length()-1));
			}
		} else {
			return false;
		}
		
		return true;
    }

	public static void main(String[] args) {

		System.out.println(isPalindrome("tomato"));
		System.out.println(isPalindrome("tacocat"));
		System.out.println(isPalindrome("aaiaa"));
		System.out.println(isPalindrome("iaai"));
		
	}

}
