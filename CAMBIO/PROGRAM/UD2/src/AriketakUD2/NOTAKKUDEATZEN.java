package AriketakUD2;

import java.util.Scanner;

public class NOTAKKUDEATZEN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String pasahitza,erabiltzailea,izena,abizena;
		double azterketa1,azterketa2,azterketa3,azterketafinala,azkenlana,media;
		int aukera;
		
		System.out.println("Sartu zure erabiltzailea:");
		erabiltzailea = sc.next();
		System.out.println("Sartu zure pasahitza:");
		pasahitza = sc.next();
		pasahitza = pasahitza.toLowerCase();
		
		while (pasahitza.indexOf("e") != -1) {
			System.out.println("ERROR, pasahitzak ezin d e/E agertu");
			System.out.println("Sartu zure erabiltzailea:");
			erabiltzailea = sc.next();
			System.out.println("Sartu zure pasahitza:");
			pasahitza = sc.next();
			pasahitza = pasahitza.toLowerCase();
		}
		System.out.println("MENUA:");
		System.out.println("1- Notak sartu");
		System.out.println("2- Irten");
		aukera = sc.nextInt();
		
		switch (aukera) {
		
		case 1:
			
		System.out.println("Kaixo, sartu zure izena:");
		izena = sc.next();
		System.out.println("Eta zure abizena:");
		abizena = sc.next();
		System.out.println("Sartu zure lehen azterketaren nota:");
		azterketa1 = sc.nextDouble();
		while (azterketa1 < 0) {
			System.out.println("ERROR, ezin da negatiboa izan!");
			System.out.println("Sartu zure lehen azterketaren nota:");
			azterketa1 = sc.nextDouble();
		}
		System.out.println("Sartu zure bigarren azterketaren nota:");
		azterketa2 = sc.nextDouble();
		while (azterketa2 < 0) {
			System.out.println("ERROR, ezin da negatiboa izan!");
			System.out.println("Sartu zure bigarren azterketaren nota:");
			azterketa2 = sc.nextDouble();
		}
		System.out.println("Sartu zure hirugarren azterketaren nota:");
		azterketa3 = sc.nextDouble();
		while (azterketa3 < 0) {
			System.out.println("ERROR, ezin da negatiboa izan!");
			System.out.println("Sartu zure hirugarren azterketaren nota:");
			azterketa3 = sc.nextDouble();
		}
		System.out.println("Sartu zure azken azterketaren nota:");
		azterketafinala = sc.nextDouble();
		while (azterketafinala < 0) {
			System.out.println("ERROR, ezin da negatiboa izan!");
			System.out.println("Sartu zure azken azterketaren nota:");
			azterketafinala = sc.nextDouble();
		}
		System.out.println("Sartu zure azken lanaren nota:");
		azkenlana = sc.nextDouble();
		while (azkenlana < 0) {
			System.out.println("ERROR, ezin da negatiboa izan!");
			System.out.println("Sartu zure azken lanaren nota:");
			azkenlana = sc.nextDouble();
		}
		
		media = ((azterketa1+azterketa2+azterketa3)/3*0.55)+(azterketafinala*0.3)+(azkenlana*0.15);
		
		if (media>=0 && media<=4.9) {
			System.out.println(izena+" "+abizena+" ikaslearen nota globala "+media+", gutxi da.");
		}
		else if (media>=5 && media<=5.9) {
			System.out.println(izena+" "+abizena+" ikaslearen nota globala "+media+", nahiko da.");
		}
		else if (media>=6 && media<=6.9) {
			System.out.println(izena+" "+abizena+" ikaslearen nota globala "+media+", ondo da.");
		}
		else if (media>=7 && media<=8.9) {
			System.out.println(izena+" "+abizena+" ikaslearen nota globala "+media+", oso ondo da.");
		}
		else if (media>=9 && media<=10) {
			System.out.println(izena+" "+abizena+" ikaslearen nota globala "+media+", bikain da.");
		}
		
		break;
		
		case 2:
			System.out.println("Eskerrikasko, laster arte!");
			System.exit(0);
		break;
		}
	


	}

}
