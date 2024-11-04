package parte7;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: num1 = 2 num2 = 4
		// Resultado esperado: 4
		// Resultado obtenido: 4

		// Prueba 2
		// Valor de entrada: mum1 = 11 num2 = 13
		// Resultado esperado: 143
		// Resultado obtenido: 143 
		
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num1", donde vamos a guardar el primer número
		// introducido por el usuario
		int num1;

		// Declaramos la variable "num2", donde vamos a guardar el segundo número
		// introducido por el usuario
		int num2;

		// Declaramos la variable "mayor", donde vamos a guardar el número que sea mayor
		int mayor;

		// Inciamos la variable "múltiplo", donde vamos a guardar el mínimo común
		// múltiplo
		int múltiplo = 0;

		do {// Bucle que se repetirá hasta que "num1" y "num2" no sean iguales

			// Preguntamos al usuario por dos números
			System.out.println("Dime dos números");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

		} while (num1 == num2);

		// Iniciamos la comparación
		if (num1 > num2) {// "num1" es mayor que "num2"
			mayor = num1;
		} else {// "num2" es mayor que "num1"
			mayor = num2;
		}

		// Empezamos con el número mayor
		múltiplo = mayor;

		while (múltiplo % num1 != 0 || múltiplo % num2 != 0) {// Iniciamos el bucle, del cuál vammos a salir cuando
																// demos con el mínimo común múltiplo

			múltiplo++;
		}
		// Imprimimos el resultado
		System.out.println("El mínimo común múltiplo de " + num1 + " y " + num2 + " es: " + múltiplo);

		// Cerramos el escaner
		sc.close();
	}

}
