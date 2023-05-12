package hasierakoariketak;

import java.util.Scanner;

public class AreaKalkulatu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,e,f;
		
		
		System.out.println("ZIRKULUA");
		System.out.println("Sartu erradioaren balioa");
		a = sc.nextInt();
		System.out.println("Zirkuluaren area "+(a*a*3.14)+" m2 da.");
		System.out.println("**************************************");
		
		System.out.println("LAUKIA");
		System.out.println("Sartu aldearen balioa ");
		b = sc.nextInt();
		System.out.println("Laukiaren area "+(b*b)+" m2 da.");
		System.out.println("**************************************");
		
		System.out.println("LAUKIZUZENA");
		System.out.println("Sartu alde luzearen balioa");
		c = sc.nextInt();
		System.out.println("Sartu alde laburraren balioa");
		d = sc.nextInt();
		System.out.println("Laukizuzenaren area "+(c*d)+" m2 da.");
		System.out.println("**************************************");
		
		System.out.println("TRIANGELUA");
		System.out.println("Sartu oinarriaren balioa");
		e = sc.nextInt();
		System.out.println("Sartu altueraren balioa");
		f = sc.nextInt();
		System.out.println("Triangeluaren area "+(e*f/2)+" m2 da.");
		System.out.println("**************************************");
	}

}
