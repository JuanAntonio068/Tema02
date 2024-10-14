package parte3;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: 3
		// Resultado esperado: 3
		// Resultado obtenido: 3

		// Prueba 2
		// Valor de entrada: -2
		// Resultado esperado: 2
		// Resultado obtenido: 2

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el valor introducido por
		// el usuario
		int num;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número para calcular su número absoluto");

		num = sc.nextInt();

		// Imprimimos el resultado
		System.out.println((num < 0) ? -num : num);

		// Cerramos el escaner
		sc.close();
	}

}
