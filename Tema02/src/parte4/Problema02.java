package parte4;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {

		//Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable "num", donde vamos a guardar el número introducido por el usuario
		int num;
		
		// Iniciazamos la variable "contador", donde se va ir contando los cuantas veces se ha repetido el bucle
		int contador = 0;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		
		num = sc.nextInt();
		
		// Mientras que el núemro dado sea positivo se repite el bucle
		while (num > 0) {
			
			contador++;
			
			// Preguntamos al usuario por otro número
			System.out.println("Dime otro número");
			
			num = sc.nextInt();
		}
		
		// Imprimimos el resultado
		System.out.println("Has introducido " + contador + " números");
		
		// Cerramos el escaner
		sc.close();
	}

}
