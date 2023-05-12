package Pertsona;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Empleado> a = new ArrayList<Empleado>();
		
		Empleado e1 = new Empleado();
		
		String be = "";
		
		do {
			System.out.println("Sartu datuak:");
			e1.Irakurri(sc);
			a.add(e1);
			sc.reset();
			sc.nextLine();
			e1 = new Empleado();
			System.out.println();
			System.out.println("Beste bat sartu nahi duzu? BAI/EZ");
			be = sc.next();
			be = be.toLowerCase();

			if (be.equals("ez")) {
				System.out.println("Eskerrikasko. Agur!!!!");
				System.exit(0);
			}

			while (!be.equals("bai") && !be.equals("ez")) {
				System.out.println();
				System.out.println("BAI ala EZ bakarrik idatzi!");
				System.out.println("Beste bat sartu nahi duzu? BAI/EZ");
				be = sc.next();
				be = be.toLowerCase();
				if (be.equals("ez")) {
					System.out.println("Eskerrikasko. Agur!!!!");
				}
			}
		} while (be.equals("bai"));
		
		
		for (Empleado i : a) {
			System.out.println(i);
		}
	}

}
