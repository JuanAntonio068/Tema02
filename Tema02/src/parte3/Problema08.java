package parte3;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {
		// Prueba 1
		// Valor de entrada: mes = 3 y año = 2000
		// Resultado esperado: 31
		// Resultado obtenido: 31
		
		// Prueba 2
		// Valor de entrada: mes = 2 y año = 2000
		// Resultado esperado: 29
		// Resultado obtenido: 29
		
		// Prueba 3
		// Valor de entrada: mes = 2 y año = 2001
		// Resultado esperado: 28
		// Resultado obtenido: 28
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable "mes", donde vamos a guardar el mes introducido
		int mes;
		
		// Declaramos la variable "año", donde vamos a guardar el año introducido
		int año;
		
		// Declaramos la variable "dias", donde vamos a sacar los días que tiene cada mes
		int dias;
		
		//Preguntamos por el mes
		System.out.println("Dime el número de un mes");
		
		mes = sc.nextInt();
		
		// Preguntamos por el año
		System.out.println("Dime un año");
		
		año = sc.nextInt();
		// Hacemos la comparación
		if (año % 4 == 0) { // El año es bisiesto
			dias = switch (mes) {
			case 1 -> {
				yield 31;
			}
			case 2 -> {
				yield 29;
			}
			case 3 -> {
				yield 31;
			}
			case 4 -> {
				yield 30;
			}
			case 5 -> {
				yield 31;
			}
			case 6 -> {
				yield 30;
			}
			case 7 -> {
				yield 31;
			}
			case 8 -> {
				yield 31;
			}
			case 9 -> {
				yield 30;
			}
			case 10 -> {
				yield 31;
			}
			case 11 -> {
				yield 30;
			}
			case 12 -> {
				yield 31;
			}
			default -> { // Se ha introducido un valor incorrecto
				yield -1;
			}
			};
		}else {// El año no es bisiestoa
			dias = switch (mes) {
			case 1 -> {
				yield 31;
			}
			case 2 -> {
				yield 28;
			}
			case 3 -> {
				yield 31;
			}
			case 4 -> {
				yield 30;
			}
			case 5 -> {
				yield 31;
			}
			case 6 -> {
				yield 30;
			}
			case 7 -> {
				yield 31;
			}
			case 8 -> {
				yield 31;
			}
			case 9 -> {
				yield 30;
			}
			case 10 -> {
				yield 31;
			}
			case 11 -> {
				yield 30;
			}
			case 12 -> {
				yield 31;
			}
			default -> { // Se ha introducido un valor incorrecto
				yield -1;
			}
			};
			
		}
		// Imprimimos el resultado
		System.out.println("El mes tiene " + dias + " dias");
		
		// Cerramos el escaner
		sc.close();
	}

}
