package parte5;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "num", donde se va a guardar el resultado de la suma
		int num = 0;

		// Declaramos la variable "contador", donde el usuario va introducir el número
		// de sumas
		int contador;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");

		contador = sc.nextInt();

		do {

			num += contador;

			// Restamos a "contador" 1
			contador--;

			// Esto se repite mientras "contador" sea mayor que 0
		} while (contador > 0);

		// Imprimimos el resultado
		System.out.println(num);

		// Cerramos el escaner
		sc.close();
	}

}
