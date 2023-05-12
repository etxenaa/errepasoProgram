package AriketakUD4;

import java.util.Scanner;

public class ArrayGehigarri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] segida = new String[5];
		segida[0] = "jon";
		segida[1] = "aimar";
		segida[2] = "mikel";
		segida[3] = "asier";
		segida[4] = "aitor";
		
		int aukera, a=0;
		String izena;
		boolean aurkituta = false;
		
		do {
			do {
				System.out.println("1.- Irten");
				System.out.println("2.- Zerrenda idatzi");
				System.out.println("3.- Izen bat eskatu eta agerpenak kontatu");
				System.out.println("4.- Izen bat eskatu eta badagoen esan");
				System.out.println("5.- Ezabatu. Izen bat eskatu eta izen hori dagoen lekuan “null” sartu");
				aukera = sc.nextInt();
			} while (aukera < 1 || aukera > 5);

			
			switch (aukera) {

			case 1:
				System.out.println("-Programatik irtetzen-");
				System.out.println("Agur, eskerrik asko!");
				System.exit(0);
				break;

			case 2:
				System.out.println("-Zerrenda idatzi-");
				System.out.println();
				
				for (int i=0;i<segida.length;i++) {
					System.out.println(segida[i]);
				}

				break;

			case 3:
				System.out.println("-Izen bat eskatu eta agerpenak kontatu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				System.out.println("Esan izen bat");
				izena = sc.next();
				izena.equalsIgnoreCase(izena);
				
				a=0;
				for (int i=0;i<segida.length;i++) {
					if (izena.equals(segida[i])) {
						a++;
					}
				}
				System.out.println(izena+" izena "+a+" aldiz agertzen da.");
				System.out.println();
				
				break;

			case 4:
				System.out.println("-Izen bat eskatu eta badagoen esan-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				System.out.println("Esan izen bat");
				izena = sc.next();
				izena.equalsIgnoreCase(izena);
				
				int posicion=0;
				while (!aurkituta && (posicion<segida.length)) {
					if (izena.equals(segida[posicion])) {
						aurkituta=true;
					} else {
						posicion++;
					}
				}
				if (aurkituta) {
					System.out.println(izena+" badago.");
				}
				if (!aurkituta) {
					System.out.println(izena+" ez dago.");
				}
				
				
				break;

			case 5:
				System.out.println("-Ezabatu. Izen bat eskatu eta izen hori dagoen lekuan “null” sartu-");
				System.out.println();
				sc.reset();
				sc.nextLine();
				
				System.out.println("Esan izen bat");
				izena = sc.next();
				izena.equalsIgnoreCase(izena);
				
				posicion=0;
				for (int b=0;b<segida.length;b++) {
					if (izena.equals(segida[posicion])) {
						aurkituta=true;
						segida[posicion]=null;
					}
				}
				if (aurkituta) {
					System.out.println(izena+" ezabatu da.");
				}
				if (!aurkituta) {
					System.out.println(izena+" ez dago.");
				}

				break;
			}// switch amaiera


		} while (aukera!=1);
		sc.close();
	}

}
