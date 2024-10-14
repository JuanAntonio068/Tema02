package parte3;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dni;
		
		char letra;
		
		
		letra= switch (dni%23) {
		case 0 -> {
			yield 0;
		}
		case 1 -> {
			yield 0;
		}
		case 2 -> {
			yield 0;
		}
		case 3 -> {
			yield 0;
		}
		case 4 -> {
			yield 0;
		}
		case 5 -> {
			yield 0;
		}
		case 6 -> {
			yield 0;
		}
		case 7 -> {
			yield 0;
		}
		case 8 -> {
			yield 0;
		}
		case 9 -> {
			yield 0;
		}
		case 10 -> {
			yield 0;
		}
		case 11 -> {
			yield 0;
		}
		case 12 -> {
			yield 0;
		}
		case 13 -> {
			yield 0;
		}
		case 14 -> {
			yield 0;
		}
		case 15 -> {
			yield 0;
		}
		case 16 -> {
			yield 0;
		}
		case 17 -> {
			yield 0;
		}
		case 18 -> {
			yield 0;
		}
		case 19 -> {
			yield 0;
		}
		case 20 -> {
			yield 0;
		}
		case 21 -> {
			yield 0;
		}
		case 22 -> {
			yield 0;	
		}
			default  -> {
				System.out.println("Introduce un valor válido");
				yield 99;}
				
		};
	}

}
