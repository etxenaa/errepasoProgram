package AriketakUD2;

import java.util.Scanner;

public class MENU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a,b,erantzuna;
		
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
		erantzuna = sc.nextInt();
				
		if (erantzuna==1) {
			System.out.println(a+" eta "+b+"ren batuketa "+(a+b)+" da.");
		}
		else if (erantzuna==2) {
			System.out.println(a+" eta "+b+"ren kenketa "+(a-b)+" da.");
		}
		else if (erantzuna==3) {
			System.out.println(a+" eta "+b+"ren biderketa "+(a*b)+" da.");
		}
		else if (erantzuna==4) {
			System.out.println(a+" eta "+b+"ren zatiketa "+(a/b)+" da.");
		}
		else if (erantzuna==5) {
			System.out.println(a+" eta "+b+"ren ondarra "+(a%b)+" da.");
		}
		else if (erantzuna==0){
			System.out.println("Eskerrikasko, agur.");
		}
		else {
			System.out.println("Aukera hori ez da existetzen.");
		}
	}

}
