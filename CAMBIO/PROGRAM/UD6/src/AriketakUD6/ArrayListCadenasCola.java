package AriketakUD6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListCadenasCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> a = new ArrayList<String>();

		int aukera;
		String be = "",hitza="";

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- Pertsona gehitu.");
				System.out.println("2.- Sarrera hartu.");
				System.out.println("3.- Arraya erakutsi.");
				System.out.println("4.- Programatik irten.");
				aukera = sc.nextInt();
				System.out.println();
			} while (aukera < 1 || aukera > 4);

			switch (aukera) {

			case 1:
				System.out.println("-Pertsona berri bat sartu ilaran-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				System.out.println("Sartu izena :");
				hitza = sc.next();
				a.add(hitza);
				System.out.println();
				System.out.println("Pertsona ilaran jarri da.");
				break;

			case 2:
				System.out.println("-Ilarako lehenengoari sarrera hartu zaio-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				if (a.isEmpty()) {
					System.out.println("Ilara hutsik dago.");
				}
				else {
					System.out.println(a.get(0)+" irten da ilaratik.");
					a.remove(a.get(0));
				}
				break;

			case 3:
				System.out.println("-ArrayLista ikusi-");
				System.out.println();
				
				if (a.isEmpty()) {
					System.out.println("Arraya hutsik dago.");
				}
				else {
					for (String kont : a) {
						System.out.println(kont);
					}
				}
				break;

			case 4:
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
