package parte3;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: 30321054
		// Resultado esperado: Q
		// Resultado obtenido: Q
		
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Declaramos la variable "dni", donde vamos a guardar los números del dni del
		// usuario
		int dni;
		
		// Declaramos la variable "letra", donde vamos a guardar la letra del dni del
		// usuario
		String letra;
		
		// Preguntamos al usuario por los números de su dni
		System.out.println("Dime los números de tu DNI");

		dni = sc.nextInt();

		letra = switch (dni % 23) { // La letra depende del módulo de los 8 dígitos entre 23
		case 0 -> { // El resto es 0, por tanto la letra del DNI es la T
			yield "T";
		}
		case 1 -> { // El resto es 1, por tanto la letra del DNI es la R
			yield "R";
		}
		case 2 -> { // El resto es 2, por tanto la letra del DNI es la W
			yield "W";
		}
		case 3 -> { // El resto es 3, por tanto la letra del DNI es la A
			yield "A";
		}
		case 4 -> { // El resto es 4, por tanto la letra del DNI es la G
			yield "G";
		}
		case 5 -> { // El resto es 5, por tanto la letra del DNI es la M
			yield "M";
		}
		case 6 -> { // El resto es 6, por tanto la letra del DNI es la Y
			yield "Y";
		}
		case 7 -> { // El resto es 7, por tanto la letra del DNI es la F
			yield "F";
		}
		case 8 -> { // El resto es 8, por tanto la letra del DNI es la P
			yield "P";
		}
		case 9 -> { // El resto es 9, por tanto la letra del DNI es la D
			yield "D";
		}
		case 10 -> { // El resto es 10, por tanto la letra del DNI es la X
			yield "X";
		}
		case 11 -> { // El resto es 11, por tanto la letra del DNI es la B
			yield "B";
		}
		case 12 -> { // El resto es 12, por tanto la letra del DNI es la N
			yield "N";
		}
		case 13 -> { // El resto es 13, por tanto la letra del DNI es la J
			yield "J";
		}
		case 14 -> { // El resto es 14, por tanto la letra del DNI es la Z
			yield "Z";
		}
		case 15 -> { // El resto es 15, por tanto la letra del DNI es la S
			yield "S";
		}
		case 16 -> { // El resto es 16, por tanto la letra del DNI es la Q
			yield "Q";
		}
		case 17 -> { // El resto es 17, por tanto la letra del DNI es la V
			yield "V";
		}
		case 18 -> { // El resto es 18, por tanto la letra del DNI es la H
			yield "H";
		}
		case 19 -> { // El resto es 19, por tanto la letra del DNI es la L
			yield "L";
		}
		case 20 -> { // El resto es 20, por tanto la letra del DNI es la C
			yield "C";
		}
		case 21 -> { // El resto es 21, por tanto la letra del DNI es la K
			yield "K";
		}
		case 22 -> { // El resto es 22, por tanto la letra del DNI es la E
			yield "E";
		}
		default -> { // Los números dados son incorrectos
			System.out.println("Introduce un valor válido");
			yield "ERROR";
		}

		};
		// Imprimimos el resultado
		System.out.println("La letra de tu DNI es: " + letra);

		// Cerrramos el escaner
		sc.close();
	}

}