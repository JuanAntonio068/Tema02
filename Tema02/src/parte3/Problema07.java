package parte3;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {

		// Prueba 1
		// Valor de entrada: dias = 2 y distacia = 20
		// Resultado esperado: 50
		// Resultado obtenido: 50

		// Prueba 2
		// Valor de entrada: dias = 8 y distacia = 900
		// Resultado esperado: 1575
		// Resultado obtenido: 1575

		// Declaramos el esacner
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable "distancia", donde vamos a guardar los kilómetros
		double distancia;

		// Declaramos la variables "dias", donde vamos a guardar los días de estancia
		int dias;

		// Declaramos la variable "precio", donde vamos a calcular el precio del billete
		// sin descuento
		double precio;

		// Declaramos la variable "precio", donde vamos a calcular el precio del billete
		// con descuento
		double precioFinal;

		// Inicializamos la constante "DESCUENTO", donde vamos a guardar el descuento
		// aplicado
		final double DESCUENTO = 0.3;

		// Inicializamos la constante "PRECIO_KILOMETRO", donde vamos a guardar lo que
		// vale cada kilómetro
		final double PRECIO_KILOMETRO = 2.5;

		// Preguntamos al usuario sus días de estancia
		System.out.println("¿Cúantos días te vas a quedar?");

		dias = sc.nextInt();

		// Preguntamos al usuario los kilómetros que va a recorrer
		System.out.print("¿Cúantos kilómetros vas a recorrer?");

		distancia = sc.nextDouble();

		precio = distancia * PRECIO_KILOMETRO;

		// Hacemos la comparación
		if (dias > 7 && distancia > 800) { // Se va a aplicar el descuento
			precioFinal = precio - precio * DESCUENTO;
			System.out.println("El precio del billete es: " + precioFinal);
		} else { // No se va a aplicar el descuento
			System.out.println("El precio del billete es: " + precio);
		}

		// Cerramos el escaner
		sc.close();
	}

}
