package calculator;

import java.util.Scanner;

public class MyCalculator {
	static Scanner scnr = new Scanner(System.in);
	
	//Helper method to get a valid input from the user
	static double getValidInput(Scanner scnr) {
		while(!scnr.hasNextDouble()) {
			System.out.println("Invalid input. Please enter a number:");
			scnr.next(); // discard invalid input
		}
		return scnr.nextDouble();
	}
		
	private static void standardMode() {
		System.out.println("Enter (+) for addition, (-) for subtraction, (*) for multiplication, (/) for division: ");
		String operation = scnr.nextLine();
		
		System.out.println("Enter the number of operands: ");
		int count = scnr.nextInt();
		
		double result = 0;
		switch(operation) {
			case "+": 
				result = ArithmeticCalculator.add(scnr, count); 
				break;
			case "-": 
				result = ArithmeticCalculator.sub(scnr, count);
				break;
			case "*": 
				result = ArithmeticCalculator.mult(scnr, count);
				break;
			case "/": 
				result = ArithmeticCalculator.div(scnr, count);
				break;
			default:
				System.out.println("Invalid Operator");
				return;
		}
		System.out.println("Result: " + result);
		scnr.nextLine();
	} 
	 
	public static void main(String[] args) {
		while (true) {
			System.out.println("Choose calculator mode: Standard or Scientific?"); 
			String mode = scnr.nextLine().toLowerCase();
			
			if (mode.equals("standard")) { 
				System.out.println("The calculator will operate in standard mode.");
				standardMode();
			
			} else if(mode.equals("scientific")) { 
				System.out.println("The calculator will operate in scientific mode.");
				ScientificCalculator.trigFunctions(scnr);
			} else {
				System.out.println("Invalid mode operation. Try again.");
			}
			
			System.out.println("Do you want to start over? (Y/N)");
			String restart = scnr.nextLine();
			if(!restart.equalsIgnoreCase("Y")) {
				System.out.println("Goodbye!");
				break;
			}	
		}
		scnr.close();
	}

} 
