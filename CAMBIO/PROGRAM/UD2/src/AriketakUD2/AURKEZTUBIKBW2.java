package AriketakUD2;

import java.util.Scanner;

public class AURKEZTUBIKBW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i, kont=0;
		
		System.out.println("Esan zenbaki bat");
		i = sc.nextInt();
		
		while (kont<=i) {
			if (kont%2==0) {
				System.out.println(kont);
			}
			kont++;
		}
	}

}
