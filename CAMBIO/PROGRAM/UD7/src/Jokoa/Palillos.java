package Jokoa;

import java.util.Scanner;

public class Palillos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jug = 0;
		int[] fila = { 7, 5, 3 };
		int borrarf, borrarc;
		String segir;
		do {
			System.out.println("------------------------");
			for (int i = 0; i < fila[0]; i++) {
				System.out.print("I ");
			}
			System.out.println("");
			for (int i = 0; i < fila[1]; i++) {
				System.out.print("I ");
			}
			System.out.println("");
			for (int i = 0; i < fila[2]; i++) {
				System.out.print("I ");
			}
			System.out.println("");
			System.out.println("------------------------");

			if (jug % 2 == 0) {
				System.out.println("Turno de jugador 1");
			} else {
				System.out.println("Turno de jugador 2");
			}

			System.out.println("De que fila quieres borrar");
			borrarf = sc.nextInt();
			while (borrarf > 3 || borrarf < 0) {
				System.out.println("Solo hay 3 filas");
				System.out.println("De que fila quieres borrar");
				borrarf = sc.nextInt();

			}

			while (fila[borrarf - 1] <= 0) {
				System.out.println("Esa fila esta vacia");
				System.out.println("De que fila quieres borrar");
				borrarf = sc.nextInt();
			}

			do {
				System.out.println("Cuantos palos quieres borrar");
				borrarc = sc.nextInt();
				if (fila[borrarf - 1] - borrarc < 0) {
					System.out.println("No hay tantos palillos en esa fila");
					segir = "no";
				} else {
					segir = "si";
				}
			} while (segir == "no");
			fila[borrarf - 1] = fila[borrarf - 1] - borrarc;
			jug++;

		} while (fila[0] > 0 || fila[1] > 0 || fila[2] > 0);

		if (jug % 2 == 0) {
			System.out.println("Victoria de jugador 1");
		} else {
			System.out.println("Turno de jugador 2");
		}
		sc.close();
	}
}