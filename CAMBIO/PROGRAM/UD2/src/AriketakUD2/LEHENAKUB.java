package AriketakUD2;

import java.util.Scanner;

public class LEHENAKUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int zenbakia;
		
		
		do {
			System.out.println("Sartu zenbaki positibo bat:");
			zenbakia = sc.nextInt();
			
		} while (zenbakia<0);
		
		if (zenbakia%2==0) {
			System.out.println(zenbakia*zenbakia*zenbakia);
		}
		else {
			System.out.println(zenbakia*zenbakia);
		}
	}

}
