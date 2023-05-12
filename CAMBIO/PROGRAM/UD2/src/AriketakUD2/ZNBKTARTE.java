package AriketakUD2;

import java.util.Scanner;

public class ZNBKTARTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i,j;
		
		System.out.println("Sartu bi zenbaki:");
		i = sc.nextInt();
		j = sc.nextInt();
		
		if (i==j) {
			System.out.println(i);
		}
		else if (i<j){
			do {
				System.out.println(i);
				i++;
			} while (j>=i);
		}
		else {
			do {
				System.out.println(i);
				i--;
			} while (j<=i);
		}
		
	}

}
