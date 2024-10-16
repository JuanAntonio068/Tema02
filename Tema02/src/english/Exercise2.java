package english;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Create the variable "num"
		int num;
		// Create the variable "counter"
		int counter = 0;
		// We ask to the user for a number
		System.out.println("Tell me a number");

		num = sc.nextInt();

		while (counter <= 10) {
			// We print the result
			System.out.println(num + " * " + counter + " = " + num * counter);
			counter++;
		}
		// We close the scanner
		sc.close();
	}

}
