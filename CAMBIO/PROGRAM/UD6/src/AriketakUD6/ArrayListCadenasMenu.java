package AriketakUD6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListCadenasMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
		Iterator<String> it = a.iterator();
		
		
		int aukera, posizioa = 0;
		String be = "", hitza = "";

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- String gehitu.");
				System.out.println("2.- String bat bilatu.");
				System.out.println("3.- String bat ezabatu.");
				System.out.println("4.- ArrayLista erakutsi.");
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
				
                System.out.println("Sartu " + (posizioa + 1) + ". String-a");
                hitza = sc.next();
                a.add(hitza);
				System.out.println();
                System.out.println("String-a gorde da.");
                posizioa++;
			break;

			
			case 2:
				System.out.println("-String bat bilatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				System.out.println("Sartu bilatu nahi duzun hitza: ");
				hitza = sc.next();
				if (a.contains(hitza)) {
					System.out.println("Hitza "+a.indexOf(hitza)+" posizioan dago.");
				}
				else {
					System.out.println("Hitza ez dago.");
				}
			break;

			
			case 3:
				System.out.println("-String bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				System.out.println("Sartu ezabatu nahi duzun hitza: ");
				hitza = sc.next();
				if (a.contains(hitza)) {
					a.remove(hitza);
					System.out.println("Hitza ezabatu egin da.");
				}
				else {
					System.out.println("Hitza ez dago.");
				}
			break;
			
				
			case 4:
				System.out.println("-ArrayLista ikusi-");
				System.out.println();
				
				while (it.hasNext()) {
					System.out.println(it.next());
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
