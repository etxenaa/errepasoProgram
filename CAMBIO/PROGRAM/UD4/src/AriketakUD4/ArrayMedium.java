package AriketakUD4;

import java.util.Scanner;

public class ArrayMedium {

	public ArrayMedium() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [] c = new int[10];
		
		double total=0;
		
		for (int i=0;i<c.length;i++) {
			System.out.println("Sartu arrayaren "+i+" balorea:");
			c[i] = sc.nextInt();
			total = total+c[i];
		}
		
		System.out.println("Media: "+(total/c.length));
		
		
	}

}
