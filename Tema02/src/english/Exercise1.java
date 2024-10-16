package english;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Create the variable "num", that will be used for saving the number introduced by the user
		int num;
	
		// We ask to the user dor a number
		System.out.println("Tell me a number");
		
		num = sc.nextInt();
		
		while (num > 0) {
			if (num % 2 == 0) {// The number is even
				System.out.println("The number " + num + " is even");
			}else { //The number is odd
				System.out.println("The number " + num + " is odd");
			}
			// We ask for another number
			System.out.println("Tell me another number");
			
			num = sc.nextInt();
		}
		
		// We close the scanner
		sc.close();
	}

}
