package AriketakUD4;

import java.util.Scanner;

public class ArrayDiccionarioInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creo la variable
		String cadena;
		int posicion;
		String[] array;
		array = new String[10];
		int elementos;
		boolean encontrado, lleno;

		// creo el objeto de tipo Scanner para leer desde el teclado
		Scanner teclado = new Scanner(System.in);

		// leo cadena
		System.out.println("Cadena: ");
		cadena = teclado.nextLine();

		lleno = false;
		elementos = 0;
		while (!cadena.isEmpty() && !lleno) {
			// busco la posicion que le corresponde
			posicion = 0;
			encontrado = false;
			while (posicion < elementos && !encontrado) {
				if (cadena.compareTo(array[posicion]) > 0) {
					// cuando encuentra la posicion
					// salgo del while
					encontrado = true;
				} else {
					posicion++;
				}
			}

			// mover todos los valores desde esa posici�n hasta el final una posici�n a la
			// derecha empezando por el �ltimo
			for (int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
				array[posicionmover] = array[posicionmover - 1];
			}
			// guardar el nuevo elemento en la posici�n
			array[posicion] = cadena;
			elementos++;

			if (elementos >= array.length) {
				// salgo del bucle
				lleno = true;
			} else {
				// leo n
				System.out.println("Cadena: ");
				cadena = teclado.nextLine();
			}

		}

		// cierro el objeto de tipo Scanner
		teclado.close();

		// saca por pantalla el array
		for (posicion = 0; posicion < elementos; posicion = posicion + 1) {
			// la saco por pantalla
			System.out.println(array[posicion]);
		}
	}

}
