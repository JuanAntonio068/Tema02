package parte5;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "tirada1", donde vamos a guardar la primera tirada del
		// usuario
		String tirada1;

		// Declaramos la variable "tirada2", donde vamos a guardar la segunda tirada del
		// usuario
		String tirada2;

		// Declaramos la variable "num1", donde vamos a guardar el valor númerico de la
		// primera tirada
		int num1 = 0;

		// Declaramos la variable "num2", donde vamos a guardar el valor númerico de la
		// segunda tirada
		int num2 = 0;

		boolean salir = true;

		do {

			salir = true;
			// Preguntamos al usuario cuánto ha sacado en la primera tirada
			System.out.println("¿Cuánto has sacado en la primera tirada (En formato cadena)");

			tirada1 = sc.next().toUpperCase();

			switch (tirada1) {
			case "UNO" -> { // Si la tirada es 1 le damos a "num1" el valor 1
				num1 = 1;
			}
			case "DOS" -> { // Si la tirada es 2 le damos a "num1" el valor 2
				num1 = 2;
			}
			case "TRES" -> { // Si la tirada es 3 le damos a "num1" el valor 3
				num1 = 3;
			}
			case "CUATRO" -> { // Si la tirada es 4 le damos a "num1" el valor 4
				num1 = 4;
			}
			case "CINCO" -> { // Si la tirada es 5 le damos a "num1" el valor 5
				num1 = 5;
			}
			case "SEIS" -> { // Si la tirada es 5 le damos a "num1" el valor 6
				num1 = 6;
			}
			default -> { // El valor introducido es inválido
				System.out.println("Introduce un valor válido");
				salir = false;
			}

			}
			;

			// Esto se repite si no se ha introducido un valor válido
		} while (!salir);

		do {
			salir = true;
			// Preguntamos al usuario cuánto ha sacado en la segunda tirada
			System.out.println("¿Cuánto has sacado en la segunda tirada (En formato cadena)");

			tirada2 = sc.next().toUpperCase();

			switch (tirada2) {
			case "UNO" -> { // Si la tirada es 1 le damos a "num2" el valor 1
				num2= 1;
			}
			case "DOS" -> { // Si la tirada es 2 le damos a "num2" el valor 2
				num2= 2;
			}
			case "TRES" -> { // Si la tirada es 3 le damos a "num2" el valor 3
				num2= 3;
			}
			case "CUATRO" -> { // Si la tirada es 4 le damos a "num2" el valor 4
				num2= 4;
			}
			case "CINCO" -> { // Si la tirada es 5 le damos a "num2" el valor 5
				num2= 5;
			}
			case "SEIS" -> { // Si la tirada es 6 le damos a "num2" el valor 6
				num2= 6;
			}
			default -> { // El valor introducido es inválido
				System.out.println("Introduce un valor válido");
				salir = false;
			}

			};

			// Esto se repite si no se ha introducido un valor válido
		} while (!salir);

		// Hacemos la suma e imprimimos el resultado
		System.out.println(num1 + num2);

		// Cerramos el escaner
		sc.close();
	}

}
