package AriketakUD2;

import java.util.Scanner;

public class Bukleak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,faktoriala=1;
		
		System.out.println("Sartu zenbaki bat:");
		a = sc.nextInt();
		while (a<0) {
			System.out.println("Sartu zenbaki bat:");
			a = sc.nextInt();
		}
		
		for (int i=1; i<=a;i++) {
			faktoriala = i*faktoriala;	
		}
		System.out.println(faktoriala);
	}

}
