package parte2;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "nota", donde vamos a guardar la nota introducido por
		// el usuario
		int nota;
		// Preguntamos al usuario cuál es su nota
		System.out.println("Dime una nota tuya");
		nota = sc.nextInt();
		switch (nota) {
		case 0, 1, 2, 3, 4: // La nota es un insuficiente
			System.out.println("Tienes un insuficiente");
			break;
		case 5: // La nota es un suficiente
			System.out.println("Tienes un suficiente");
			break;
		case 6: // La nota es un bien
			System.out.println("Tienes un bien");
			break;
		case 7, 8: // La nota es un notable
			System.out.println("Tienes un notable");
			break;
		case 9, 10: // La nota es un sobresaliente
			System.out.println("Tienes un sobresaliente");
			break;
		default: // La nota es incorrecta
			System.out.println("La nota introducida tiene que estar entre 0 y 10");
			break;

		}
		// Cerramos el escaner
		sc.close();
	}

}
