package AriketakUD4;

import java.util.Scanner;

public class MatrizTraspues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int[][] matriz,transpuesta;
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
		
		System.out.println();
		
		transpuesta = new int[y][x];
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				transpuesta[columna][fila] = matriz[fila][columna];
			}
		}

		for (int fila = 0; fila < transpuesta.length; fila++) {
			for (int columna = 0; columna < transpuesta[fila].length; columna++) {
				System.out.print(transpuesta[fila][columna] + " ");
			}
			System.out.println();
		}
	}

}
