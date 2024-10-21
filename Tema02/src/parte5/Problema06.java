package parte5;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "jugador1", donde vamos a guardar la elección del
		// jugaor 1
		String jugador1;

		// Declaramos la variable "jugador2", donde vamos a guardar la elección del
		// jugador 2
		String jugador2;

		do {
			do {
				// Preguntamos al usuario su elección
				System.out.println("Jugador 1: PIEDRA PAPEL o TIJERAS");

				jugador1 = sc.next().toUpperCase();

				// Esto se repite hasta que el jugador introduzca un valor correcto
			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERAS")
					&& !jugador1.equals("S"));

			do {
				// Preguntamos al usuario su elección
				System.out.println("Jugador 2: PIEDRA PAPEL o TIJERAS");

				jugador2 = sc.next().toUpperCase();

				// Esto se repite hasta que el jugador introduzca un valor correcto
			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERAS")
					&& !jugador2.equals("S"));

			// Hacemos la comparación
			if (jugador1.equals(jugador2)) {// La elección es la misma así que termina en empate
				System.out.println("¡Es un empate!");
			} else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))
					|| (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
					|| (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) { // La elección del jugador 1 gana a la
																					// elección del jugador 2
				System.out.println("¡Jugador 1 gana!");
			} else {// La elección del jugador 2 gana a la elección del jugador 1
				System.out.println("¡Jugador 2 gana!");
			}

			// Esto se repite hasta que se escribe S
		} while (!jugador1.equals("S") && !jugador2.equals("S"));

		// Imprimimos el fin de ljuego
		System.out.println("Fin del juego");

		// Cerramos el escaner
		sc.close();
	}

}
