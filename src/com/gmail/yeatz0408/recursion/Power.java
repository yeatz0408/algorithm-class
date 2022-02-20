package com.gmail.yeatz0408.recursion;

public class Power {
	
	public static void main(String[] args) {
		
		System.out.println(power(2, 5));

	}

    public static int power(int base, int exponent) {
        
        if (exponent < 0 || base < 0) {
            return -1;
        }
        
        if (exponent == 0) {
            return 1;
        }
        
        return base * power(base, exponent-1);
    }
	
}
