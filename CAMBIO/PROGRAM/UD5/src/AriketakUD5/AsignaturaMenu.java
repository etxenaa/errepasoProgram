package AriketakUD5;

import java.util.Scanner;

public class AsignaturaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Asignatura[] c = new Asignatura[5];
		
		Asignatura konparatu = new Asignatura();
		int aukera, posizioa = 0, asignaturaaurkitua = 0;
		String be = "", izena = "";
		boolean aurkituta;

		do {
			do {
				System.out.println("ZER EGIN NAHI DUZU?");
				System.out.println("1.- Asignatura gehitu.");
				System.out.println("2.- Asignatura bilatu.");
				System.out.println("3.- Asignatura ezabatu.");
				System.out.println("4.- Arraya erakutsi.");
				System.out.println("5.- Programatik irten.");
				aukera = sc.nextInt();
				System.out.println();
			} while (aukera < 1 || aukera > 5);

			switch (aukera) {

			case 1:
				System.out.println("-Asignatura berri bat sartu-");
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
	                        System.out.println("Sartu " + (posizioa + 1) + ". asignatura");
	                        c[i] = new Asignatura();
	    					c[i].leer(sc);
	    					System.out.println();
	                        System.out.println("Asignatura gorde da.");
	                        posizioa++;
	                    }
	                    else {
	                        i++;
	                    }
					}
				}
			break;

			
			case 2:
				System.out.println("-Asignatura bat bilatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();

				aurkituta = false;

				System.out.println("Sartu asignaturaren baloreak:");
				konparatu.leer(sc);
				System.out.println();
				
				//cambiar a while
				for (int j = 0; j < posizioa; j++) {
					if (konparatu.equals(c[j])) {
						aurkituta = true;
						asignaturaaurkitua = j;
					}
				}

				if (aurkituta) {
					System.out.println((asignaturaaurkitua + 1) + ". posizioan dago asignatura.");
					System.out.println();
					System.out.println(c[asignaturaaurkitua]);
				} else {
					System.out.println("Asignatura hori ez dago gordeta.");
				}
			break;

			
			case 3:
				System.out.println("-Asignatura bat ezabatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				aurkituta = false;
				
				System.out.println("Sartu asignaturaren baloreak:");
				konparatu.leer(sc);
				System.out.println();
				
				//cambiar a while
				for (int j = 0; j < posizioa; j++) {
					if (konparatu.equals(c[j])) {
						aurkituta = true;
						asignaturaaurkitua = j;
					}
				}
			 
				if (aurkituta) { 
					for (int posicionmover = asignaturaaurkitua; posicionmover <=(posizioa - 1); posicionmover++) {
						c[posicionmover] = c[posicionmover + 1];
					}
					c[posizioa] = new Asignatura();
					posizioa--;
					
					System.out.println("Asignatura ezabatu egin da."); 
				}
				else {
				System.out.println("Error. Asignatura hori ez dago.");
				}
			break;
			
				
			case 4:
				System.out.println("-Asignatura guztiak ikusi-");
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
