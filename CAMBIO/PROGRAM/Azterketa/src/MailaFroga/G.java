package MailaFroga;
import java.util.Scanner;
public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teklatua=new Scanner (System.in);
		
		int adina,aukera;
		String izena,abizena;
		
		System.out.println("Sartu zure izena");
		izena=teklatua.next();
		System.out.println("Sartu zure abizena");
		abizena=teklatua.next();
		System.out.println("Sartu zure adina");
		adina=teklatua.nextInt();
		
		if (adina<=12) {
			System.out.println("Ezin sara sartu sisteman");
			System.exit(0);
		}
		else {
			System.out.println("Ongi etorri");
		}
		
		System.out.println("Ongi etorri "+ izena+ "" + abizena + " frutadendara.");
		System.out.println("1- Erosketa berria egin");
		System.out.println("2- Fruta dagoen konprobatu");
		System.out.println("3- Fruta sartu");
		System.out.println("4- Irten");
		System.out.println("Zer egin nahi duzu?");
		aukera=teklatua.nextInt();
		
		
		switch (aukera)  {
		
		case 1: System.out.println("**Erosketa egin**");
		
			int a,b,c,batuketa;
		
				System.out.println("Sartu lehen produktuaren prezioa");
				a=teklatua.nextInt();
				while (a<0) {
					System.out.println("ERROR, sartu berriro");
					a=teklatua.nextInt();
				}
				
				System.out.println("Sartu bigarren produktuaren prezioa");
				b=teklatua.nextInt();
				while (b<0) {
					System.out.println("ERROR, sartu berriro");	
					b=teklatua.nextInt();
				}
				
				System.out.println("Sartu hirugarren produktuaren prezioa");
				c=teklatua.nextInt();
				while (c<0) {
					System.out.println("ERROR, sartu berriro");
					c=teklatua.nextInt();
				}
		
				batuketa = (a+b+c);
				
				System.out.println("Guztira: "+batuketa);
				break;
				
		case 2: 
				System.out.println("**Fruta dagoen konprobatu**");
				
				String sagarra,marrubia;
			
				System.out.println("Sartu fruta baten izena");
				sagarra=teklatua.next();
				marrubia=teklatua.next();
				sagarra=sagarra.toLowerCase();
				marrubia=marrubia.toLowerCase();
				
				if (sagarra.equals(sagarra)) {
					System.out.println("Fruta hori badaukagu");
				}
				else {
					System.out.println("Fruta hori ez daukagu");
				}				
				break;
				
		case 3: System.out.println("**Fruta sartu**");
		
				String pasahitza,frutaizena,pasahitzaondo="abc";
				int d=3;
				
				System.out.println("Ekintza hau egiteko administratzailea izan behar zara. Sartu pasahitza: ");
				pasahitza=teklatua.next();
				
				while (pasahitza.equals(pasahitzaondo)) {
					System.out.println("Sartu frutaren izena");
					frutaizena=teklatua.next();
					
					for (int i=0;i<d;i++) {
						System.out.println(frutaizena + " gorde da.");
					}
				}
				break;
				
		case 4: System.out.println("Gero arte " + izena);
				System.exit(0);
				break;
		}
		
		
		
		
		
	}

}