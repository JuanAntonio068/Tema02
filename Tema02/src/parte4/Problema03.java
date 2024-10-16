package parte4;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número dado por el
		// usuario
		int num;

		// Iniciamos la variable "suma", donde vamos a sumar los números dados por el
		// usuario
		int suma = 0;

		// Inciamos la variable "media", donde vamos a llevar la cuenta del número de
		// números que se han introducido
		int media = 0;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");

		num = sc.nextInt();

		// Mientras que el número sea positivo se repite el bucle
		while (num > 0) {

			suma += num;

			media++;
			// Preguntamos al usuario por otro número
			System.out.println("Dime otro número");

			num = sc.nextInt();
		}
		// Imprimimos el resultado
		System.out.println("La media de los números que se han introducido es: " + (double) suma / media);

		// Cerramos el escaner
		sc.close();
	}

}
