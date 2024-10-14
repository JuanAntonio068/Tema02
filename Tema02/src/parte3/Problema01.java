package parte3;

import java.util.Scanner;

public class Problema01 {
	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: -1
		// Resultado esperado: Valor incorrecto, el número tiene que estar entre 0 y
		// 9999
		// Resultado obtenido: Valor incorrecto, el número tiene que estar entre 0 y
		// 9999

		// Prueba 2
		// Valor de entrada: 99999
		// Resultado esperado: Valor incorrecto, el número tiene que estar entre 0 y
		// 9999
		// Resultado obtenido: Valor incorrecto, el número tiene que estar entre 0 y
		// 9999

		// Prueba 3
		// Valor de entrada: 8008
		// Resultado esperado: Es capicúa
		// Resultado obtenido: Es capicúa

		// Prueba 4
		// Valor de entrada: 7070
		// Resultado esperado: No es capicúa
		// Resultado obtenido: No es capicúa

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a gaurdar el valor introducido por
		// el usuario
		int num;

		// Declaramos la variable "numStr", donde vamos a transformar el numero entero
		// en un String
		String numStr;

		// Declaramos la variable "numRevertido", donde vamos a guardar el número al
		// revés
		String numRevertido;

		// Preguntamos al usuario que introduzca un número entre 0 y 9999
		System.out.println("Introduce un número entre 0 y 9999");

		num = sc.nextInt();

		numStr = Integer.toString(num);

		numRevertido = new StringBuilder(numStr).reverse().toString();

		if (num >= 0 && num <= 9999) {// El número está dentro del intervalo establecido
			// Verificar si el número es capicúa
			if (numStr.equals(numRevertido)) {// El número es capicúa
				System.out.println("El número " + num + " es capicúa.");
			} else { // El número no es capicúa
				System.out.println("El número " + num + " no es capicúa.");
			}
		} else { // El número no está dentro del intervalo establecido
			System.out.println("Valor incorrecto, el número tiene que estar entre 0 y 9999");
		}
		// Cerramos el escaner
		sc.close();

	}
}