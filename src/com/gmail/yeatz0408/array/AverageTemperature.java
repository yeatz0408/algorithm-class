package com.gmail.yeatz0408.array;
import java.util.Scanner;

public class AverageTemperature {
	
	public static void main(String[] args) {

		start();
		
	}
	
	public static double start() {
		
		// declare initial variables		
		Scanner scanner = new Scanner(System.in);
		String stringDays;
		int intDays;
		double[] temperatures;
		double sum = 0;
		
		// input the number of days and check if the input is in a double format
		System.out.println("How many days do you want to record?");
		stringDays = scanner.nextLine();
		
		if(isNumeric(stringDays)) {
			intDays = Integer.parseInt(stringDays);
		} else {
			System.out.println("Please insert an integer number.");
			start();
			return 0.0;
		}
		
		
		// insert temperatures in the array
		temperatures = new double[intDays];

		int index = 0;
		while(index < temperatures.length) {
			
			System.out.println("Please input the temperature of day " + (index+1));
			
			String tempString = scanner.nextLine();
			
			if(isNumeric(tempString)) {
				temperatures[index] = Double.parseDouble(tempString);
				sum += temperatures[index];
				index++;
			} else {
				System.out.println("Please input a number");
				continue;
			}
		}
		
		
		// calculate the average based on the inputs and return	
		double average = sum / intDays;
		System.out.println("The average temperature is " + average);
		
		return average;
	}
	
	// check if the input is double
	public static boolean isNumeric(String string) {
		
		try {
			Double.parseDouble(string);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
