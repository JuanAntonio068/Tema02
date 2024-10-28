package parte7;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: 10
		// Resultado esperado: 4
		// Resultado obtenido: 4

		// Prueba 2
		// Valor de entrada: 20
		// Resultado esperado: 8
		// Resultado obtenido: 8
		
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num;

		// Iniciamos la variable "esPrimo", donde vamos a verificar si el número es
		// primo
		boolean esPrimo = true;

		// Iniciamos la variable "contadorPrimos", donde vamos a ir contando los primos
		int contadorPrimos = 0;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		num = sc.nextInt();

		// Iniciamos el bucle for
		for (int i = 2; i <= num; i++) {
			esPrimo = true;

			if (i < 2) {// El número es menor que 2, así que no es primo
				esPrimo = false;

			} else {// Hay que verificar si el número es primo

				// Iniciamos el bucle for, donde vamos a verificar si el número es primo
				for (int j = 2; j <= Math.sqrt(i); j++) {

					if (i % j == 0) {// El número no es primo
						esPrimo = false;
						break;
					}
				}
			}

			if (esPrimo) {// El número es primo, así que aumentamos el contador
				contadorPrimos++;
			}
		}
		// Imprimimos el resultado
		System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + num);

		// Cerramos el escaner
		sc.close();
	}

}
