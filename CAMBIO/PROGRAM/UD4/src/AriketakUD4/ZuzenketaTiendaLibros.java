package AriketakUD4;

import java.util.Scanner;

public class ZuzenketaTiendaLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// {"nada","timidamente de la oscuridad a la luz","PAjaros a
		// golpes","Caperucita","12 cuentos cl�sicos","Pepe y Mila","enojaos","en casa
		// vacia","123","Dia negro","El hobbit","calle jud�a",""};

		String[] libros = new String[20];
		libros[0] = "nada";
		libros[1] = "Timidamente de la oscuridad a la luz";
		libros[2] = "Pajaros a golpes";
		libros[3] = "Caperucita Roja";
		libros[4] = "12 cuentos cl�sicos";
		libros[5] = "Pepe y Mila";
		libros[6] = "enojaos";
		libros[7] = "en casa vacia";
		libros[8] = "123";
		libros[9] = "Dia negro";
		libros[10] = "El hobbit";
		libros[11] = "Calle judia";

		int[] precio = new int[20];// {15,12,15,25,19,17,25,13,11,18,25,35,0,0,0,0,0,0,0,0};
		precio[0] = 15;
		precio[1] = 12;
		precio[2] = 15;
		precio[3] = 25;
		precio[4] = 19;
		precio[5] = 17;
		precio[6] = 25;
		precio[7] = 13;
		precio[8] = 11;
		precio[9] = 18;
		precio[10] = 25;
		precio[11] = 35;

		int menu, elementos, nuevoprecio, posicion;
		String buscarL;
		String nuevolibro;
		boolean encontrado, lleno;

		System.out.println("1.- Mostrar el t�tulo de todos los libros");
		System.out.println("2.- Mostrar el t�tulo y el precio de todos los libros.");
		System.out.println("3.- Mostrar el precio de un libro.");
		System.out.println("4- Introducir un nuevo libro.");
		System.out.println("5.- Eliminar un libro.");
		System.out.println("6.- Modificar el precio de un libro");
		System.out.println("7.- Modificar el t�tulo de un libro.");
		System.out.println("8.- Salir del programa.");
		System.out.println("introduce un numero del menu");
		menu = teclado.nextInt();

		switch (menu) {
		case 1:

			elementos = 0;

			while (elementos < 19) {

				if (libros[elementos] != null) {
					System.out.println(libros[elementos]);
					elementos++;
				} else {
					elementos++;
				}

			}

			break;

		case 2:

			elementos = 0;
			while (libros[elementos] != null) {

				if (libros[elementos] != null) {
					System.out.println(libros[elementos] + " " + precio[elementos]);
					elementos++;
				} else {
					elementos++;
				}
			}
			break;
		case 3:

			System.out.println("Introduce el titulo del libro: ");
			buscarL = teclado.next();
			elementos = 0;
			while (!buscarL.equalsIgnoreCase(libros[elementos])) {
				elementos++;
			}
			System.out.println(precio[elementos]);
			break;

		case 4:

			System.out.println("Introduce el titulo de un nuevo libro: ");
			nuevolibro = teclado.next();
			System.out.println("Introduce el precio de un nuevo libro: ");
			nuevoprecio = teclado.nextInt();
			lleno = false;
			elementos = 0;

			while (libros[elementos] != null) {

				if (libros[elementos].equalsIgnoreCase(nuevolibro)) {
					precio[elementos] = nuevoprecio;
					elementos++;
				} else {
					elementos++;
				}
			}
			libros[elementos] = nuevolibro;

			elementos = 0;

			while (elementos < 20 && nuevoprecio >= 0) {
				precio[elementos] = nuevoprecio;
				elementos = elementos + 1;

			}
			elementos = 0;
			while (libros[elementos] != null) {

				System.out.println(libros[elementos] + precio[elementos]);
				elementos++;
			}
			break;

		case 5:
			teclado.reset();
			teclado.nextLine();
			encontrado = false;
			elementos = 0;
			System.out.println("que libro quieres borrar?");
			buscarL = teclado.nextLine();

			do {
				if (libros[elementos] == null) {
					elementos++;
				} else {
					if (buscarL.trim().compareTo(libros[elementos].trim()) == 0) {
						encontrado = true;
						libros[elementos] = null;
						precio[elementos] = 0;
						System.out.println("el libro ha sido eliminado");

					} else {
						elementos++;
					}
				}
			} while (!encontrado && elementos < precio.length);

			elementos = 10;

			if (libros[elementos] == null) {
				libros[elementos] = libros[elementos - 1];
				libros[elementos - 1] = null;
				precio[elementos] = precio[elementos - 1];
				precio[elementos - 1] = 0;
				elementos--;
			}
			while (elementos > 0) {
				if (libros[elementos] == null && precio[elementos] == 0) {
					libros[elementos] = libros[elementos - 1];
					libros[elementos - 1] = null;
					precio[elementos] = precio[elementos - 1];
					precio[elementos - 1] = 0;
				}
				elementos--;
			}
			break;
		}

	}
}
