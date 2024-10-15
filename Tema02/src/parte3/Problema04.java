package parte3;

import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: 2
		// Resultado esperado: DOS
		// Resultado obtenido: DOS

		// Prueba 2
		// Valor de entrada: 10
		// Resultado esperado: DIEZ
		// Resultado obtenido: DIEZ

		// Prueba 3
		// Valor de entrada: 14
		// Resultado esperado: CATORCE
		// Resultado obtenido: CATORCE

		// Prueba 4
		// Valor de entrada: 17
		// Resultado esperado: DIECISIETE
		// Resultado obtenido: DIECISIETE

		// Prueba 5
		// Valor de entrada: 24
		// Resultado esperado: VEINTICUATRO
		// Resultado obtenido: VEINTICUATRO

		// Prueba 6
		// Valor de entrada: 35
		// Resultado esperado: TREINTA Y CINCO
		// Resultado obtenido: TREINTA Y CINCO

		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número establecido por
		// el usuario
		int num;

		// Declaramos la variable "decimas", donde vamos a guardar las décimas del
		// número dado
		int decimas;

		// Declaramos la variable "unidades", donde vamos a guardar las unidades del
		// número dado
		int unidades;

		// Declaramos la variable "decimasStr", donde vamos a pasar las décimas del
		// número a formato string
		String decimasStr;

		// Declaramos la variable "unidadesStr", donde vamos a pasar las unidades del
		// número a formato string
		String unidadesStr;

		// Preguntamos al usuario por un número entre 1 y 99
		System.out.println("Dime un número entre 1 y 99");

		num = sc.nextInt();

		// Sacamos las décimas
		decimas = num / 10;

		// Sacamos las unidades
		unidades = num % 10;

		// Hacemos la conversión a formato String
		unidadesStr = switch (unidades) {
		case 1 -> {
			yield "UNO";
		}
		case 2 -> {
			yield "DOS";
		}
		case 3 -> {
			yield "TRES";
		}
		case 4 -> {
			yield "CUATRO";
		}
		case 5 -> {
			yield "CINCO";
		}
		case 6 -> {
			yield "SEIS";
		}
		case 7 -> {
			yield "SIETE";
		}
		case 8 -> {
			yield "OCHO";
		}
		case 9 -> {
			yield "NUEVE";
		}
		default -> { // Hay un error
			yield "ERROR";
		}

		};

		// Hacemos la conversión a formato string
		decimasStr = switch (decimas) {
		case 1 -> {
			yield "DIECI";
		}
		case 2 -> {
			yield "VEINTI";
		}
		case 3 -> {
			yield "TREINTA";
		}
		case 4 -> {
			yield "CUATENTA";
		}
		case 5 -> {
			yield "CINCUENTA";
		}
		case 6 -> {
			yield "SESENTA";
		}
		case 7 -> {
			yield "SETENTA";
		}
		case 8 -> {
			yield "OCHENTA";
		}
		case 9 -> {
			yield "NOVENTA";
		}
		default -> {
			yield "ERROR";
		}

		};

		// Hacemos la comparación
		if (decimas == 0) { // El número no tiene décimas
			System.out.println("El número es " + unidadesStr);
		} else if (decimas == 1) { // La décima del número es 1

			if (unidades == 0) { // El número es diez
				System.out.println("El número es DIEZ");
			} else if (unidades == 1) { // El número es once
				System.out.println("El número es ONCE");
			} else if (unidades == 2) { // El número es doce
				System.out.println("El número es DOCE");
			} else if (unidades == 3) { // El número es trece
				System.out.println("El número es TRECE");
			} else if (unidades == 4) { // El número es catorce
				System.out.println("El número es CATORCE");
			} else if (unidades == 5) { // El número es quince
				System.out.println("El número es QUINCE");
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + unidadesStr);
			}
		} else if (decimas == 2) { // La décima del número es 2
			if (unidades == 0) { // El número es veinte
				System.out.println("El número es VEINTE");
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + unidadesStr);
			}
		} else if (decimas == 3) { // La décima del número es 3
			if (unidades == 0) {// El número es treinta
				System.out.println("El número es :" + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		} else if (decimas == 4) { // La décima del número es 4
			if (unidades == 0) {// El número es cuarenta
				System.out.println("El número es : " + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		} else if (decimas == 5) { // La décima del número es 5
			if (unidades == 0) {// El número es cincuenta
				System.out.println("El número es : " + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		} else if (decimas == 6) { // La décima del número es 6
			if (unidades == 0) {// El número es sesenta
				System.out.println("El número es : " + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		} else if (decimas == 7) { // La décima del número es 7
			if (unidades == 0) {// El número es setenta
				System.out.println("El número es : " + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		} else if (decimas == 8) { // La décima del número es 8
			if (unidades == 0) {// El número es ochenta
				System.out.println("El número es : " + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		} else if (decimas == 9) { // La décima del número es 9
			if (unidades == 0) {// El número es noventa
				System.out.println("El número es : " + decimasStr);
			} else {// El número sigue una estructura general
				System.out.println("El número es: " + decimasStr + " y " + unidadesStr);
			}
		}

		// Cerramos el escaner
		sc.close();
	}
}
