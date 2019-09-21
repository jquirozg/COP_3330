package quiroz_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int dataIn;
		int firstDigit, secondDigit, thirdDigit, fourthDigit;
		
		System.out.print("Please enter the data to decrypt (four-digit integers): ");
		dataIn = scnr.nextInt();
		
		// Getting digits in the right order
		thirdDigit = dataIn / 1000;
		fourthDigit = (dataIn % 1000) / 100;
		firstDigit = (dataIn % 100) / 10;
		secondDigit = dataIn % 10;
		
		// Decrypting
		firstDigit = (firstDigit + 3) % 10;
		secondDigit = (secondDigit + 3) % 10;
		thirdDigit = (thirdDigit + 3) % 10;
		fourthDigit = (fourthDigit + 3) % 10;
		
		System.out.printf("%d%d%d%d%n", firstDigit, secondDigit, thirdDigit, fourthDigit);
				
	}

}
