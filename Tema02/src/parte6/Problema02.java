package parte6;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número escrito por el
		// usuario
		int num;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");

		num = sc.nextInt();

		// Iniciamos la variable for
		for (int i = 1; i <= num; i++) {

			if (i % 3 == 0) {// El número es múltiplo de 3
				// Imprimimos la variable "i"
				System.out.println(i);
			}
		}
		sc.close();
	}

}
