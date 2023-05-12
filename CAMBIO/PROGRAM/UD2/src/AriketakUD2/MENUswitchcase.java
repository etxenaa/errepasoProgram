package AriketakUD2;

import java.util.Scanner;

public class MENUswitchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,aukera;
		
		System.out.println("Esan zenbaki bat");
		a = sc.nextInt();
		System.out.println("Esan beste zenbaki bat");
		b = sc.nextInt();
		
		System.out.println("1- Batu");
		System.out.println("2- Kendu");
		System.out.println("3- Biderkatu");
		System.out.println("4- Zatitu");
		System.out.println("5- Ondarra");
		System.out.println("0- Irten");
		System.out.println("Aukeratu zer egin nahi duzun.");
		aukera = sc.nextInt();
		
		switch (aukera) {
			case 1:System.out.println(a+" eta "+b+"ren batuketa "+(a+b)+" da.");
			break;
			case 2:System.out.println(a+" eta "+b+"ren kenketa "+(a-b)+" da.");
			break;
			case 3:System.out.println(a+" eta "+b+"ren biderketa "+(a*b)+" da.");
			break;
			case 4:System.out.println(a+" eta "+b+"ren zatiketa "+(a/b)+" da.");
			break;
			case 5:System.out.println(a+" eta "+b+"ren ondarra "+(a%b)+" da.");
			break;
			case 0:System.exit(0);
			break;
			
			default:System.out.println("Aukera hau ez da existitzen.");
			
		}
		
		
	}

}
