package parte7;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num;

		// Iniciamos la variable "divisores", donde vamos a guardar los divisores van a
		// tener los números
		int divisores = 0;

		// Iniciamos la variable "primos", donde vamos a guardar el número de números
		// que son primos
		int primos = 0;

		do {// Bucle que se repetirá hasta introducir un valor correcto

			// Preguntamos al usuario por un número
			System.out.println("Dime un número");
			num = sc.nextInt();

		} while (num <= 1);

		for (int i = 2; i > 1; i++) {// En este for se va a ir evaluando número por número cuál es primo y cuál no

			if (num % i == 0) {
				divisores++;
			} else if (num % i != 0) {// El número tiene un divisor más

			} else if (divisores == 1) {// El número es primo
				primos++;

			}
			num--;
		}
		// Imprimos el resultado
		System.out.println("Entre 1 y " + num + " hay " + primos + " números primos");

		// Cerramos el escaner
		sc.close();
	}

}
