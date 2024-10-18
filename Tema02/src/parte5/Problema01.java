package parte5;

public class Problema01 {

	public static void main(String[] args) {

		// Iniciamos la variable "contador", donde se van a ir sumando hasta llegar al
		// 20
		int contador = 1;

		do {

			// Impeimimos la variable "contador"
			System.out.println(contador);

			// Le sumamos a "contador" 1
			contador++;

			// Esto se repite hasta que "contador" llegue a 20
		} while (contador <= 20);
	}

}
