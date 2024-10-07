package parte1;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num", donde vamos a guardar el valor establecido
		int num;
		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		num = sc.nextInt();
		// Comprobamos si al dividirlo entre dos el resto da 0
		if (num % 2 == 0) {// El número es par
			System.out.println("El número es par");
		} else {// El número es impar
			System.out.println("El número es impar");

		}
		// Cerramos el escaner
		sc.close();
	}

}
