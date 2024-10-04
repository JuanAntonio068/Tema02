package parte1;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num1"
		int num1;
		// Declaramos la variable "num2"
		int num2;
		// Preguntamos al usuario por dos números enteros
		System.out.println("Dime dos núemros enteros");
		// En la variable "num1" se guarda el primer valor establecido
		num1 = sc.nextInt();
		// En la variable "num2" se guarda el segundo valor establecido
		num2 = sc.nextInt();
		// Comprobamos si "num1" y "num2" son igaules
		if (num1 == num2) {// "num1" y "num2" son iguales
			System.out.println("Los dos números son iguales");

		} else { // "num1" y "num2" no son igaules
			System.out.println("Los dos números no son iguales");
		}
		// Cerramos el escaner
		sc.close();
	}

}
