package parte1;

import java.util.Scanner;

public class Problema10 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num1", donde vamos a guardar el primer valor
		// establecido
		int num1;
		// Declaramos la variable "num2", donde vamos a guardar el segundo valor
		// establecido
		int num2;
		// Declaramos la variable "num3", donde vamos a guardar el tercer valor
		// establecido
		int num3;
		// Preguntamos al usuario por tres números
		System.out.println("Introduce tres números");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		// Verificar si la suma de dos números es igual al tercer número
		if (num1 + num2 == num3) {// Se comprueba que la suma del primer y el segundo número dan el tercero
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
		} else if (num1 + num3 == num2) {// Se comprueba que la suma del primer y el tercer número dan el segundo
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
		} else if (num2 + num3 == num1) {// Se comprueba que la suma del segundo y el tercer número dan el primero
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
		} else {
			System.out.println("Ninguna suma de dos números es igual al tercer número.");
		}
		// Cerramos el escaner
		sc.close();
	}

}
