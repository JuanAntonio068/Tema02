package parte4;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número dado por el
		// usuario
		int num;

		// Iniciamos la variable "suma", donde vamos a ir sumando los números
		int suma = 0;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");

		num = sc.nextInt();

		// Mientras que el núemro dado sea positivo se repite el bucle
		while (num >= 0) {

			suma += num;
			// Preguntamos por otro número al usuario
			System.out.println("Dime otro número");

			num = sc.nextInt();
		}
		// Imprimimos el resultado
		System.out.println(suma);

		// Cerramos el escaner
		sc.close();
	}

}
