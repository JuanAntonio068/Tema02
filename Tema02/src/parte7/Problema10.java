package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num = 0;

		// Declaramos la variable "numStr", donde vamos a transformar el numero entero
		// en un String
		String numStr;

		// Declaramos la variable "numRevertido", donde vamos a guardar el número al
		// revés
		String numRevertido;

		// Iniciamos la variable "error", donde vamos a verificar que el valor
		// introducido es correcto
		boolean error = false;

		// Bucle donde nos aseguramos que el valor introducido es correcto
		do {
			try {
				error = false;

				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				num = sc.nextInt();

			} catch (InputMismatchException e) {// El usuario ha introducido un valor incorrecto

				System.out.println("El valor tiene que ser un número entero");

				error = true;
			} finally {
				sc.nextLine();
			}
		} while (error);

		numStr = Integer.toString(num);

		numRevertido = new StringBuilder(numStr).reverse().toString();

		// Verificar si el número es capicúa
		if (numStr.equals(numRevertido)) {// El número es capicúa
			System.out.println("El número " + num + " es capicúa.");
		} else { // El número no es capicúa
			System.out.println("El número " + num + " no es capicúa.");
		}

		// Cerramos el escaner
		sc.close();
	}

}
