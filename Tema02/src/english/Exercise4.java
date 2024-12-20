package english;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		// Create the Scanner
		Scanner sc = new Scanner(System.in);

		// Create the variable "num"
		int num;

		// Create the variable "numRandom"
		int numRandom = (int) (Math.random() * 101);

		// We ask to the user for a number
		System.out.println("You have to guess one random number, introduce one nunmber between 1 and 100");

		num = sc.nextInt();

		while (num != numRandom && num != -1) {
			if (num < numRandom) {// The number is minor
				System.out.println(num + " is minor than the mystery number");
			} else if (num > numRandom) {// The number is bigger
				System.out.println(num + " is bigger than the mystery number");

			}
			// We ask to the user for another number
			System.out.println("Introduce another nunmber between 1 and 100");

			num = sc.nextInt();
		}
		if (num == numRandom) {// The number is equals to the mystery number, so the user wins
			System.out.println("Congratulations, you guessed the mystery number: " + num);
		} else {// The number is not equals to the mystery number, so the user loses
			System.out.println("You lose");
		}
		// We close the scanner
		sc.close();
	}

}
