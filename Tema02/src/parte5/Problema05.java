package parte5;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = (int) (Math.random() * 101);
		
		String jugador;
		
		do {
			System.out.println("¿Tu número es: " + num + "?");
			
			jugador = sc.next().toUpperCase();
			
			if (jugador == "MENOR") {
				
			}
		}while (jugador != "IGUAL");
	}

}
