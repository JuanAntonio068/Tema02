package parte1;

import java.util.Scanner;

public class Problema09 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "jugador1", donde se ve a guardar el valor del primer
		// jugador
		String jugador1;
		// Declaramos la variable "jugador2", donde se ve a guardar el valor del primer
		// jugador
		String jugador2;
		// Preguntamos a los usuarios cuás es su elección
		System.out.println("Jugador 1, introduce tu elección (PIEDRA, PAPEL o TIJERA):");
		jugador1 = sc.nextLine().toUpperCase();
		System.out.println("Jugador 2, introduce tu elección (PIEDRA, PAPEL o TIJERA):");
		jugador2 = sc.nextLine().toUpperCase();
		// Determinar el ganador
		if (jugador1.equals(jugador2)) {
			System.out.println("¡Es un empate!");
		} else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))
				|| (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
				|| (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {
			System.out.println("¡Jugador 1 gana!");
		} else {
			System.out.println("¡Jugador 2 gana!");
		}

		sc.close();
	}
}
