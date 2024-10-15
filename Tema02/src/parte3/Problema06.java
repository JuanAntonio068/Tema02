package parte3;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: horas = 23 minutos = 59 y segundos = 59
		// Resultado esperado: horas = 0 minutos = 0 y segundos = 0
		// Resultado obtenido: horas = 0 minutos = 0 y segundos = 0

		// Prueba 2
		// Valor de entrada: horas = 5 minutos = 58 y segundos = 59
		// Resultado esperado: horas = 5 minutos = 59 y segundos = 0
		// Resultado obtenido: horas = 5 minutos = 59 y segundos = 0

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "horas", donde vamos a guardar las horas introducidas
		// por el usuario
		int horas;

		// Declaramos la variable "minutos", donde vamos a guardar las minutos
		// introducidas por el usuario
		int minutos;

		// Declaramos la variable "segundos", donde vamos a guardar las segundos
		// introducidas por el usuario
		int segundos;

		// Preguntamos al usuario las horas
		System.out.print("Introduce las horas: ");

		horas = sc.nextInt();

		// Preguntamos al usuario los minutos
		System.out.print("Introduce los minutos: ");

		minutos = sc.nextInt();

		// Preguntamos al usuario los segundos
		System.out.print("Introduce los segundos: ");

		segundos = sc.nextInt();

		// Incrementar los segundos
		segundos++;

		// Verificar si los segundos superan 59
		if (segundos == 60) {
			segundos = 0;
			minutos++; // Incrementar minutos
		}

		// Verificar si los minutos superan 59
		if (minutos == 60) {
			minutos = 0;
			horas++; // Incrementar horas
		}

		// Verificar si las horas superan 23
		if (horas == 24) {
			horas = 0; // Reiniciar horas
		}

		// Imprimimos el resultado
		System.out.printf("La hora después de incrementar un segundo es: " + horas + " horas " + minutos + " minutos"
				+ " y " + segundos + " segundos");

		// Cerramos el escaner
		sc.close();
	}

}
