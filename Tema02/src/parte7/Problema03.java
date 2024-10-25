package parte7;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: num1 = 4 num2 = 7
		// Resultado esperado: 1
		// Resultado obtenido: 1

		// Prueba 2
		// Valor de entrada: mum1
		// Resultado esperado:
		// Resultado obtenido:

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num1", donde vamos a guardar el primer número
		// introducido por el usuario
		int num1;

		// Declaramos la variable "num2", donde vamos a guardar el segundo número
		// introducido por el usuario
		int num2;

		// Declaramos la variable "menor", donde vamos a guardar el número que sea menor
		int menor;

		int divisor = 1;

		do {// Bucle que se repetirá hasta que "num1" y "num2" no sean iguales

			// Preguntamos al usuario por dos números
			System.out.println("Dime dos números");
			num1 = sc.nextInt();
			num2 = sc.nextInt();

		} while (num1 == num2);

		// Iniciamos la comparación
		if (num1 < num2) {// "num1" es menor que "num2"

			menor = num1;
		} else {// "num2" es menor que "num1"
			menor = num2;
		}

		for (int i = menor; !(num1 % i == 0) && !(num2 % i == 0); i--) {// En este for se va ir mirando número por
																		// número, para ver cuál es
			// divisible entre "num1" y "num2" simultaneamente

			divisor = i;

		}

		// Imprimimos el resultado
		System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + divisor);

		// Cerramos el escaner
		sc.close();

	}

}
