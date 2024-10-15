package parte3;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		int decimas;

		int unidades;
		System.out.println("Dime un número entre 1 y 99");

		num = sc.nextInt();
		if (num < 1 || num > 99) {
			System.out.println("Introduce un núemro entre 1 y 99");
		} else {
			decimas = num / 10;

			unidades = num % 10;
		}
	}
}
