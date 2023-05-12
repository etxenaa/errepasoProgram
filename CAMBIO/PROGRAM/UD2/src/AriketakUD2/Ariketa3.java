package AriketakUD2;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.println("Sartu zenbaki oso bat:");
		a = sc.nextInt();
		
		System.out.println("Sartu beste zenbaki bat:");
		b = sc.nextInt();
		
		if (a<b){
			System.out.println(b+" zenbakia "+a+" baino handiagoa da.");
		}
		else if (a==b) {
			System.out.println(a+" eta "+b+" berdinak dira.");
		}
		else {
			System.out.println(a+" zenbakia "+b+" baino handiagoa da.");
		}
	}

}
