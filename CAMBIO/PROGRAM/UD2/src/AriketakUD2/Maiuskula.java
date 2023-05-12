package AriketakUD2;

import java.util.Scanner;

public class Maiuskula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String izena;
		
		System.out.println("Zein da zure izena?");
		izena = sc.next();
		
		izena = izena.toUpperCase();
		
		System.out.println("Zure izena "+izena+" da.");
	}

}
