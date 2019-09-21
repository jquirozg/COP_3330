package quiroz_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int dataIn;
		int firstDigit, secondDigit, thirdDigit, fourthDigit;
		
		System.out.print("Please enter the data to encrypt (four-digit integers): ");
		dataIn = scnr.nextInt();
		
		firstDigit = dataIn / 1000;
		secondDigit = (dataIn % 1000) / 100;
		thirdDigit = (dataIn % 100) / 10;
		fourthDigit = dataIn % 10;
		
		// Encrypting
		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		System.out.printf("%d%d%d%d%n", thirdDigit, fourthDigit, firstDigit, secondDigit);
				
	}

}
