package AriketakUD2;

import java.util.Scanner;

public class MENUAEGUNAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String aukera;
		
		System.out.println("AL- Astelehena");
		System.out.println("AA- Asteartea");
		System.out.println("AZ- Azteazkena");
		System.out.println("OG- Osteguna");
		System.out.println("OL- Ostirala");
		System.out.println("LA- Larunbata");
		System.out.println("IG- Igandea");
		System.out.println("Aukeratu bat");
		aukera = sc.next();
		
		
		
		switch (aukera) {
			case "AL":System.out.println("Astelehena");
			break;
			case "AA":System.out.println("Asteartea");
			break;
			case "AZ":System.out.println("Azteazkena");
			break;
			case "OG":System.out.println("Osteguna");
			break;
			case "OL":System.out.println("Ostirala");
			break;
			case "LA":System.out.println("Larunbata");
			break;
			case "IG":System.out.println("Igandea");
			break;
			
			default:System.out.println("Aukera hau ez da existitzen.");
		}
	}

}
