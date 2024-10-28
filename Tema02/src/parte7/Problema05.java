package parte7;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: 4
		// Resultado esperado: 1
		//					   22
		//					   333
		//					   4444
		// Resultado obtenido: 1
		//					   22
		//					   333
		//					   4444

		// Prueba 2
		// Valor de entrada: 3
		// Resultado esperado: 1
		//					   22
		//					   333
		// Resultado obtenido: 1
		//					   22
		//					   333
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num;

		do {// Iniciamos un bucle, del cual no se puede salir hasta que el usuario
			// introduzca un valor válido

			// Preguntamos al usuario por un número entre 0 y 20
			System.out.println("Dime un número entre 0 y 20");
			num = sc.nextInt();

		} while (num < 0 || num > 20);

		// Inciamos un bucle for, que empieza en 1 y no para hasta valer más que el
		// número introducido
		for (int i = 1; i <= num; i++) {

			// Iniciamos un bucle for, el cual va a servir para las repeticiones de números
			for (int j = 1; j <= i; j++) {

				// Imprimimos el resultado
				System.out.print(i);
			}
			// Este println lo utilizamos para hacer el salto de línea
			System.out.println();
		}

		// Cerramos el escaner
		sc.close();
	}

}
