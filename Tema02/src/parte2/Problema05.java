package parte2;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "letra", donde vamos a guardar la letra que introduzca
		// el usuario
		String letra;
		// Le preguntamos al usuario por la letra de su carnet de conducir
		System.out.println("Dime la letra de tu carnet de conducir");
		letra = sc.next().toUpperCase();

		switch (letra) {
		case "E": // La E corresponde a remolques
			System.out.println("Tu carnet corresponde a remolques");
			break;
		case "D": // La D corresponde a autobuses
			System.out.println("Tu carnet corresponde a autobuses");
			break;
		case "C1", "C5": // Los C1 y C5 corresponden a camiones
			System.out.println("Tu carnet corresponde a camiones");
			break;
		case "A": // La A corresponde a motocicletas
			System.out.println("Tu carnet corresponde a motocicletas");
			break;
		case "B1", "B2": // Los B1 y B2 corresponden a automóviles
			System.out.println("Tu carnet corresponde a automóviles");
			break;
		default: // El usuario no introdujo una letra correcta
			System.out.println("Categoría no contemplada");
		}
		// Cerramos el escaner
		sc.close();
	}

}
