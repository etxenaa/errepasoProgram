package AriketakUD2;

import java.util.Scanner;

public class NOTABAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Esan zure nota");
		a = sc.nextInt();
		
		if (0<=a&a<=10) {
			System.out.println("Baliagarria da");
		}
		else {
			System.out.println("Ez da baliagarria");
		}
	}

}
