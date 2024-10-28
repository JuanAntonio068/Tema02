package parte7;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num1", donde vamos a guardar el primer número
		// introducido por el usuario
		int num1;

		// Declaramos la variable "num2", donde vamos a guardar el segundo número
		// introducido por el usuario
		int num2;

		// Declaramos la variable "mayor", donde vamos a guardar el número que sea mayor
		int mayor;

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
		for (int i = mayor; i > 0; i++) {

			if (mayor * i 
		}
		System.out.println("El mínimo común divisor de " + num1 + " y " + num2 + " es: " + múltiplo);
	}

}
