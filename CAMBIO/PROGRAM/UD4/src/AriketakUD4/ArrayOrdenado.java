package AriketakUD4;

import java.util.Scanner;

public class ArrayOrdenado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n; 
		int posicion;
		int [] array;
		array = new int [5];
		int elementos;
		boolean encontrado, lleno;
		
		// creo el objeto de tipo Scanner para leer desde el teclado
		Scanner teclado = new Scanner(System.in);
		
		// leo n
		System.out.println("n: ");
		n= teclado.nextInt();
		
		elementos = 0;
		
		lleno = false;
		while (n >= 0 && !lleno){
			// busco la posicion que le corresponde
			posicion = 0;
			encontrado = false;
			while (posicion<elementos && !encontrado) {

				if (array[posicion] > n){
					// cuando encuentra la posicion
					encontrado = true;
				}
				else {
					posicion++;
				}
				
			}
			// mover todos los valores desde esa posici�n hasta el final una posici�n a la derecha empezando por el �ltimo
			for(int posicionmover = elementos; posicionmover > posicion; posicionmover--) {
				
				array[posicionmover] = array[posicionmover-1];
				
			}
			
			
			// guardar el nuevo elemento en la posici�n
			array[posicion]= n;	
			elementos++;
			if (elementos >= 5){
				// salgo del bucle
				lleno = true;
			}
			else {
				// leo n
				System.out.println("n: ");
				n= teclado.nextInt();
			}
		}
		
		// cierro el objeto de tipo Scanner
		teclado.close();
		
		// saca por pantalla el array
		for (posicion=0;posicion< elementos;posicion=posicion+1){
			// la saco por pantalla
			System.out.println(array[posicion]);
		}
		
	}

}
