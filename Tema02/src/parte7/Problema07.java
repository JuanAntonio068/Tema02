package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: 4
		// Resultado esperado: 1
		//					   121
		//					   12321
		//					   1234321
		// Resultado obtenido: 1
		//					   121
		//					   12321
		//					   1234321
		// Prueba 2
		// Valor de entrada: 3
		// Resultado esperado: 1
		//					   121
		//					   12321
		// Resultado obtenido: 1
		//					   121
		//					   12321
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num = 0;

		// Iniciamos la variable "error", donde vamos a verificar que el valor
		// introducido es correcto
		boolean error = false;

		// Bucle, donde vamos a vereficar que el valor es correcto
		do {
			try {

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				num = sc.nextInt();

				error = false;

			} catch (InputMismatchException e) {// El valor es incorrecto
				System.out.println("Introduce un valor correcto");
				error = true;

			} finally {
				sc.nextLine();
			}

		} while (error);

		// Bucle donde se va a construir la pirámide
		for (int i = 1; i <= num; i++) {
			// Bucle donde se va a construir la parte izquierda de la pirámide

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			// Bucle donde se va a construir la parte derecha de la pirámide
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}

			// Salto de línea
			System.out.println();
		}

		// Cerramos el escaner
		sc.close();
	}

}
