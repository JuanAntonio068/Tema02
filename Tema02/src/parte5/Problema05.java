package parte5;

import java.util.Scanner;

import java.util.Random;

public class Problema05 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos el randomizador
		Random random = new Random();

		// Iniciamos la variable "num", que va a ser el número aleatorio
		int num = random.nextInt((101 - 1) + 1) + 1;

		// Declaramos la variable "jugador", donde vamos a gaurdar la decisión del
		// jugador
		String jugador;

		// Preguntamos al usuario si es su número
		System.out.println("¿Tu número es: " + num + "?");

		jugador = sc.next().toUpperCase();
		
		do {
			// Preguntamos al usuario si es su número
			System.out.println("¿Tu número es: " + num + "?");

			jugador = sc.next().toUpperCase();

			if (jugador.equals("MENOR")) {// El número del usuario es menor al dicho
				num = random.nextInt(num);
			}
			else if (jugador.equals("MAYOR")) {// El número del usuario es mayor al dicho
				num = random.nextInt((100 - num) + 1) + num;
			}
			// Se repite hasta que sea igual
		} while (jugador != "IGUAL");

		// Imprimimos el resultado
		System.out.println("El número era " + num);

		// Cerramos el escaner
		sc.close();
	}

}
