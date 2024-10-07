package parte1;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {
		// Declramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "num" donde guardaremos el valor introducido por el
		// usuario
		int num;
		// Preguntamos al usuario por número entre 0 y 99999
		System.out.println("Introduce un número entre 0 y 99.999");

		num = sc.nextInt();
		// Comprobamos que el número esté dentro del intervalo establecido
		if (num < 0 || num >= 100000) {// El número no está dentro del intervalo establecido
			System.out.println("Introduce un número que esté dentro del intervalo");
		} else {// El número está dentro del intervalo establecido
			if (num < 10) {// El número solo tiene 1 cifra
				System.out.println(num + " tiene 1 cifra");
			} else if (num < 100) {// El número tiene 2 cifras
				System.out.println(num + " tiene 2 cifras");
			} else if (num < 1000) {// El número tiene 3 cifras
				System.out.println(num + " tiene 3 cifras");
			} else if (num < 10000) {// El número tiene 4 cifras
				System.out.println(num + " tiene 4 cifras");
			} else {// El número tiene 5 cifras
				System.out.println(num + " tiene 5 cifras");
			}
		}
		// Cerramos el escaner
		sc.close();
	}

}
