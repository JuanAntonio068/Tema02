package parte7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema09 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: 1
		// Resultado esperado: 1 dígito
		// Resultado obtenido: 1 dígito

		// Prueba 2
		// Valor de entrada: 10 
		// Resultado esperado: 2 dígitos
		// Resultado obtenido: 2 dígitos
		
		// Prueba 3
		// Valor de entrada: 1000
		// Resultado esperado: 3 dígitos
		// Resultado obtenido: 3 dígitos

		// Prueba 4
		// Valor de entrada: -1
		// Resultado esperado: El número tiene que ser mayor o igual que 0
		// Resultado obtenido: El número tiene que ser mayor o igual que 0
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num = 0;

		// Iniciamos la variable "error", donde vamos a verificar que el valor
		// introducido es correcto
		boolean error = false;

		// Iniciamos la variable "digitos", donde vamos a ir contando los dígitos que
		// tenga el número
		int digitos = 0;

		do {
			try {
				// Preguntamos al usuario por un número
				System.out.println("Dime un número");
				num = sc.nextInt();

				assert num >= 0 : "El número tiene que ser mayor o igual que 0";
				error = false;

			} catch (InputMismatchException e) {// El valor es incorrecto
				System.out.println("Introduce un valor correcto");
				error = true;

			} finally {
				sc.nextLine();
			}

		} while (error);

		while (num != 0) {
			num /= 10;

			digitos++;
		}

		// Imprimimos el resultado
		System.out.println("El número que has introducido tiene " + digitos + " dígitos");

		// Cerramos el escaner
		sc.close();
	}

}
