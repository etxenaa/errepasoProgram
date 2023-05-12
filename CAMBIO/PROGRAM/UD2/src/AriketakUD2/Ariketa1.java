package AriketakUD2;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			double a;
			
			System.out.println("Esan zure nota");
			a = sc.nextDouble();
			
			if (a<5)
			{
				System.out.println("Ez duzu gainditu");
			}
			
			else if (a==5)
			{
				System.out.println("Gainditu duzu justu justu");	
			}

			else 
			{
				System.out.println("Zorionak gainditu duzu");
			}
		}
	}
	
}