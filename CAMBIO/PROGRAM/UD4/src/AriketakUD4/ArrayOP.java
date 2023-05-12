package AriketakUD4;

import java.util.Scanner;

public class ArrayOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int opcion;
		int posicion;
		int[] a;
		a = new int[10];
		int elementos = 0;
		boolean encontrado;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("1. Inicializar array a -1");
			System.out.println("2. Insertar elemento");
			System.out.println("3. Borrar elemento (de su posici�n compactando el array)");
			System.out.println("4. Listar array");
			System.out.println("0. Salir");

			// leo opcion
			System.out.println("Opcion: ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				for (int i = 0; i < a.length; i++) {
					a[i] = -1;
				}
				elementos = 0;
				break;
			case 2:
				System.out.println("n: ");
				n = teclado.nextInt();
				while (n < 0) {
					System.out.println("Zenbakia positiboa izan behar da: ");
					System.out.println("n: ");
					n = teclado.nextInt();
				}
				if (elementos < a.length) {
					if (elementos == 0) {
						// si es el primer elemento
						a[0] = n;
						elementos++;
					} else {
						// busco la posicion que le corresponde
						encontrado = false;
						posicion = 0;
						while (posicion < elementos && !encontrado) {
							if (a[posicion] > n) {
								// cuando encuentra la posicion
								encontrado = true;
							} else {
								posicion++;
							}

						}
						// mover todos los valores desde esa posici�n hasta el final una posici�n a la
						// derecha empezando por el �ltimo
						for (int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
							a[posicionmover] = a[posicionmover - 1];
						}
						// guardar el nuevo elemento en la posici�n
						a[posicion] = n;
						elementos++;
					}
				} else {
					System.out.println("El array esta lleno ");
				}

				break;
			case 3:
				boolean azkena = false;
				// Borrar elemento (de su posici�n compactando el array)
				// leo n
				System.out.println("n: ");
				n = teclado.nextInt();
				// busco la posicion donde se encuentra
				encontrado = false;
				posicion = 0;
				while (posicion < elementos && !encontrado) {
					if (a[posicion] == n) {
						// cuando encuentra la posicion
						encontrado = true;
					} else {
						posicion++;
					}

				}
				if (encontrado) {
					// si lo encuentro
					// mover todos los valores desde esa posici�n hasta el final
					// una posici�n a la izquierda

					for (int posicionmover = posicion; posicionmover <= (elementos - 1); posicionmover++) {
						if (elementos == 10) {
							azkena = true;
						} else {
							a[posicionmover] = a[posicionmover + 1];
						}
					}
					if (azkena) {
						a[9] = 0;
					}
					// decremento elementos
					elementos--;

				} else {
					System.out.println("Error al borrar. NO se encuentra el elemento.");
				}

				break;

			case 4:
				for (int i = 0; i < a.length; i++) {
					System.out.println(a[i]);
				}
				break;

			case 0:
				System.out.println("Fin del Programa.");
			}

		} while (opcion != 0);

		teclado.close();

	}

}
