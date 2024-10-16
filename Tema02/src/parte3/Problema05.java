package parte3;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {

		// Prueba 1 (6 + 63)
		// Valor de entrada: 69
		// Resultado esperado: Correcto
		// Resultado obtenido: Correcto

		// Prueba 2 (25 + 90)
		// Valor de entrada: 1
		// Resultado esperado: Incorrecto
		// Resultado obtenido: Incorrecto

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "suma", donde vamos a guardar el valor correcto de la
		// suma propuesta por el progama
		int suma;

		// Declaramos la variable "respuesta", donde vamos a guardar el valor que
		// introduzca el usuario
		int respuesta;

		// Iniciamos la constante "NUM1", donde se va a generar el primer número
		// aleatorio
		final int NUM1 = (int) (Math.random() * 100);
		// Iniciamos la constante "NUM2", donde se va a generar el segundo número
		// aleatorio
		final int NUM2 = (int) (Math.random() * 100);

		suma = NUM1 + NUM2;

		// Preguntamos al usuario por el resultado de la suma
		System.out.println("Cuál es el resultado de la siguiente suma: " + NUM1 + " + " + NUM2);

		respuesta = sc.nextInt();
		// Iniciamos la compración
		if (suma == respuesta) {// El resultado es correcto
			System.out.print("CORRECTO, el resultado es: " + suma);
		} else {// El resultado es incorrecto
			System.out.print("INCORRECTO, el resultado era: " + suma);
		}
		// Cerramos el escaner
		sc.close();

	}

}
