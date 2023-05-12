package AriketakUD4;

import java.util.Scanner;

public class ArrayGehigarri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] segida = new int[100];
		int aukera, gehiketa, gehiketa2 = 0, media, max = 0, min=0;
		String be = "";

		for (int i = 0; i < segida.length; i++) {
			segida[i] = (int) Math.floor(Math.random() * 100);
		}

		do {
			do {
				System.out.println("1.- Irten");
				System.out.println("2.- Zenbaki guztien batura");
				System.out.println("3.- Maximoa ikusi");
				System.out.println("4.- Minimoa ikusi");
				System.out.println("5.- Media ikusi");
				System.out.println("6.- Zenbaki berriak sortu");
				aukera = sc.nextInt();
			} while (aukera < 1 || aukera > 6);

			
			switch (aukera) {

			case 1:
				System.out.println("-Programatik irtetzen-");
				System.out.println("Agur, eskerrik asko!");
				System.exit(0);
				break;

			case 2:
				gehiketa = 0;
				System.out.println("-Zenbaki guztien batura-");
				System.out.println();

				for (int i = 0; i < segida.length; i++) {
					gehiketa = segida[i] + gehiketa;
				}
				System.out.println(gehiketa);
				break;

			case 3:
				System.out.println("-Maximoa ikusi-");
				System.out.println();
				
				max = segida[0];
				for (int j=1; j<segida.length;j++) {
					if (segida[j] > max){
						max = segida[j];
					}
				}
				System.out.println(max);
				break;

			case 4:
				System.out.println("-Minimoa ikusi-");
				System.out.println();
				
				min = segida[0];
				for (int j=1; j<segida.length;j++) {
					if (segida[j] < min){
						min = segida[j];
					}
				}
				System.out.println(min);
				break;

			case 5:
				gehiketa2 = 0;
				System.out.println("-Media ikusi-");
				System.out.println();

				for (int i = 0; i < segida.length; i++) {
					gehiketa2 = segida[i] + gehiketa2;
				}

				media = gehiketa2 / segida.length;
				System.out.println(media);
				break;

			case 6:
				System.out.println("-Zenbaki berriak sortu-");
				System.out.println();

				for (int i = 0; i < segida.length; i++) {
					segida[i] = (int) Math.floor(Math.random() * 100);
				}
				break;
			}// switch amaiera


		} while (aukera!=1);
		sc.close();
	}

}
