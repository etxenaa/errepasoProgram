package AriketakUD4;

import java.util.Scanner;

public class ArrayGehigarria3 {

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
				aukera = sc.nextInt();
			} while (aukera < 1 || aukera > 3);

			
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
			}// switch amaiera


		} while (aukera!=1);
		sc.close();
	}

}
