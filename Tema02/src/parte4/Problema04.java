package parte4;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		// Cerramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número dado por el
		// usuario
		int num;

		// Iniciamos la variable "contador", donde vamos a ir llevando la cuenta de
		// cuantas veces se repite el bucle
		int contador = 0;

		// Iniciamos la variable "suma", donde vamos a guardar la suma de los números
		// positivos
		int suma = 0;

		// Iniciamos la variable "sumaNegativa", donde vamos a guardar la suma de los
		// números negativos
		int sumaNegativa = 0;

		// Iniciamos la variable "media", donde vamos a guardar el número de números
		// negativos que se han introducido
		int media = 0;

		// Iniciamos la variable "ceros", donde vamos a guardar el número de ceros que
		// se han introducido
		int ceros = 0;

		while (contador < 10) {

			// Preguntamos al usuario por un número
			System.out.println("Dime un número");

			num = sc.nextInt();

			if (num > 0) {// El número es positivo
				suma += num;
			} else if (num == 0) {// El número es cero
				ceros++;
			} else {// El número es negativo
				media++;
				sumaNegativa += num;
			}

			contador++;
		}
		// Imprimimos el resultado de la suma de los números positivos
		System.out.println("La suma de todos los números positivos que has introducido es: " + suma);

		// Imprimimos el número de ceros que se han introducido
		System.out.println("El número de ceros que has introducido es: " + ceros + " ceros");

		// Comprobamos si se han introducido números negativos, si es el caso se imprime
		// el resultado de la media de los números negativos
		System.out.println((media != 0)
				? "La media de los números negativos que has introducido es: " + (double) sumaNegativa / media
				: "No has introducido números negativos");

		// Cerramos el escaner
		sc.close();

	}

}
