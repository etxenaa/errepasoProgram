package AriketakUD4;

import java.util.Scanner;

public class MatrizRestamat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[][] matriz,matriz2,suma;
		int x, y;

		System.out.println("Esan arrayaren dimentsioak:");
		x = sc.nextInt();
		y = sc.nextInt();

		matriz = new int[x][y];
		matriz2 = new int[x][y];
		suma = new int[x][y];
		
		
		System.out.println("-Lehenengo matrizea-");
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.println("Esan [" + fila + "] [" + columna + "] ren balioa:");
				matriz[fila][columna] = sc.nextInt();
			}
		}
		
		System.out.println("-Bigarren matrizea-");
		for (int fila = 0; fila < matriz2.length; fila++) {
			for (int columna = 0; columna < matriz2[fila].length; columna++) {
				System.out.println("Esan [" + fila + "] [" + columna + "] ren balioa:");
				matriz2[fila][columna] = sc.nextInt();
			}
		}
		
		System.out.println("-Batuketa-");
		for (int fila = 0; fila < suma.length; fila++) {
			for (int columna = 0; columna < suma[fila].length; columna++) {
				suma[fila][columna] = matriz[fila][columna]-matriz2[fila][columna];
				System.out.print(suma[fila][columna]+" ");
			}
			System.out.println();
		}
	}

}
