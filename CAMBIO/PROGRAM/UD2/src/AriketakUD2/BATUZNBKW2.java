package AriketakUD2;

import java.util.Scanner;

public class BATUZNBKW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int a,batuketa=0;
		
		System.out.println("Sartu zenbaki bat:");
		a = sc.nextInt();
		
		for (int i=0; i<=a; i++) {
			batuketa = batuketa+i;	
		}
		System.out.println(batuketa);
	}

}
