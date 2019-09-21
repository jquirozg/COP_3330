package quiroz_p3;

import java.util.Scanner;

public class Topics_survey {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);

		String[] topics = new String[5];
		
		topics[0] = "Food";
		topics[1] = "Travel";
		topics[2] = "Friends";
		topics[3] = "Family";
		topics[4] = "Education";
		
		int[][] responses = new int[5][10];
		
		int i, j, rating;
		boolean askAgain = true;
		char cont;
		
		// For loop to initialize 2D array elements to zero
		for(i = 0; i < 5; i++) {
			for(j = 0; j < 10; j++) {
				responses[i][j] = 0;
			}
		}
		
		while(askAgain) {
	
			// For loop to store ratings from user
			for(i = 0; i < 5; i++) {
				System.out.print("Rate the topic " + topics[i] + " from 1-10: ");
				rating = scnr.nextInt();
				responses[i][rating - 1]++;		
			}
			
			System.out.print("Do you want to continue the survey? (y/n): ");
			cont = scnr.next().charAt(0);
			
			System.out.println();
			
			if(cont == 'y') {
				askAgain = true;
			}
			else {
				askAgain = false;
			}
		
		}
		
		int totalPoints = 0, totalSurveyTaken = 0, highestPoints = 0, lowestPoints = 0, highestIndex = 0, lowestIndex = 0;
		double avg = 0.0, max = -1, min = 1000000;
		
		// Start displaying summary table
		System.out.println("           1 2 3 4 5 6 7 8 9 10 | Avg");
		System.out.println("--------------------------------|-------");
		
		// For loop to print the rest of the table
		for(i = 0; i < 5; i++) {
			
			// Reseting variables
			totalPoints = 0;
			totalSurveyTaken = 0;
			
			System.out.printf("%-10s ", topics[i]);
			
			for(j = 0; j < 10; j++) {
				System.out.printf("%d ", responses[i][j]);

				// Adding up points and number of times a survey was taken
				totalPoints += (j + 1) * responses[i][j];
				totalSurveyTaken += responses[i][j];

				// When we are in the last column, calculate the average
				if (j == 9) {
					avg = totalPoints / totalSurveyTaken;
					
					// Save new values when new avg is greater than previous max value
					if (avg > max) {
						max = avg;
						highestPoints = totalPoints;
						highestIndex = i;
					}
					
					// Save new values when new avg is lesser than previous min value
					if (avg < min) {
						min = avg;
						lowestPoints = totalPoints;
						lowestIndex = i;
					}
				}
			}
			
			System.out.printf("%s %.2f%n", " | ", avg);
		}
		
		System.out.println();
		System.out.println("The topic with the highest point total is " + topics[highestIndex] + " with " + highestPoints + " points.");
		System.out.println("The topic with the lowest point total is " + topics[lowestIndex] + " with " + lowestPoints + " points.");		
	}

}
