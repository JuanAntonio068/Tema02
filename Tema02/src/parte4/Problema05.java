package parte4;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {

		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable "num", donde vamos a guardar las edades introducidas por el usuario
		int edad;
		
		//Inciamos la variable "suma", donde vamos a guardar la suma de todas las edades
		int suma = 0;
		
		// Iniciamos la variable "numeroDeAlumnos", donde vamos a guardar el número de alumnos que se han introducido
		int numeroDeAlumnos = 0;
		
		//Declaramos la variable "media", donde vamos a guardar la media de las edades de los alumnos
		double media;
		
		//Iniciamos la variable "mayor", donde vamos a guardar los alumnos que sean mayores de edad
		int mayor = 0;
		
		//Preguntamos al usuario por una edad
		System.out.println("Dime la edad de uno de tus compañeros");
		
		edad = sc.nextInt();
		
		while (edad > 0) {
			suma+=edad;
			
			numeroDeAlumnos++;
			
			if (edad >= 18) {//Es mayor de edad
				mayor++;
			
			}
			//Preguntamos al usuario por otra edad
			System.out.println("Dime otra edad");
			
			edad = sc.nextInt();
		}
		// Calculamos la media
		media = (double) suma/numeroDeAlumnos;
		
		//Imprimimos la suma de todas las edades
		System.out.println("La suma de todas las edades es: " + suma);
		
		// Imprimimos la media de las edades
		System.out.println("La media es: " + media);
		
		//Imprimimos el número de alumnos
		System.out.println("El número de alumnos es: " + numeroDeAlumnos);
		
		// Imprimimos el número de alumnos que son mayores de edad
		System.out.println("Hay " + mayor + " mayores de edad");
		
		//Cerramos el escaner
		sc.close();
		
	}

}
