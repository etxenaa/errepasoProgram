package AriketakUD2;

import java.util.Scanner;

public class Bukleak8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int adina,aukera,a=1;
		double prezioa1,prezioa2;
		String nan,izena,abizena,be="",bai="bai",ez="ez",liburua,aladin="aladin";
		
		System.out.println("Esan zure NAN zenbakia:");
		nan = sc.next();
		while (nan.length()!=9) {
			System.out.println("ERROR, NANak 9 karaktere izan behar ditu");
			System.out.println("Esan zure NAN zenbakia:");
			nan = sc.next();
		}
		System.out.println("Esan zure izena:");
		izena = sc.next();
		System.out.println("Eta zure abizena:");
		abizena = sc.next();
		System.out.println("Zein da zure adina?");
		adina = sc.nextInt();
		
		if (adina<=18) {
			System.out.println("Ezin zara sisteman sartu! 18 urte bain gehiago behar dituzu.");
			System.exit(0);
		}
		else {
			System.out.println("Kaixo, "+izena+" "+abizena+" ongi etorri.");
			
			do {
			System.out.println("Zer egin nahi duzu?");
			System.out.println("1.- Liburua erosi");
			System.out.println("2.- Liburua dagoen konprobatu");
			System.out.println("3.- Programatik irten");
			aukera = sc.nextInt();
			
			switch (aukera) {
				case 1:
					System.out.println("Zenbat balio dute zure bi liburuak?");
					prezioa1 = sc.nextDouble();
					prezioa2 = sc.nextDouble();
					while (prezioa1<0 || prezioa2<0) {
						System.out.println("Prezioa ezin da negatiboa izan.");
						System.out.println("Zenbat balio dute zure bi liburuak?");
						prezioa1 = sc.nextDouble();
						prezioa2 = sc.nextDouble();
					}
					System.out.println("Guztira:"+(prezioa1+prezioa2));
					
					do {
						System.out.println("Programatik iren nahi duzu? BAI/EZ");
						System.out.println("BAI ala EZ bakarrik idatzi.");
						be = sc.next();
						be = be.toLowerCase();
						if (be.equals(bai)) {
							System.exit(0);
						}
					} while (be.equals(ez));
				break;
				
				case 2:
					System.out.println("Sartu liburu baten izena:");
					liburua = sc.next();
					liburua = liburua.toLowerCase();
					
					if (liburua.equals(aladin)) {
						System.out.println("Liburu hori badaukagu");
					}
					else {
						System.out.println("Liburu hori ez daukagu");
					}
					
					do {
						System.out.println("Programatik iren nahi duzu? BAI/EZ");
						System.out.println("BAI ala EZ bakarrik idatzi.");
						be = sc.next();
						be = be.toLowerCase();
						if (be.equals(bai)) {
							System.exit(0);
						}
					} while (be.equals(ez));
				break;
			}
			} while (be.equals(ez));
		}
	}

}
