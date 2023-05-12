package azterketa1;

import java.util.Scanner;

public class Azterketa1Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String erabiltzailea,pasahitza,le="leire",an="antonio",ab="abcd",ef="efgh",be="";
		int aukera,p,f;
		
		System.out.println("Sartu erabiltzailea:");
		erabiltzailea = sc.next();
		erabiltzailea.toLowerCase();

		System.out.println("Sartu pasahitza:");
		pasahitza = sc.next();
		pasahitza.toLowerCase();
			
		while ((!pasahitza.equals(ab) && !pasahitza.equals(ef) || !erabiltzailea.equals(le) && !erabiltzailea.equals(an)) || (erabiltzailea.equals(le) && pasahitza.equals(ef)) || (erabiltzailea.equals(an) && pasahitza.equals(ab))) {
			System.out.println("ERROR, erabiltzailea edo pasahitza ez da egokia.");
			System.out.println("Sartu berriro mesedez:");
				
			System.out.println("Sartu erabiltzailea:");
			erabiltzailea = sc.next();

			System.out.println("Sartu pasahitza:");
			pasahitza = sc.next();
		}
		
		erabiltzailea.toUpperCase();
		System.out.println("Ongi etorri "+erabiltzailea+" zer egin nahi duzu?");
		
		do {
			System.out.println("1- Piramidea sortu");
			System.out.println("2- Fibonacci segida bistaratu");
			aukera = sc.nextInt();
			
			while (aukera!=1 && aukera!=2) {
				System.out.println("ERROR! Aukera 1 edo 2 izan behar da. Sartu berriro:");
				System.out.println("1- Piramidea sortu");
				System.out.println("2- Fibonacci segida bistaratu");
				aukera = sc.nextInt();
			}
			
			switch (aukera){
			
				case 1:
					
					do {
					System.out.print("Sartu lerro kopuru bakoitia:");
					p = sc.nextInt();
					} while (p%2==0);
					
					System.out.println();
			        for(int altura = 1; altura<=(p/2); altura++){
			            //Espacios en blanco
			            for(int asteriscos = 0; asteriscos<altura; asteriscos++){
			                System.out.print("*");
			            }
			            System.out.println();
			        }
			        for(int altura = (p/2)+1; altura>0; altura--){
			            //Espacios en blanco
			            for(int asteriscos = 0; asteriscos<altura; asteriscos++){
			                System.out.print("*");
			            }
			            System.out.println();
					}
			        System.out.println();
			        
				break;
				
				
				case 2:
					
					do {
						System.out.print("Fibonacci segidaren zenbat zenbaki bistaratu nahi dituzu?");
						f = sc.nextInt();
					} while (1>f);
					
					System.out.println("Fibonacci seguidaren lehenengo " + f + " zenbakiak hauek dira: ");                 

			        int fibo1=1;
			        int fibo2=1;

			        System.out.print(fibo1 + " ");
			        
			        for(int i=2;i<=f;i++) {
			      
			            System.out.print(fibo2 + " ");
			            fibo2 = fibo1 + fibo2;
			            fibo1 = fibo2 - fibo1;
			        }
					System.out.println();
					
				break;
			}
			
			System.out.println("Programatik iren nahi duzu? BAI/EZ");
					be = sc.next();
					be = be.toLowerCase();
					if (be.equals("bai")) {
						System.out.println("Eskerrikasko. Agur!!!!");
					}
					
					while (!be.equals("ez") && !be.equals("bai")) {
						System.out.println("BAI ala EZ bakarrik idatzi!");
						System.out.println("Programatik iren nahi duzu? BAI/EZ");
						be = sc.next();
						be = be.toLowerCase();
						if (be.equals("bai")) {
							System.out.println("Eskerrikasko. Agur!!!!");
						}
					}
					if (be.equals("bai")) {
						System.exit(0);
					}
			
		} while (be.equals("ez"));

	}
			
}


