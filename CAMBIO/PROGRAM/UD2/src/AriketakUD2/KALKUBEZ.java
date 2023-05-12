package AriketakUD2;

import java.util.Scanner;

public class KALKUBEZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Sartu zenbaki bat:");
		a = sc.nextInt();
		
		if (a<=20000) {
			System.out.println("%7ko BEZa izango da.");
		}
		else {
			System.out.println("%16ko BEZa izango da.");
		}
	}

}
