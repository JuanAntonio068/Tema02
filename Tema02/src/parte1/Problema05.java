package parte1;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {
		// Declramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declramos la variable "num1", donde se va a guardar primer valor establecido
		int num1;
		// Declaramo la variable "num2", donde se va a guardar primer valor establecido
		int num2;
		// Declaramos la variable "num3", donde se va a guardar primer valor establecido
		int num3;
		System.out.println("Dime tres números");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		// Comparamos los números para saber cuál es mayor y cuál es menor
		if (num1 >= num2 && num1 >= num3) {// El número 1 es el mayor de todos los números introducidos
			if (num2 >= num3) {// El número 2 es mayor que el número 3
				System.out.println(num1 + " > " + num2 + " > " + num3);
			} else {// El número 3 es mayor que el número 2
				System.out.println(num1 + " > " + num3 + " > " + num2);
			}
		} else if (num2 >= num1 && num2 >= num3) {// El número 2 es el mayor de todos los números introducidos
			if (num1 >= num3) {// El número 1 es mayor que el número 3
				System.out.println(num2 + " > " + num1 + " > " + num3);
			} else {// El número 3 es mayor que el número 1
				System.out.println(num2 + " > " + num3 + " > " + num1);
			}
		} else {// El número 3 es el mayor de todos los números introducidos
			if (num1 >= num2) {// El número 1 es mayor que el número 2
				System.out.println(num3 + " > " + num1 + " > " + num2);
			} else {// El número 2 es mayor que el número 1
				System.out.println(num3 + " > " + num2 + " > " + num1);
			}
		}
		// Cerramos el escaner
		sc.close();
	}

}
