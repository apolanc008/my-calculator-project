package calculator;

import java.util.Scanner;
import java.util.Set;

public class ScientificCalculator {
	// Trigonometric functions
	public static void trigFunctions(Scanner scnr) {
		System.out.println("Enter the trigonometric function you want to compute:");
		String trigFun = scnr.nextLine().toLowerCase();
		
		Set<String> validFunctions = Set.of("sine", "cosine", "tangent");
		if(!validFunctions.contains(trigFun)) {
			System.out.println("Invalid function.");
			return; // exit method
		}	
		
		System.out.println("Enter angle value in radians:");
		double radVal = MyCalculator.getValidInput(scnr);
		scnr.nextLine(); // consume newline
		
		double trigVal = 0;
		switch(trigFun) {
			case "sine": 
				trigVal = Math.sin(radVal);
				break;
			case "cosine":
				trigVal = Math.cos(radVal);
				break;
			case "tangent": 
				trigVal = Math.tan(radVal);
				break;
		}
		System.out.println("Result: " + trigVal);
	}
	
}
