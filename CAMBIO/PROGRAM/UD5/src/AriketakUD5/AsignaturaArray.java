package AriketakUD5;

import java.util.Scanner;

public class AsignaturaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Asignatura [] c = new Asignatura[10];
		
		
		int i=0,cont=0;
		
		while (i<c.length) {
			System.out.println("Sartu "+(i+1)+". asignatura");
			Asignatura w = new Asignatura();
			w.leer(sc);
			if (w.getNota()<0) {
				System.out.println("Nota negtiboak ezin dira sartu.");
				i=10;
			}
			else {
				c[i] = w;
				cont++;
			}
			i++;
		}
		
		for (int k=0;k<cont;k++) {
			System.out.println(c[k]);
		}
		
	}

}
