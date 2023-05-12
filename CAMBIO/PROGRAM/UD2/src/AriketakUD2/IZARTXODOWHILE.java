package AriketakUD2;

import java.util.Scanner;

public class IZARTXODOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,i=0;
		
		System.out.println("Sartu zenbaki bat:");
		a = sc.nextInt();
		
		do {
			System.out.print("*");
			a--;
		} while (i<a);
	}

}
