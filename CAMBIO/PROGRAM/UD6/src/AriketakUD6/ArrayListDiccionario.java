package AriketakUD6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDiccionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> a = new ArrayList<String>();

		int aukera;
		String be = "",hitza="";

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- Hitza gehitu.");
				System.out.println("2.- Hitza bilatu.");
				System.out.println("3.- Hitza ezabatu.");
				System.out.println("4.- Arraya erakutsi.");
				System.out.println("5.- Programatik irten.");
				aukera = sc.nextInt();
				System.out.println();
			} while (aukera < 1 || aukera > 5);

			switch (aukera) {

			case 1:
				System.out.println("-Hitz berri bat sartu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				System.out.println("Sartu Hitza:");
				hitza = sc.next();
				if (a.contains(hitza)) {
					System.out.println("Hitz hori badago.");
				}
				else {
					a.add(hitza);
					Collections.sort(a);
					System.out.println();
					System.out.println("Hitza gorde da.");
				}
				break;

			case 2:
				System.out.println("-Hitz bat bilatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				System.out.println("Sartu bilatu nahi duzun hitza: ");
				hitza = sc.next();
				System.out.println();

				if (a.contains(hitza)) {
					System.out.println("Hitza " + a.indexOf(hitza) + " posizioan dago.");
					System.out.println(a.get(a.indexOf(hitza)));
				} else {
					System.out.println("Hitza ez dago.");
				}
				break;

			case 3:
				System.out.println("-Hitza bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				System.out.println("Sartu ezabatu nahi duzun Hitza: ");
				hitza = sc.next();
				System.out.println();

				if (a.contains(hitza)) {
					a.remove(hitza);
					System.out.println("Hitza ezabatu egin da.");
				} else {
					System.out.println("Hitza ez dago.");
				}
				break;

			case 4:
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
