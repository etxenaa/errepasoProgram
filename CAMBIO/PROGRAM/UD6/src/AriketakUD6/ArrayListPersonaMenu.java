package AriketakUD6;

import java.util.ArrayList;
import java.util.Scanner;

import AriketakUD6.Persona;

public class ArrayListPersonaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Persona> a = new ArrayList<Persona>();

		Persona p1 = new Persona();
		Persona konparatu = new Persona();

		int aukera;
		String be = "";

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- Pertsona gehitu.");
				System.out.println("2.- Pertsona bilatu.");
				System.out.println("3.- Pertsona ezabatu.");
				System.out.println("4.- Arraya erakutsi.");
				System.out.println("5.- Programatik irten.");
				aukera = sc.nextInt();
				System.out.println();
			} while (aukera < 1 || aukera > 5);

			switch (aukera) {

			case 1:
				System.out.println("-String berri bat sartu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				p1 = new Persona();

				System.out.println("Sartu pertsona:");
				p1.leer(sc);
				a.add(p1);
				System.out.println();
				System.out.println("Pertsona gorde da.");
				break;

			case 2:
				System.out.println("-Pertsona bat bilatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				konparatu = new Persona();

				System.out.println("Sartu bilatu nahi duzun hitza: ");
				konparatu.leer(sc);
				System.out.println();

				if (a.contains(konparatu)) {
					System.out.println("Pertsona " + a.indexOf(konparatu) + " posizioan dago.");
				} else {
					System.out.println("Pertsona ez dago.");
				}
				break;

			case 3:
				System.out.println("-Pertsona bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				konparatu = new Persona();

				System.out.println("Sartu ezabatu nahi duzun pertsona: ");
				konparatu.leer(sc);
				System.out.println();

				if (a.contains(konparatu)) {
					a.remove(konparatu);
					System.out.println("Pertsona ezabatu egin da.");
				} else {
					System.out.println("Pertsona ez dago.");
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
