package com.gmail.yeatz0408.recursion;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(9));

	}
	
    public static int factorial(int num) {
        
    if (num == 0) {return 1;}
    
    return num * factorial(num-1);
    }

}
