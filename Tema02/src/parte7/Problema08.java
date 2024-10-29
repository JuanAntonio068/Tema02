package parte7;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: 3, 6, 7, 8, 2, 0
		// Resultado esperado: 5 números introducidos y un fallo
		// Resultado obtenido: 5 números introducidos y un fallo

		// Prueba 2
		// Valor de entrada: 50, 23, 23, 1, 2, 3, 4, 5, 0 
		// Resultado esperado: 8 números introducidos y 7 fallos
		// Resultado obtenido: 8 números introducidos y 7 fallos
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "num", donde vamos a guardar el valor introducido por
		// el usuario
		int num = 0;

		//Iniciamos la variable "numNuevo"
		int numNuevo = 1;
		
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

		while (numNuevo != 0) {//El bluce donde el juego procede, el cuál no se detiene hasta que el usuario introduzca un 0
			
			//Preguntamos al usuario por otro número
			System.out.println("Dime otro número mayor");
			numNuevo = sc.nextInt();
			
			if (numNuevo > num || numNuevo == 0) {//El número es correcto o es 0
				num = numNuevo;
			}
			else {//El número es incorrecto
				System.out.println("Has fallado, el número introducido no es mayor");
				
				numFallados++;
			}
			cont++;
		}
		//Imprimimos el resultado
		System.out.println("Has introducido " + cont + " números");
		System.out.println("Has introducido " + numFallados + " intentos fallidos");
		
		//Cerramos el escaner
		sc.close();
	}

}
