package AriketakUD2;

import java.util.Scanner;

public class BATUZNBKW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int kont=0,i,guztira=0;
		
		System.out.println("Sartu zure zenbakia: ");
		i= sc.nextInt();
		
		while (kont<=i) {
			guztira=guztira+kont;
			kont++;
		}
		System.out.println("Total: "+guztira);
	}

}
