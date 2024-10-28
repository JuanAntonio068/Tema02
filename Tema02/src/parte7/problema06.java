package parte7;

import java.util.Scanner;

public class problema06 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: 4
		// Resultado esperado:    * 
		//					     * * 
		//					    * * * 
		//					   * * * * 
		
		// Resultado obtenido:    * 
		//					     * * 
		//					    * * * 
		//					   * * * * 

		// Prueba 2
		// Valor de entrada: 3
		// Resultado esperado:    * 
		//					     * * 
		//					    * * * 
		
		// Resultado obtenido:    * 
		//					     * * 
		//					    * * * 
		
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "num", donde vamos a guardar el número introducido por
		// el usuario
		int num;

		// Preguntamos al usuario por un número
		System.out.println("Dime un número");
		num = sc.nextInt();

		// Iniciamos el bucle for, donde vamos a dibujar el triángulo
		for (int i = 1; i <= num; i++) {

			// Iniciamos el bucle for, donde vamos a imprimir los espacios blancos para
			// alinear el triángulo
			for (int j = 1; j <= num - i; j++) {

				System.out.print(" ");
			}
			// Iniciamos el bucle for, donde vamos a imprimir los asteriscos y los espacios
			// entre ellos
			for (int k = 1; k <= i; k++) {

				System.out.print("* ");
			}

			// Este println lo utilizamos para hacer el salto de línea
			System.out.println();
		}
		// Cerramos el escaner
		sc.close();
	}

}
