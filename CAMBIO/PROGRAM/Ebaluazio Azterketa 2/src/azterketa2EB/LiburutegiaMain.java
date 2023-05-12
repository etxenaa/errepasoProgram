package azterketa2EB;

import java.util.ArrayList;
import java.util.Scanner;

public class LiburutegiaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		BazkideZerrenda b = new BazkideZerrenda();
		b.fillData();
		Katalogo k = new Katalogo();
		k.fillData();

		int aukera;
		String be = "", nnan = "", kkodea = "", la = "";

		System.out.println("**************************");
		System.out.println(" ONGI ETORRI LIBURUTEGIRA");
		System.out.println("**************************");
		System.out.println("Zure NAN zenbakia mesedez:");
		nnan = sc.next();
		if (!b.bazkideEgin(nnan)) {
			b.BazkideEgin(sc);
		}

		do {
			do {
				System.out.println("         -MENUA-");
				System.out.println("**************************");
				System.out.println("1.- Katalogoa ikusi.");
				System.out.println("2.- Zerbait alokatu.");
				System.out.println("3.- Bazkideak ikusi.");
				System.out.println("4.- Aldizkari edo liburu bat gehitu.");
				System.out.println("5.- Bazkidearen publikazioak ikusi.");
				System.out.println("0.- Amaitu.");
				System.out.println("**************************");
				System.out.print("Zure aukera:");
				aukera = sc.nextInt();
				System.out.println();
			} while (aukera < 0 || aukera > 5);

			switch (aukera) {

			case 1:
				System.out.println("*******************");
				System.out.println(" -Katalogoa ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				for (Publikazioa kont : k.kata) {
					System.out.println(kont);
				}
				break;

			case 2:
				System.out.println("*******************");
				System.out.println(" -Zerbait alokatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				System.out.println("Kodea sartu: ");
				kkodea = sc.next();
				if (k.publikazioPosizioa(kkodea) >= 0) {
					//falta por terminar
					System.out.println("Liburua gehitu da.");
				} else {
					System.out.println("Liburu hori ez dago katalogoan.");
				}
				break;

			case 3:
				System.out.println("*******************");
				System.out.println(" -Bazkideak ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				for (Bazkide kont : b.zerrenda) {
					System.out.println(kont);
				}
				break;

			case 4:
				System.out.println("************************************");
				System.out.println(" -Aldizkari edo liburu bat gehitu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				System.out.println("Zer da liburua edo aldizkaria?");
				la = sc.next();
				while (!la.equalsIgnoreCase("liburua") && !la.equalsIgnoreCase("aldizkaria")) {
					System.out.println("Zer da liburua edo aldizkaria?");
					la = sc.next();
				}
				if (la.equalsIgnoreCase("liburua")) {
					Publikazioa l8 = new Liburu();
					l8.irakurri(sc);
					k.kata.add(l8);
					System.out.println("Liburua gehitu da.");
				} else {
					Publikazioa a8 = new Aldizkari();
					a8.irakurri(sc);
					k.kata.add(a8);
					System.out.println("Aldizkaria gehitu da.");
				}
				break;

			case 5:
				System.out.println("**********************************");
				System.out.println(" -Bazkidearen publikazioak ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				System.out.println("NANa sartu: ");
				nnan = sc.next();
				if (b.bazkidearenPosizioa(nnan) >= 0) {
					for (Bazkide kont : b.zerrenda) {
						if (kont.getDni().equalsIgnoreCase(nnan)) {
							kont.print();
						}
					}
				} else {
					System.out.println("Bazkidea ez da existitzen.");
				}
				break;

			case 0:
				System.out.println("************************");
				System.out.println(" -Programatik irtetzen-");
				System.out.println("  Agur, eskerrik asko!");
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
