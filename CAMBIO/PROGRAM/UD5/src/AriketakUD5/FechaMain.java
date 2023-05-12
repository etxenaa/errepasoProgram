package AriketakUD5;

import java.util.Scanner;

public class FechaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teklado = new Scanner(System.in);
		
		//probando los constructores
		Fecha f1 = new Fecha();
		System.out.println(f1);

		Fecha f2 = new Fecha(f1);
		System.out.println(f2);

		Fecha f3 = new Fecha(21, 5, 2022);
		System.out.println(f3);
		
		//probando leer
		Fecha f4 = new Fecha();
		f4.leer(teklado);
		System.out.println(f4);
		
		//comprobando el compareto
		if (f1.compareTo(f4) > 0) {
			System.out.println(f1 + " es mayor que " + f4);
		} else if (f1.compareTo(f4) < 0) {
			System.out.println(f1 + " es menor que " + f4);
		} else {
			System.out.println(f1 + " y " + f4 + " son la misma fecha");
		}
		
		//probando setters
		f2.setAnyo(2);
		System.out.println(f2);

	}

}
