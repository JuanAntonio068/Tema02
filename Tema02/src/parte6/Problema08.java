package parte6;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "a", donde vamos a guardar el primer número
		// introducido por el usuario
		int a;

		// Declaramos la variable "b", donde vamos a guardar el segundo número
		// introducido por el usuario
		int b;

		// Preguntamos al usuario por dos números
		System.out.println("Dime dos números");

		a = sc.nextInt();

		b = sc.nextInt();

		// Iniciamos la variable i y hacemos la comparacion para saber si "a" es menor
		// que "b"
		for (int i = a; i <= b; i++) {

			System.out.println(i);

		}
		// Iniciamos la variable i y hacemos la comparacion para saber si "a" es mayor
		// que "b"
		for (int i = a; i >= b; i--) {

			System.out.println(i);
		}

		if (a == b) {// Los números son iguales
			System.out.println("Los dos números son iguales");

			// Cerramos el escaner
			sc.close();
		}
	}

}
