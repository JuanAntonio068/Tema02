package parte5;

public class Problema02 {

	public static void main(String[] args) {
		// Iniciamos la variable "contador", donde se van a ir sumando hasta llegar al
		// 200
		int contador = 1;

		do {
			if (contador % 2 == 0) {// El número es par

				// Imprimos el número par
				System.out.println(contador);
			}
			// Le sumamos 1 a "contador"
			contador++;

			// Esto se repite hasta que llegue a 200
		} while (contador <= 200);
	}

}
