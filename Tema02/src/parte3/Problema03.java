package parte3;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dni;
		
		char letra;
		
		System.out.println("Dime los números de tu DNI");
		
		dni = sc.nextInt();
		
		letra= switch (dni%23) {
		case 0 -> {
			yield 0;
		}
		case 1 -> {
			yield 1;
		}
		case 2 -> {
			yield 2;
		}
		case 3 -> {
			yield 3;
		}
		case 4 -> {
			yield 4;
		}
		case 5 -> {
			yield 5;
		}
		case 6 -> {
			yield 6;
		}
		case 7 -> {
			yield 7;
		}
		case 8 -> {
			yield 8;
		}
		case 9 -> {
			yield 9;
		}
		case 10 -> {
			yield 10;
		}
		case 11 -> {
			yield 11;
		}
		case 12 -> {
			yield 12;
		}
		case 13 -> {
			yield 13;
		}
		case 14 -> {
			yield 14;
		}
		case 15 -> {
			yield 15;
		}
		case 16 -> {
			yield 16;
		}
		case 17 -> {
			yield 17;
		}
		case 18 -> {
			yield 18;
		}
		case 19 -> {
			yield 19;
		}
		case 20 -> {
			yield 20;
		}
		case 21 -> {
			yield 21;
		}
		case 22 -> {
			yield 22;	
		}
			default  -> {
				System.out.println("Introduce un valor válido");
				yield 99;}
				
		};
		System.out.println("La letra de tu DNI es: " + letra);
	}

}
