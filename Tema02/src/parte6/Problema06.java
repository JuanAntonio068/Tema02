package parte6;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "nota, d
		int nota;

		// Inciamos la variable "suspenso", donde vamos a guardar el número de suspensos
		// que se han introducido
		int suspenso = 0;

		// Iniciamos el for
		for (int i = 0; i < 5; i++) {

			// Preguntamos al usuario por una nota
			System.out.println("Dime una nota");

			nota = sc.nextInt();

			if (nota < 5) {// La nota es un suspenso
				suspenso++;
			}
		}

		// Imprimimos el resultado
		System.out.println("Hay " + suspenso + " suspensos en las notas que has introducido");

		// Cerramos el escaner
		sc.close();
	}

}
