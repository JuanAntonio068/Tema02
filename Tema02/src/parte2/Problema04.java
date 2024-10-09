package parte2;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "tirada1", donde vamos a guardar la primera tirada del
		// usuario
		String tirada1;
		// Declaramos la variable "tirada2", donde vamos a guardar la segunda tirada del
		// usuario
		String tirada2;
		// Declaramos la variable "num1"
		int num1;

		int num2;

		System.out.println("¿Cuánto has sacado en la primera tirada (En formato cadena)");
		tirada1 = sc.next().toUpperCase();

		num1 = switch (tirada1) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Introduce un valor válido");
			yield -1;
		}

		};

		System.out.println("¿Cuánto has sacado en la segunda tirada (En formato cadena)");
		tirada2 = sc.next().toUpperCase();

		num2 = switch (tirada2) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Introduce un valor válido");
			yield -1;
		}

		};

		System.out.println(num1 + num2);

		sc.close();
	}

}
