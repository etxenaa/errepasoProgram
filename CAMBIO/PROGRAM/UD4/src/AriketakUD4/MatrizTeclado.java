package AriketakUD4;

import java.util.Scanner;

public class MatrizTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] matriz;
		int x, y;

		System.out.println("Esan arrayaren dimentsioak:");
		x = sc.nextInt();
		y = sc.nextInt();

		matriz = new int[x][y];

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.println("Esan [" + fila + "] [" + columna + "] ren balioa:");
				matriz[fila][columna] = sc.nextInt();
			}
		}

		System.out.println();

		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna] + " ");
			}
			System.out.println();
		}

	}

}
