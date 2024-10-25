package parte7;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: hora = 23 minuto = 59 y segundo = 59 aumento = 1
		// Resultado esperado: hora = 0 minuto = 0 y segundo = 0
		// Resultado obtenido: hora = 0 minuto = 0 y segundo = 0

		// Prueba 2
		// Valor de entrada: hora = 5 minuto = 58 y segundo = 59 aumento = 6
		// Resultado esperado: hora = 5 minuto = 59 y segundo = 5
		// Resultado obtenido: hora = 5 minuto = 59 y segundo = 5
		
		
		// Prueba 3
		// Valor de entrada: hora = 23 minuto = 59 y segundo = 59 aumento = 61
		// Resultado esperado: hora = 0 minuto = 1 y segundo = 0
		// Resultado obtenido: hora = 0 minuto = 0 y segundo = 0

		// Prueba 4
		// Valor de entrada: hora = 23 minuto = 59 y segundo = 59 aumento = 3601
		// Resultado esperado: hora = 1 minuto = 0 y segundo = 0
		// Resultado obtenido: hora = 1 minuto = 0 y segundo = 0

		// Prueba 5
		// Valor de entrada: hora = 3 minuto = 43 y segundo = 30 aumento = 3631
		// Resultado esperado: hora = 4 minuto = 44 y segundo = 1
		// Resultado obtenido: hora = 4 minuto = 44 y segundo = 1
		
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "hora", donde vamos a guardar las horas introducidas
		// por el usuario
		int hora;

		// Declaramos la variable "minutos", donde vamos a guardar los minutos
		// introducidos por el usuario
		int minuto;

		// Declaramos la variable "segundos", donde vamos a guardar los segundos
		// introducidos por el usuario
		int segundo;

		// Declaramos la variable "aumento", donde vamos a guardar los segundos que
		// quiere aumentar el usuario
		int aumento;

		do {// Empezamos un bucle, del cual no se puede salir hasta introducir un valor
			// correcto

			// Preguntamos al usuario por las horas
			System.out.println("Dime las horas");
			hora = sc.nextInt();

		} while (hora >= 24);

		do {// Empezamos un bucle, del cual no se puede salir hasta introducir un valor
			// correcto

			// Preguntamos al usuario por las minutos
			System.out.println("Dime los minutos");
			minuto = sc.nextInt();

		} while (minuto >= 60);

		do {// Empezamos un bucle, del cual no se puede salir hasta introducir un valor
			// correcto

			// Preguntamos al usuario por las segundos
			System.out.println("Dime los segundos");
			segundo = sc.nextInt();

		} while (segundo >= 60);

		// Preguntamos al usuario cuántos segundos quiere incrementar
		System.out.println("Dime los segunos que quieres incrementar");
		aumento = sc.nextInt();

		for (int i = aumento; i > 0; i--) {

			// Incrementar los segundos
			segundo++;

			// Verificar si los segundos superan 59
			if (segundo == 60) {
				segundo = 0;
				minuto++; // Incrementar minutos
			}

			// Verificar si los minutos superan 59
			if (minuto == 60) {
				minuto = 0;
				hora++; // Incrementar horas
			}

			// Verificar si las horas superan 23
			if (hora == 24) {
				hora = 0; // Reiniciar horas
			}
		}

		// Imprimimos el resulatado
		System.out.println("La nueva hora es: " + hora + " horas " + minuto + " minutos " + segundo + " segundos ");

		// Cerramos el escaner
		sc.close();
	}

}
