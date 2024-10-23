package parte6;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num;

		// Declaramos la variable "primo", donde vamos a verificar si es primo
		int divisor = 0;
		// Preguntamos al usuario por número
		System.out.println("Dime un número");

		num = sc.nextInt();

		for (int i = num; i <= 0;) {

			// Preguntamos al usuario por número
			System.out.println("El número tiene que ser positivo");

			num = sc.nextInt();
		}
		for (int i = num; i >1; i--) {

			if (num % i == 0) {
				divisor++;
			}
		}
		// Realizamos la comparación
		if (divisor > 1 || num == 1) {// El número no es primmo

			// Imprimimos el resultado
			System.out.println("El número " + num + " no es primo");
		} else
			// Imprimimos el resultado
			System.out.println("El número " + num + " es primo");

		// Cerramos el escaner
		sc.close();
	}

}
