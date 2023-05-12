package AriketakUD2;

import java.util.Scanner;

public class AURKEZTUBIKBW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("Esan zenbaki bat");
		i = sc.nextInt();
		
		while (i>=0) {
			if (i%2==0) {
			System.out.println(i);
			}
			i--;
			
		}
	}

}
