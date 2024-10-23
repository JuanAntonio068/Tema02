package parte6;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable "suma", donde vamos a ir sumando los números impares
		int suma = 0;

		// Iniciamos la variable for
		for (int i = 1; i < 20; i++) {

			if (i % 2 != 0) {// El número es impqr
				suma += i;
			}
		}

		// Imprimimos el resultado
		System.out.println("La suma de los 10 primeros números impares es: " + suma);

		// Cerramos el escaner
		sc.close();
	}

}
