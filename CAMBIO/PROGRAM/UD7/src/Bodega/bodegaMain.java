package Bodega;

import java.util.ArrayList;
import java.util.Scanner;

public class bodegaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		artikuloZerrenda a = new artikuloZerrenda();
		a.fillData();
		int aukera, znb, kop, stock;
		double prezioa;
		String be = "", izena, abizena, kkodea;

		do {
			do {
				System.out.println("**************************");
				System.out.println("   SALMENTEN KUDEAKETA    ");
				System.out.println("**************************");
				System.out.println("1.- Salmenta bat egin (faktura sortu).");
				System.out.println("2.- Artikulo guztiak ikusi.");
				System.out.println("3.- Artikulo osasungarriak ikusi.");
				System.out.println("4.- Kode bat eskatu eta artikulo horren prezio ekibalentea duten artikulo zerrenda.");
				System.out.println("5.- Produktu garestienak ikusi.");
				System.out.println("6.- Stock gutxi duten produktuen zerrenda.");
				System.out.println("7.- Kodea sartu eta artikuloaren stock-a gehitu.");
				System.out.println("0.- Amaitu.");
				System.out.println("**************************");
				System.out.print("Zure aukera:");
				aukera = sc.nextInt();
			} while (aukera < 0 || aukera > 7);

			switch (aukera) {

			case 1:
				System.out.println("*********************");
				System.out.println(" -Salmenta bat egin-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				System.out.println("Faktura zenbakia: ");
				znb = sc.nextInt();
				System.out.println("Bezeroaren izena: ");
				izena = sc.next();
				sc.reset();
				sc.nextLine();
				System.out.println("Bezeroaren abizena: ");
				abizena = sc.next();

				faktura f1 = new faktura(znb, izena, abizena, new ArrayList<fakturaLerroak>());

				System.out.println("Idatzi ezazu produktu kode, kopurua eta sakatu ENTER: adibidez(ARDO01->8)");
				System.out.println("Produktu kodigoak FRES01-08 eta ARDO01-08");
				do {
					System.out.println("Idatzi kodea. Produktuak sartzen amaitzeko idatzi END");
					kkodea = sc.next();
					if (!kkodea.equalsIgnoreCase("end")) {
						System.out.println("Idatzi kopurua.");
						kop = sc.nextInt();
						prezioa = a.salneurria(kkodea) * kop;
						f1.LerroaGehitu(kkodea, kop, prezioa);
						for (artikuloa kont : a.lista) {
							if (kont.kodea.equals(kkodea)) {
								kont.KenduStock(kop);
							}
						}
					}
				} while (!kkodea.equalsIgnoreCase("end"));
				f1.print();

				break;

			case 2:
				System.out.println("**************************");
				System.out.println(" -Artikulo guztiak ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				for (artikuloa kont : a.lista) {
					kont.printEzaugarriak();
				}

				break;

			case 3:
				System.out.println("********************************");
				System.out.println(" -Artikulo osasungarriak ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				for (artikuloa kont : a.lista) {
					if (kont.osasungarriak()) {
						kont.printEzaugarriak();
					}
				}

				break;

			case 4:
				ArrayList<artikuloa> salneurriberdina = new ArrayList<artikuloa>();
				System.out.println("**********************************************************************************");
				System.out.println(" -Kode bat eskatu eta artikulo horren prezio ekibalentea duten artikulo zerrenda-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				System.out.println("Sartu kodea (adibidez: ARDO01 edo FRES01):");
				kkodea = sc.next();
				salneurriberdina = a.ekibalentea(kkodea);
				for (artikuloa kont : salneurriberdina) {
					kont.printEzaugarriak();
				}

				break;

			case 5:
				ArrayList<artikuloa> garestiena = new ArrayList<artikuloa>();
				System.out.println("******************************");
				System.out.println(" -Produktu garestienak ikusi-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				garestiena = a.garestiena();
				for (artikuloa kont : garestiena) {
					kont.printEzaugarriak();
				}

				break;

			case 6:
				ArrayList<artikuloa> reponer = new ArrayList<artikuloa>();
				System.out.println("*****************************************");
				System.out.println(" -Stock gutxi duten produktuen zerrenda-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				reponer = a.reponer();
				for (artikuloa kont : reponer) {
					kont.printEzaugarriak();
				}

				break;

			case 7:
				System.out.println("***********************************************");
				System.out.println(" -Kodea sartu eta artikuloaren stock-a gehitu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				System.out.println("Sartu kodea (adibidez: ARDO01 edo FRES01):");
				kkodea = sc.next();
				System.out.println("Sartu zenbat stock gehitu nahi diozun:");
				stock = sc.nextInt();
				for (artikuloa kont : a.lista) {
					if (kkodea.equalsIgnoreCase(kont.getKodea())) {
						kont.GehituStock(stock);
					}
				}

				break;

			case 0:
				System.out.println("************************");
				System.out.println(" -Programatik irtetzen-");
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
