package MailaFroga;

import java.util.Scanner;

public class ProgramaNagusia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String izena,abizena,fruta,pasahitza,sagarra="sagarra",abc="abc";
		int aukera,adina,a=1;
		double p1,p2,p3;
		
		
		System.out.println("Sartu izena:");
		izena = sc.next();
		System.out.println("Sartu abizena:");
		abizena = sc.next();
		System.out.println("Sartu adina:");
		adina = sc.nextInt();
		if (adina<12) {
			System.out.println("Ezin zara sisteman sartu.");
			System.exit(0);
		}
		else {
		
			System.out.println("Ongi etorri "+izena+" "+abizena+" frutadendara.");
			System.out.println("1- Erosketa berria egin.");
			System.out.println("2- Fruta dagoen konprobatu.");
			System.out.println("3- Fruta sartu.");
			System.out.println("4- Irten.");
			System.out.println("Zer egin nahi duzu?");
			aukera = sc.nextInt();
			
			switch (aukera){
				case 1:
					System.out.println("**Erosketa egin**");
					System.out.println("Sartu lehenengo produktuaren prezioa:");
					p1 = sc.nextDouble();
					while (p1<0) {
						System.out.println("ERROR, sartu berriro.");
						System.out.println("Sartu lehenengo produktuaren prezioa:");
						p1 = sc.nextDouble();
					}
					System.out.println("Sartu bigarren produktuaren prezioa:");
					p2 = sc.nextDouble();
					while (p2<0) {
						System.out.println("ERROR, sartu berriro.");
						System.out.println("Sartu bigarren produktuaren prezioa:");
						p2 = sc.nextDouble();
					}
					System.out.println("Sartu hirugarren produktuaren prezioa:");
					p3 = sc.nextDouble();
					while (p3<0) {
						System.out.println("ERROR, sartu berriro.");
						System.out.println("Sartu hirugarren produktuaren prezioa:");
						p3 = sc.nextDouble();
					}
					System.out.println("Guztira: "+(p1+p2+p3)+" Euro");
				break;
				
				case 2:
					System.out.println("**Fruta dagoen konprobatu**");
					System.out.println("Sartu fruta baten izena:");
					fruta = sc.next();
					fruta = fruta.toLowerCase();
					
					if (fruta.equals(sagarra)) {
						System.out.println("Fruta hori badaukagu");
					}
					else {
						System.out.println("Fruta hori ez daukagu");
					}
				break;
				
				case 3:
					System.out.println("**Fruta sartu**");
					do {
						System.out.println("Ekintza hau egiteko administratzailea izan behar zara. Sartu pasahitza:");
						pasahitza = sc.next();
						if (pasahitza.equals(abc)) {
							a--;
						}
					}while (a==1);
					
					System.out.println("Administraria zara.");
					System.out.println("Sartu frutaren izena:");
					fruta = sc.next();
					System.out.println(fruta+" fruta gorde da.");
					System.out.println(fruta+" fruta gorde da.");
					System.out.println(fruta+" fruta gorde da.");
				break;
				
				case 4:
					System.out.println("**Irten**");
					System.out.println("Gero arte "+izena);
					System.exit(0);
				break;
			}
		}
	}

}
