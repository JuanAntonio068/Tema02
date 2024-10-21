package parte5;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num1",donde vamos a guardar el primer número que
		// introduzca el usuario
		int num1;

		// Declaramos la vairbale "num2",donde vamos a guardar el segundo número que
		// introduzca el usuario
		int num2;

		// Declaramos la variable "opcion", donde vamos a guardar la elección que haga
		// el usuario
		String opcion;

		do {

			// Preguntamo al usuario que nos diga dos números
			System.out.println("Dime dos números");

			num1 = sc.nextInt();

			num2 = sc.nextInt();

			// Preguntmos al usuario que haga una elección
			System.out.println(
					"Elige una opción: A (Sumar los números), B (Restar los números), C (Multiplicar los números), D (Dividir los números) o E (Salir del progama)");
			opcion = sc.next().toUpperCase();

			switch (opcion) {
			case "A": // El usuario ha elegido la suma
				System.out.println(num1 + num2);
				break;
			case "B": // El usuario ha elegido la resta
				System.out.println(num1 - num2);
				break;
			case "C": // El usuario ha elegido la multiplicación
				System.out.println(num1 * num2);
				break;
			case "D": // El usuario ha elegido la división
				System.out.println(num1 / num2);
				break;
			}
		} while (!opcion.equals("E"));// Se repite hasta que el jugador introduzca E

		// Imprimimos el fin del progama
		System.out.println("Fin del progama");

		// Cerramos el escaner
		sc.close();
	}

}
