package AriketakUD2;

import java.util.Scanner;

public class IZARTXOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,i=0;
		
		System.out.println("Sartu zenbaki bat:");
		a = sc.nextInt();
		
		while (i<a) {
			System.out.print("*");
			a--;
		}
	}

}
