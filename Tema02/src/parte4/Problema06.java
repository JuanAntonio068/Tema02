package parte4;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "altura", donde vamos a guardar las alturas
		// introducidas por el usuario
		double altura;

		// Iniciamos la variable "alto", donde vamos a guardar la altura mayor
		double alto = 0;

		// Preguntamos al usuario por la altura de un árbol
		System.out.println("Dime la altura de un árbol");

		altura = sc.nextDouble();

		while (altura != -1) {

			if (alto < altura) {// La nueva altura es la más alta

				alto = altura;
			}
			// Preguntamos al usuario por otra altura
			System.out.println("Dime la altura de otro árbol");

			altura = sc.nextDouble();

		}
		// Imprimimos el resultado
		System.out.println("El árbol más alto mide: " + alto + " cm");

		// Cerramos el escaner
		sc.close();

	}

}
