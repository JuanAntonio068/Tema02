package parte1;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num", donde vamos a guardar el valor establecido
		double num;
		// Preguntamos al usuario por un número decimal
		System.out.println("Dime un número decimal");
		num = sc.nextDouble();
		// Comprobamos si el número recibido es casi cero
		 if (num >= 1 || num <= -1 || num == 0) {// El número no es casi cero
			System.out.println(num + " no es casi cero");
		} else {// El número es casi cero
			System.out.println(num + " es casi cero");
		}
		// Cerramos el escaner
		sc.close();
	}

}