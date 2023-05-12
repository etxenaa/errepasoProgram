package AriketakUD5;

import java.util.Scanner;

public class PersonaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Persona[] c = new Persona[5];
		
		Persona konparatu = new Persona();
		int aukera, posizioa = 0, personaaurkitua = 0;
		String be = "", izena = "";
		boolean aurkituta;

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
				System.out.println("-Pertsona berri bat sartu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				int i=0;
				aurkituta = false;
				
				if (posizioa >= c.length) {
				    System.out.println("Arraya beteta dago.");
				}
				else {
					while (i<c.length && !aurkituta) {
	                    if (c[i]==null) {
	                        aurkituta = true;
	                        System.out.println("Sartu " + (posizioa + 1) + ". pertsona");
	                        c[i] = new Persona();
	    					c[i].leer(sc);
	    					System.out.println();
	                        System.out.println("Pertsona gorde da.");
	                        posizioa++;
	                    }
	                    else {
	                        i++;
	                    }
					}
				}
			break;

			
			case 2:
				System.out.println("-Pertsona bat bilatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				aurkituta = false;

				System.out.println("Sartu pertsonaren baloreak:");
				konparatu.leer(sc);
				System.out.println();
				
				//cambiar a while
				for (int j = 0; j < posizioa; j++) {
					if (konparatu.equals(c[j])) {
						aurkituta = true;
						personaaurkitua = j;
					}
				}

				if (aurkituta) {
					System.out.println((personaaurkitua + 1) + ". posizioan dago pertsona.");
					System.out.println();
					System.out.println(c[personaaurkitua]);
				} else {
					System.out.println("Pertsona hori ez dago gordeta.");
				}
			break;

			
			case 3:
				System.out.println("-Pertsona bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				aurkituta = false;
				
				System.out.println("Sartu pertsonaren baloreak:");
				konparatu.leer(sc);
				System.out.println();
				
				//cambiar a while
				for (int j = 0; j < posizioa; j++) {
					if (konparatu.equals(c[j])) {
						aurkituta = true;
						personaaurkitua = j;
					}
				}
			 
				if (aurkituta) { 
					for (int posicionmover = personaaurkitua; posicionmover <=(posizioa - 1); posicionmover++) {
						c[posicionmover] = c[posicionmover + 1];
					}
					c[posizioa] = null;
					posizioa--;
					
					System.out.println("Pertsona ezabatu egin da."); 
				}
				else {
				System.out.println("Error. Pertsona hori ez dago.");
				}
			break;
			
				
			case 4:
				System.out.println("-Pertsona guztiak ikusi-");
				System.out.println();
				for (int k = 0; k < posizioa; k++) {
					System.out.println(c[k]);
					System.out.println();
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
