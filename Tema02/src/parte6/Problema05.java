package parte6;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num;

		// Iniciamos la variable "multiplicacion", donde vamos a guardar las
		// multiplicaciones
		int multiplicacion = 1;

		// Preguntamos al usuario por número
		System.out.println("Dime un número, para calcular su factorial");

		num = sc.nextInt();

		// Iniciamos el for
		for (int i = num; i != 1; i--) {

			multiplicacion *= i;

		}

		// Imprimimos el resultado
		System.out.println("El factorial de " + num + " es: " + multiplicacion);

		// Cerramos el escaner
		sc.close();
	}

}
