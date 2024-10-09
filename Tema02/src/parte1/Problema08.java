package parte1;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "nota" donde vamos a guardar el valor introducido
		int nota;
		// Preguntamos al usuario por su nota
		System.out.println("Dime una nota");
		nota = sc.nextInt();
		// Determinamos cuál nota corresconde con la nota dada del ussuario
		if (nota == 0 || nota < 5) {// La nota es un insuficiente
			System.out.println("Tu nota es un insuficiente");
		} else if (nota == 5) {// La nota es un suficiente
			System.out.println("Tu nota es un suficiente");
		} else if (nota == 6) {// La nota es un bien
			System.out.println("Tu nota es un bien");
		} else if (nota == 7 || nota == 8) {// La nota es un notable
			System.out.println("Tu nota es un notable");
		} else if (nota == 9 || nota == 10) {// La nota es un sobresaliente
			System.out.println("Tu nota es un sobresaliente");
		} else {// El valor introducido es incorrecto
			System.out.println("La nota tiene que ser sobre 10");
		}
		// Cerramos el escaner
		sc.close();
	}
}
