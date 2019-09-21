package quiroz_p2;

import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		
		int option;
		double userWeight, userHeight, BMI;
		boolean ask = true;
		
		// While loop in case the user doesn't select option 1 or 2.
		while (ask) {
			System.out.print("To calculate your BMI using Pounds and Inches enter 1, or Kilograms and Meters enter 2: "); 
			option = scnr.nextInt();
			
			if (option == 1) {
				System.out.print("Enter your weight in lbs: ");
				userWeight = scnr.nextDouble();
				
				System.out.print("Enter your height in inches: ");
				userHeight = scnr.nextDouble();
				
				BMI = (703 * userWeight) / (userHeight * userHeight);
				
				System.out.println();
				System.out.printf("%s %.2f%n", "Your BMI:", BMI);
				
				ask = false;
			}
			else if (option == 2) {
				System.out.print("Enter your weight in kg: ");
				userWeight = scnr.nextDouble();
				
				System.out.print("Enter your height in meters: ");
				userHeight = scnr.nextDouble();
				
				BMI = (userWeight) / (userHeight * userHeight);
				
				System.out.println();
				System.out.printf("%s %.2f%n", "Your BMI:", BMI);
				
				ask = false;
			}
			else {
				continue;
		}
		
		System.out.println();
		System.out.println("BMI Categories:");
		System.out.println("  Underweight =< 18.5");
		System.out.println("  Normal weight = 18.5-24.9");
		System.out.println("  Overweight = 25-29.9");
		System.out.println("  Obesity = BMI of 30 or greater");
		
		}
	}

}
