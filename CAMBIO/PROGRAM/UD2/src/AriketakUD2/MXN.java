package AriketakUD2;

import java.util.Scanner;

public class MXN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, karradura;
		
		System.out.println("Sartu zenbaki bat:");
		a = sc.nextInt();
		
		karradura = (a*a);
		
		System.out.println("Zenbaki horren karradura "+karradura+" da.");
		
		if (karradura>=100) {
			System.out.println("**************************");
			System.out.println((karradura-100));
		}
		else {
			System.out.println("**************************");
			System.out.println((100-karradura));
		}
	}

}
