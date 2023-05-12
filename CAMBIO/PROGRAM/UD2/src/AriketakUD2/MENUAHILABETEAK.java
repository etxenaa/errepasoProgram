package AriketakUD2;

import java.util.Scanner;

public class MENUAHILABETEAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String aukera;
		
		System.out.println("Urtarrila");
		System.out.println("Otsaila");
		System.out.println("Martxoa");
		System.out.println("Apirila");
		System.out.println("Maiatza");
		System.out.println("Ekaina");
		System.out.println("Abuztua");
		System.out.println("Uztaila");
		System.out.println("Iraila");
		System.out.println("Urria");
		System.out.println("Azaroa");
		System.out.println("Abendua");
		System.out.println("Aukeratu bat");
		aukera = sc.next();
		
		aukera = aukera.toLowerCase();
		
		switch (aukera) {
		case "urtarrila":System.out.println("1");
		break;
		case "otsaila":System.out.println("2");
		break;
		case "martxoa":System.out.println("3");
		break;
		case "apirila":System.out.println("4");
		break;
		case "maitza":System.out.println("5");
		break;
		case "ekaina":System.out.println("6");
		break;
		case "abuztua":System.out.println("7");
		break;
		case "uztaila":System.out.println("8");
		break;
		case "iraila":System.out.println("9");
		break;
		case "urria":System.out.println("10");
		break;
		case "azaroa":System.out.println("11");
		break;
		case "abendua":System.out.println("12");
		break;
		
		default:System.out.println("Aukera hau ez da existitzen.");
		}
	}

}
