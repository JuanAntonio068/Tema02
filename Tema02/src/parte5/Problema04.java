package parte5;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde se va a guardar el número introducido por
		// el usuario
		int num;

		// Iniciamos la variable "contador", donde se va a ir sumando hasta llegar a 10
		int contador = 1;

		// Le preguntamos al usuario por un número
		System.out.println("Dime un número");

		num = sc.nextInt();

		do {

			// Imprimimos la multiplicación entre "num" y "contador"
			System.out.println(num + " * " + contador + " = " + num * contador);

			// Sumamos a "contador" 1
			contador++;

			// Esto se repite hasta llegar a 10

		} while (contador <= 10);

		// Cerramos el escaner
		sc.close();
	}

}
