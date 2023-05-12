package AriketakUD4;

import java.util.Scanner;

public class Liburutegia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] izenburua = new String[20];
		izenburua[0] = "Ezer ez";
		izenburua[1] = "Lotsati ilunpetik argira";
		izenburua[2] = "Txoriak kolpeka";
		izenburua[3] = "Txanogorritxu";
		izenburua[4] = "12 ipuin klasiko";
		izenburua[5] = "Pepe eta Mila";
		izenburua[6] = "Haserretu zaitezte";
		izenburua[7] = "Etxe hutsean";
		izenburua[8] = "123";
		izenburua[9] = "Egun beltza";
		izenburua[10] = "Hobbita";
		izenburua[11] = "Judu kale";

		int[] prezioa = new int[20];
		prezioa[0] = 15;
		prezioa[1] = 12;
		prezioa[2] = 15;
		prezioa[3] = 25;
		prezioa[4] = 19;
		prezioa[5] = 17;
		prezioa[6] = 25;
		prezioa[7] = 13;
		prezioa[8] = 11;
		prezioa[9] = 18;
		prezioa[10] = 25;
		prezioa[11] = 35;

		int aukera, posizioa = 12, salneurria, elementuak = 12, liburuprezio = 0;
		String be = "", liburua, izenberria = "";
		boolean aurkituta;

		System.out.println("Ongi etorri gure liburutegira!");

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- Liburu guztien izena ikusi.");
				System.out.println("2.- Liburu guztien izena eta salneurria ikusi.");
				System.out.println("3.- Liburu baten salneurria ikusi.");
				System.out.println("4.- Liburu berri bat sartu.");
				System.out.println("5.- Liburu bat ezabatu.");
				System.out.println("6.- Liburu baten salneurria aldatu.");
				System.out.println("7.- Liburu baten izena aldatu.");
				System.out.println("8.- Programatik irten.");
				aukera = sc.nextInt();
			} while (aukera < 1 || aukera > 8);

			switch (aukera) {

			case 1:
				System.out.println("-Liburu guztien izena ikusi-");
				System.out.println();
				for (int i = 0; i < izenburua.length; i++) {
					if (izenburua[i] != null) {
						System.out.println(izenburua[i]);
						System.out.println();
					}

				}
				break;

			case 2:
				System.out.println("-Liburu guztien izena eta salneurria ikusi-");
				System.out.println();
				for (int i = 0; i < izenburua.length; i++) {
					if (izenburua[i] == null) {
						System.out.print("");
					} else {
						System.out.println(izenburua[i] + " liburuaren salneurria " + prezioa[i] + " Euro da.");
						System.out.println();
					}
				}
				break;

			case 3:
				System.out.println("-Liburu baten salneurria ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				aurkituta = false;

				System.out.println("Zein da liburuaren izena?");
				liburua = sc.nextLine();
				liburua.equalsIgnoreCase(liburua);

				for (int j = 0; j < izenburua.length; j++) {
					if (liburua.equalsIgnoreCase(izenburua[j])) {
						aurkituta = true;
						liburuprezio = j;
					}
				}

				if (aurkituta) {
					System.out.println(
							izenburua[liburuprezio] + " liburuaren salneurria " + prezioa[liburuprezio] + " Euro da.");
				} else {
					System.out.println("Liburu hori ez dago liburutegi honetan :(");
				}
				break;

			case 4:
				System.out.println("-Liburu berri bat sartu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				if (elementuak < izenburua.length) {
					System.out.println("Zein da liburuaren izena?");
					izenburua[posizioa] = sc.nextLine();

					System.out.println("Zein da liburuaren prezioa?");
					prezioa[posizioa] = sc.nextInt();

					elementuak++;
					posizioa++;
				} else {
					System.out.println("Arraya beteta dago");
				}
				break;

			case 5:
				System.out.println("-Liburu bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				System.out.println("Zein da liburuaren izena?");
				liburua = sc.nextLine();

				aurkituta = false;

				for (int j = 0; j < izenburua.length; j++) {
					if (liburua.equalsIgnoreCase(izenburua[j])) {
						aurkituta = true;
						liburuprezio = j;
					}
				}

				if (aurkituta) {
					for (int posicionmover = liburuprezio; posicionmover <= (elementuak - 1); posicionmover++) {
						izenburua[posicionmover] = izenburua[posicionmover + 1];
						prezioa[posicionmover] = prezioa[posicionmover + 1];
					}
					izenburua[elementuak] = null;
					prezioa[elementuak] = 0;
					elementuak--;
					System.out.println("Liburua ezabatu egin da.");
				} else {
					System.out.println("Error. Liburu hori ez dago liburutegi honetan :(");
				}
				break;

			case 6:
				System.out.println("-Liburu baten salneurria aldatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				aurkituta = false;

				System.out.println("Zein da liburuaren izena?");
				liburua = sc.nextLine();
				liburua.equalsIgnoreCase(liburua);

				for (int j = 0; j < izenburua.length; j++) {
					if (liburua.equalsIgnoreCase(izenburua[j])) {
						aurkituta = true;
						liburuprezio = j;
					}
				}

				if (aurkituta) {
					System.out.println(
							izenburua[liburuprezio] + " liburuaren salneurria " + prezioa[liburuprezio] + " Euro da.");
					System.out.println();
					System.out.println("Zein da prezio berria?");
					prezioa[liburuprezio] = sc.nextInt();
					System.out.println("Prezioa aldatu egin da.");
					System.out.println(
							izenburua[liburuprezio] + " liburuaren salneurria " + prezioa[liburuprezio] + " Euro da.");
				} else {
					System.out.println("Error. Liburu hori ez dago liburutegi honetan :(");
				}
				break;

			case 7:
				System.out.println("-Liburu baten izena aldatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				aurkituta = false;

				System.out.println("Zein da liburuaren izena?");
				liburua = sc.nextLine();
				liburua.equalsIgnoreCase(liburua);

				for (int j = 0; j < izenburua.length; j++) {
					if (liburua.equalsIgnoreCase(izenburua[j])) {
						aurkituta = true;
						liburuprezio = j;
					}
				}

				if (aurkituta) {
					izenberria = izenburua[liburuprezio];
					System.out.println("Zein da izenburu berria?");
					izenburua[liburuprezio] = sc.next();
					System.out.println("Izena aldatu egin da.");
					System.out.println(izenberria + " liburuaren izen berria " + izenburua[liburuprezio] + " da.");
				} else {
					System.out.println("Error. Liburu hori ez dago liburutegi honetan :(");
				}
				break;

			case 8:
				System.out.println("-Programatik irtetzen-");
				System.out.println("Agur, eskerrik asko!");
				System.exit(0);
				break;
			// switch amaiera
			}

			System.out.println("Programatik iren nahi duzu? BAI/EZ");
			be = sc.next();
			be = be.toLowerCase();

			if (be.equals("bai")) {
				System.out.println("Eskerrikasko. Agur!!!!");
				System.exit(0);
			}

			while (!be.equals("ez") && !be.equals("bai")) {
				System.out.println("BAI ala EZ bakarrik idatzi!");
				System.out.println("Programatik iren nahi duzu? BAI/EZ");
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
