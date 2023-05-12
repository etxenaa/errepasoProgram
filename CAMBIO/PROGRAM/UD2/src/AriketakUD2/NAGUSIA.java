package AriketakUD2;

import java.util.Scanner;

public class NAGUSIA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String izena,hitza;
		int adina,aukera,a,b,c,aldea;
		
		System.out.println("Zein da zure izena?");
		izena = sc.next();
		System.out.println("Eta zure adina?");
		adina = sc.nextInt();
		
		if (adina<=18) {
			System.out.println("Ezin zara sisteman sartu!");
		}
		else {
			izena = izena.toUpperCase();
		
		System.out.println("Kaixo, "+izena+" ongi etorri.");
		
		System.out.println("Zer egin nahi duzu?");
		System.out.println("1- Zenbakiak gehitu");
		System.out.println("2- Hitz bat minuskulara pasatu");
		System.out.println("3- Lauki baten azalera kalkulatu");
		System.out.println("0- Irten");
		aukera = sc.nextInt();
		
		switch (aukera) {
		case 1:
			System.out.println("Esan hiru zenbaki");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			System.out.println("Zure zenbakien batura "+(a+b+c)+" da.");
		break;
		
		case 2:
			System.out.println("Esan hitz bat");
			hitza = sc.next();
			
			hitza = hitza.toLowerCase();
			
			System.out.println(hitza);
		break;
		
		case 3:
			System.out.println("Esan laukiaren aldearen neurria");
			aldea = sc.nextInt();
			
			System.out.println("Zure laukiaren azalera "+(aldea*aldea)+" da.");
		break;
		
		case 0: System.exit(0);
		break;
			
		default:System.out.println("Aukera hau ez da existitzen.");
		}
		
		}
		
		
	}

}
