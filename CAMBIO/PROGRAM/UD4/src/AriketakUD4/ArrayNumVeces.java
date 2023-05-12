package AriketakUD4;

import java.util.Scanner;

public class ArrayNumVeces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int [] c = new int[10];
		int [] b = new int[10];
		int z;
		
		for (int i=0;i<c.length;i++) {
			System.out.println("Sartu arrayaren "+i+" balorea:");
			z = sc.nextInt();
			while (c[i]>9 || c[i]<0) {
				System.out.println("0tik 9ra bakarrik");
				System.out.println("Sartu arrayaren "+i+" balorea:");
				z = sc.nextInt();
			}
			c[i]=z;
			b[z]=b[z]+1;
		}
		for (int i=0;i<b.length;i++) {
			System.out.println(i+" zenbakia "+b[i]+" aldiz agertu da.");
		}
		
	}

}
