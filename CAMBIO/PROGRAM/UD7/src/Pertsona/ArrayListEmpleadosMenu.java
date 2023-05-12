package Pertsona;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListEmpleadosMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Empleado> a = new ArrayList<Empleado>();
		
		Empleado e1 = new Empleado();
		Empleado konparatu = new Empleado();
		
		int aukera;
		String be = "";

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- Langilea gehitu.");
				System.out.println("2.- Langilea bilatu.");
				System.out.println("3.- Langilea ezabatu.");
				System.out.println("4.- Arraya erakutsi.");
				System.out.println("5.- Programatik irten.");
				aukera = sc.nextInt();
				System.out.println();
			} while (aukera < 1 || aukera > 5);

			switch (aukera) {

			case 1:
				System.out.println("-Langile berri bat sartu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				e1 = new Empleado();
				
				if (a.contains(e1)) {
					System.out.println("Langile hori badago");
				} else {
					System.out.println("Sartu Langilea:");
					e1.Irakurri(sc);
					a.add(e1);
					System.out.println();
					System.out.println("Langilea gorde da.");
				}
				break;

			case 2:
				System.out.println("-Langile bat bilatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				konparatu = new Empleado();

				System.out.println("Sartu bilatu nahi duzun langilea: ");
				konparatu.leer(sc);
				System.out.println();

				if (a.contains(konparatu)) {
					System.out.println("Langilea " + a.indexOf(konparatu) + " posizioan dago.");
				} else {
					System.out.println("Langilea ez dago.");
				}
				break;

			case 3:
				System.out.println("-Langile bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				konparatu = new Empleado();

				System.out.println("Sartu ezabatu nahi duzun langilea: ");
				konparatu.leer(sc);
				System.out.println();

				if (a.contains(konparatu)) {
					a.remove(konparatu);
					System.out.println("Langilea ezabatu egin da.");
				} else {
					System.out.println("Langilea ez dago.");
				}
				break;

			case 4:
				System.out.println("-ArrayLista ikusi-");
				System.out.println();

				for (Persona kont : a) {
					System.out.println(kont);
				}
				break;

			case 5:
				System.out.println("-Programatik irtetzen-");
				System.out.println("Agur, eskerrik asko!");
				System.exit(0);
				break;
			// switch amaiera
			}
			System.out.println();
			System.out.println("Programatik irten nahi duzu? BAI/EZ");
			be = sc.next();
			be = be.toLowerCase();

			if (be.equals("bai")) {
				System.out.println("Eskerrikasko. Agur!!!!");
				System.exit(0);
			}

			while (!be.equals("ez") && !be.equals("bai")) {
				System.out.println();
				System.out.println("BAI ala EZ bakarrik idatzi!");
				System.out.println("Programatik irten nahi duzu? BAI/EZ");
				be = sc.next();
				be = be.toLowerCase();
				if (be.equals("bai")) {
					System.out.println("Eskerrikasko. Agur!!!!");
				}
			}

		} while (be.equals("ez"));
		sc.close();
	}

}
