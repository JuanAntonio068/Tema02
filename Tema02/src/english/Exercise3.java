package english;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// Create the Scanner
		Scanner sc = new Scanner(System.in);

		// Create the variable "height"
		double height;

		// Create the variable "tallest
		double tallest = 0;

		// Create the variable "lowest"
		double lowest = -1;

		// We ask to the user for a height
		System.out.println("Tell me the height of one of your classmates");

		height = sc.nextDouble();

		while (height != -1) {
			
			if (tallest < height) {// The new height is the tallest
				tallest = height;
			} else if (lowest > height) {// The new height is the lowest
				lowest = height;
			}
			// We ask for another height 
			System.out.println("Tell me another height of one of your classmates");
			
			height = sc.nextDouble();
		}
		// We print the result
		System.out.println("The hightest height is: " + tallest + " and the lowest is: " + lowest);
		// We close the scanner
		sc.close();
	}

}
