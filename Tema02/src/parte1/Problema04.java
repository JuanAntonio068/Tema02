package parte1;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		// Declramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declramos la variable "num1"
		int num1;
		// Declaramo la variable "num2"
		int num2;
		// Preguntamos al usuario por dos números
		System.out.println("Dime tres números");
		// En la variable "num1" se guarda el primner valor establecido
		num1 = sc.nextInt();
		// En la variable "num2" se guarda el segundo valor establecido
		num2 = sc.nextInt();
		// Comparamos los números para saber cuál es mayor y cuál es menor
		
		if (num1 > num2) {// "num1" es mayor que "num2"
			System.out.println(num2 + " < " + num1);
		} else if (num2 > num1) {// "num2" es mayor que "num1"
			System.out.println(num1 + " < " + num2);
		} else {// "num1" y "num2" son iguales
			System.out.println("Los números son iguales");
		}
		// Cerramos el escaner
		sc.close();
	}

}
