package parte6;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introucido por
		// el usuario
		int num;

		// Iniciamos la variable "suma", donde vamos a ir sumando todos los números
		// introudcidos
		int suma = 0;

		// Declaramos la varibable "media", donde vamos a calcular la media
		double media;

		// Iniciamos la variable for
		for (int i = 0; i < 10; i++) {

			// Preguntamos al usuario por el usuario
			System.out.println("Dime un número");

			num = sc.nextInt();

			suma += num;

		}

		media = (double) suma / 10;

		// Imprimimos el resultado
		System.out.println("La media es: " + media);

		// Cerramos el escaner
		sc.close();
	}

}
