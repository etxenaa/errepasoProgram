package AriketakUD2;

import java.util.Scanner;

public class UmeentzakoPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String izena,pasahitza,ph="program",hitza,be="",bai="bai",ez="ez";
		int aukera,adina,a,b,exit=1;
		
		
		System.out.println("Sartu izena:");
		izena = sc.next();
		do {
			System.out.println("Sartu pasahitza:");
			pasahitza = sc.next();
			if (!pasahitza.equals(ph)) {
				System.out.println("ERROR, pasahitza ez da hori.");
			}
		}while (!pasahitza.equals(ph));
		
		System.out.println("Sartu adina:");
		adina = sc.nextInt();
		if (adina<18) {
			System.out.println("Ezin zara sisteman sartu.");
			System.exit(0);
		} else {
			System.out.println("Ongi etorri "+izena+" programara.");
			
			do {
			System.out.println("1- Zenbakiak gehitu.");
			System.out.println("2- A letra dagoen konprobatu.");
			System.out.println("3- Irten.");
			System.out.println("Zer egin nahi duzu?");
			aukera = sc.nextInt();
			
			switch (aukera){
				case 1:
					System.out.println("**Zenbakiak gehitu**");
					do {
						System.out.println("Sartu zenbaki bat:");
						a = sc.nextInt();
						System.out.println("Sartu beste zenbaki bat:");
						b = sc.nextInt();
						System.out.println("Guztira: "+(a+b));
						if ((a+b)<0) {
							System.out.println("Erantzuna ezin da negatiboa izan.");
						}
					} while ((a+b)<0);
					
					do {
						System.out.println("Programatik iren nahi duzu? BAI/EZ");
						System.out.println("BAI ala EZ bakarrik idatzi.");
						be = sc.next();
						be = be.toLowerCase();
						if (be.equals(bai)) {
							System.exit(0);
						} else if (be.equals(ez)) {
							exit--;
						}
					} while (exit==1);
				break;
				
				case 2:
					System.out.println("**A letra dagoen konprobatu**");
					System.out.println("Sartu hitz bat:");
					hitza = sc.next();
					hitza.equalsIgnoreCase(hitza);
					
					if (hitza.contains("a")) {
						System.out.println("Hitzak A du.");
						for (int i=0;i<5;i++) {
						System.out.print(hitza+" / ");
					}
					}
					else {
						System.out.println("Hitzak ez du A.");
					}
					
					
					do {
						System.out.println("Programatik iren nahi duzu? BAI/EZ");
						System.out.println("BAI ala EZ bakarrik idatzi.");
						be = sc.next();
						be = be.toLowerCase();
						if (be.equals(bai)) {
							System.exit(0);
						} else if (be.equals(ez)) {
							exit--;
						}
					} while (exit==1);
				break;
					
				case 3:
					System.out.println("**Irten**");
					System.out.println("Gero arte "+izena);
					System.exit(0);
				break;
			} 
			
			} while (be.equals(ez));
		}
	}

}
