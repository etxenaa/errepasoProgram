package AriketakUD2;

import java.util.Scanner;

public class StringKlasea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String izena,hitza,hitza2,mm,min="minuskula";
		int aukera,a;
		
		
		System.out.println("Kaixo, zein da zure izena?");
		izena = sc.next();
		
		System.out.println("Ongi etorri "+izena+", zer egin nahi duzu?");
		
		System.out.println("1.- Hitz bati buelta eman.");
		System.out.println("2.- Bi hitz konparatu.");
		System.out.println("3.- Letra kopurua.");
		System.out.println("4.- Hitza errepikatu.");
		System.out.println("5.- Hitza errepikatu (maiuskula/minuskula).");
		System.out.println("6.- Programatik irten.");
		aukera = sc.nextInt();
		
		switch (aukera){
		
			case 1:
				System.out.println("Idatzi hitz bat:");
				hitza = sc.next();
				StringBuilder strb = new StringBuilder(hitza);
				hitza = strb.reverse().toString();
				System.out.println(hitza);
			break;
			
			case 2:
				System.out.println("Idatzi bi hitz:");
				hitza = sc.next();
				hitza2 = sc.next();
				
				if (hitza.equals(hitza2)) {
					System.out.println("Hitzak berdinak dira.");
				} else {
					System.out.println("Hitzak desberdinak dira.");
				}
			break;
			
			case 3:
				System.out.println("Idatzi hitz bat:");
				hitza = sc.next();
				System.out.println(hitza+" "+hitza.length()+" digitu ditu.");
				if (hitza.length()>=7) {
					System.out.println("Hitzaren tamaina handia da.");
				} else {
					System.out.println("Hitzaren tamaina txikia da.");
				}
			break;
			
			case 4:
				System.out.println("Idatzi hitz bat:");
				hitza = sc.next();
				System.out.println("Zenbat aldiz errepikatu nahi duzu hitza?");
				a = sc.nextInt();
				for (int i=0;i<a;a--) {
					System.out.print(hitza+" ");
				}
				
			break;
			
			case 5:
				System.out.println("Idatzi hitz bat:");
				hitza = sc.next();
				System.out.println("Maiuskula edo minuskula?");
				mm = sc.next();
				mm = mm.toLowerCase();
				if (mm.equals(min)) {
					hitza = hitza.toLowerCase();
				} else {
					hitza = hitza.toUpperCase();
				}
				System.out.println("Zenbat aldiz errepikatu nahi duzu hitza?");
				a = sc.nextInt();
				while (a>6) {
					System.out.println("Hitza ezin da 6 aldiz baino gehiago errepikatu.");
					a = sc.nextInt();
					System.out.println("Zenbat aldiz errepikatu nahi duzu hitza?");
				}
				for (int i=0;i<a;a--) {
					System.out.print(hitza+" ");
				}
			break;
			
			case 6:
				System.out.println("Eskerrik asko! Laster arte!");
				System.exit(0);
			break;
		}
	}
}
