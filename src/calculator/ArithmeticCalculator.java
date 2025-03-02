package calculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	// Add 
	public static double add(Scanner scnr, int count) {
		if(!isValidCount(count))	return Double.NaN;
		double sum = 0; 
		System.out.println("Enter " + count + " numbers to perform operation:");
		
		for(int i = 0; i < count; i++) {
			sum += MyCalculator.getValidInput(scnr);
		}
		return sum;
	}

	// Subtract 
	public static double sub(Scanner scnr, int count) {
		if(!isValidCount(count))	return Double.NaN;
	    System.out.println("Enter " + count + " numbers to perform operation:");  
	    double diff = MyCalculator.getValidInput(scnr); 
	    
	    for(int i = 1; i < count; i++) {
	    	diff -= MyCalculator.getValidInput(scnr);
	    }
	    return diff;
	}

	// Multiply
	public static double mult(Scanner scnr, int count) {
		if(!isValidCount(count))	return Double.NaN;
		System.out.println("Enter " + count + " numbers to perform operation:");  
	    double prod = MyCalculator.getValidInput(scnr);
	    
		for(int i = 1; i < count; i++) {
			prod *= MyCalculator.getValidInput(scnr);
		}
		return prod;
	}

	// Divide
	public static double div(Scanner scnr, int count) {
		if(!isValidCount(count))	return Double.NaN;
		System.out.println("Enter " + count + " numbers to perform operation:");  
		double quot = MyCalculator.getValidInput(scnr);
	    
		for(int i = 1; i < count; i++) {
			double divisor; 
			do {
				divisor = MyCalculator.getValidInput(scnr);
				if(divisor == 0) {
					System.out.println("Error: Division by zero.\nEnter a valid number.\n");
				}
			} while(divisor == 0);
			
			quot /= divisor; 
		}
	    return quot;
	}
	
	// Helper method to ensure count is valid
	private static boolean isValidCount(int count) {
		if(count < 1) {
			System.out.println("Error! Please enter at least one number.");
			return false;
		}
		return true;
	}
	
}
