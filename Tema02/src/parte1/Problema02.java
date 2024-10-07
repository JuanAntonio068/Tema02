package parte1;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num1", donde vamos a guardar el primer valor establecido
		int num1;
		// Declaramos la variable "num2", donde vamos a guardar el primer valor establecido
		int num2;
		// Preguntamos al usuario por dos números enteros
		System.out.println("Dime dos núemros enteros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		// Comprobamos si "num1" y "num2" son iguales
		if (num1 == num2) {// "num1" y "num2" son iguales
			System.out.println("Los dos números son iguales");

		} else { // "num1" y "num2" no son igaules
			System.out.println("Los dos números no son iguales");
		}
		// Cerramos el escaner
		sc.close();
	}

}
