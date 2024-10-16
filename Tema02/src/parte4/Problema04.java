package parte4;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		int contador = 0;

		int numpositivo = 0;

		int suma = 0;

		int numnegativo = 0;

		int media = 0;

		int ceros = 0;

		System.out.println("Dime un número");

		num = sc.nextInt();

		while (contador >= 10) {

			if (num > 0) {
				numpositivo++;
			} else if (num == 0) {
				ceros++;
			} else {
				numnegativo++;
				media++;
			}
		}
		suma+=numpositivo;
		
		
	}

}
