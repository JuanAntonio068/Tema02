package parte2;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declramos la variable "dia", donde vamos a guardar el día introducido por el
		// usuario
		int dia;
		// Preguntamos por un día de la semana
		System.out.println("Dime un día de la semana (1-7)");
		dia = sc.nextInt();
		switch (dia) {
		case 1: // Es lunes
			System.out.println("Es lunes");
			break;
		case 2: // Es martes
			System.out.println("Es martes");
			break;
		case 3: // Es miércoles
			System.out.println("Es miércoles");
			break;
		case 4: // Es jueves
			System.out.println("Es jueves");
			break;
		case 5: // Es viernes
			System.out.println("Es viernes");
			break;
		case 6: // Es sábado
			System.out.println("Es sábado");
			break;
		case 7: // Es domingo
			System.out.println("Es domingo");
			break;
		default: // El valor es incorrecto
			System.out.println("Solo puedes elegir entre 1 y 7");
		}
		// Cerramos el escaner
		sc.close();
	}

}
