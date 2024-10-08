package parte1;

import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {
		// Declaramos el escaner
		Scanner sc = new Scanner(System.in);
		// Declaramos la variable "a", donde vamos a guardar el primer valor establecido
		int a;
		// Declaramos la variable "b", donde vamos a guardar el segundo valor
		// establecido
		int b;
		// Declaramos la variable "c", donde vamos a guardar el tercer valor establecido
		int c;
		// Declaramos la variable "operacion", donde vamos a guardar el resultado de la
		// primera parte de la ecuación
		int operacion;
		// Declaramos la variable "solucion1", donde vamos a guardar el valor de la
		// primera solución de la ecuación
		double solucion1;
		// Declaramos la variable "solucion2", donde vamos a guardar el valor de la
		// segunda solución de la ecuación
		double solucion2;
		// Preguntamos al usuario el valor de a, b y c
		System.out.println("Dime el valor de a, b y c");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// Comprobomas que "a"distinto de 0 para poder hacer la ecuacion
		if (a == 0) {// "a" es igual que 0 así que es una ecuación de pimer grado
			System.out.println("La solución de la ecuación de primer grado es: " + (double) -c/b);
		} else {// "a" es mayor que 0
			operacion = (b * b - 4 * a * c);
			// Comprobamos si el resultado es positivo
			if (operacion < 0) {// El resultado de la raíz es negativo así que la ecuación no tiene solución
				System.out.println("La ecuación no se puede resolver");
			} else {// El resultado de la raíz es positivo así que la ecuación tiene solución
				solucion1 = (double) (-(b) + Math.sqrt(operacion)) / (2 * a);
				solucion2 = (double) (-(b) - Math.sqrt(operacion)) / (2 * a);
				// Comprobamos que las soluciones sean distintas
				if (solucion1 == solucion2) {// La ecuación solo tiene una solución
					System.out.println("La solución de la ecuación es: " + solucion1);
				} else {// La ecuación tiene dos soluciones
					System.out.println("Las soluciones de la ecuación son: " + solucion1 + " y " + solucion2);
				}
			}
		}
		// Cerramos el escaner
		sc.close();

	}

}
