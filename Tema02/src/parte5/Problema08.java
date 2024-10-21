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
		int num1;

		// Declaramos la variable "num2", donde vamos a guardar el valor númerico de la
		// segunda tirada
		int num2;

		do {
			// Preguntamos al usuario cuánto ha sacado en la primera tirada
			System.out.println("¿Cuánto has sacado en la primera tirada (En formato cadena)");

			tirada1 = sc.next().toUpperCase();

			num1 = switch (tirada1) {
			case "UNO" -> { // Si la tirada es 1 le damos a "num1" el valor 1
				yield 1;
			}
			case "DOS" -> { // Si la tirada es 2 le damos a "num1" el valor 2
				yield 2;
			}
			case "TRES" -> { // Si la tirada es 3 le damos a "num1" el valor 3
				yield 3;
			}
			case "CUATRO" -> { // Si la tirada es 4 le damos a "num1" el valor 4
				yield 4;
			}
			case "CINCO" -> { // Si la tirada es 5 le damos a "num1" el valor 5
				yield 5;
			}
			case "SEIS" -> { // Si la tirada es 5 le damos a "num1" el valor 6
				yield 6;
			}
			default -> { // El valor introducido es inválido
				System.out.println("Introduce un valor válido");
				yield -1; // Se le pone -1 indicando el error
			}

			};

			// Esto se repite si no se ha introducido un valor válido
		} while (!tirada1.equals("UNO") && !tirada1.equals("DOS") && !tirada1.equals("TRES")
				&& !tirada1.equals("CUATRO") && !tirada1.equals("CINCO") && !tirada1.equals("SEIS"));

		do {
			// Preguntamos al usuario cuánto ha sacado en la segunda tirada
			System.out.println("¿Cuánto has sacado en la segunda tirada (En formato cadena)");

			tirada2 = sc.next().toUpperCase();

			num2 = switch (tirada2) {
			case "UNO" -> { // Si la tirada es 1 le damos a "num2" el valor 1
				yield 1;
			}
			case "DOS" -> { // Si la tirada es 2 le damos a "num2" el valor 2
				yield 2;
			}
			case "TRES" -> { // Si la tirada es 3 le damos a "num2" el valor 3
				yield 3;
			}
			case "CUATRO" -> { // Si la tirada es 4 le damos a "num2" el valor 4
				yield 4;
			}
			case "CINCO" -> { // Si la tirada es 5 le damos a "num2" el valor 5
				yield 5;
			}
			case "SEIS" -> { // Si la tirada es 6 le damos a "num2" el valor 6
				yield 6;
			}
			default -> { // El valor introducido es inválido
				System.out.println("Introduce un valor válido");
				yield -1; // Se le pone -1 indicando el error
			}

			};

			// Esto se repite si no se ha introducido un valor válido
		} while (!tirada2.equals("UNO") && !tirada2.equals("DOS") && !tirada2.equals("TRES")
				&& !tirada2.equals("CUATRO") && !tirada2.equals("CINCO") && !tirada2.equals("SEIS"));
		
		// Hacemos la suma e imprimimos el resultado
		System.out.println(num1 + num2);
		
		// Cerramos el escaner
		sc.close();
	}

}
