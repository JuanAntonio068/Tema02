package parte6;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número escrito por el
		// usuario
		int num;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");

		num = sc.nextInt();

		// Iniciamos la variable for
		for (int i = 1; i <= num; i++) {

			// Imprimimos la variable "i"
			System.out.println(i);
		}

		// Cerramos el escaner
		sc.close();
	}

}
