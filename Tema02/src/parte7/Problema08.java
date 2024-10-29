package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "num", donde vamos a guardar el valor introducido por
		// el usuario
		int num = 0;

		//Iniciamos la variable "numNuevo"
		int numNuevo = 0;
		
		// Iniciamos la variable "cont", donde vamos a ir contando los números
		// introducidos
		int cont = 0;

		// Iniciamos la variable "numFallidos", donde vamos a ir contando las veces que
		// el usuario ha fallado
		int numFallados = 0;

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

		while (num > 0) {
			
			System.out.println("Dime otro número");
			
		}
	}

}
