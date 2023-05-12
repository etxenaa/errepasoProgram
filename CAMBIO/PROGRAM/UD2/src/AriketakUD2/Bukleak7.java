package AriketakUD2;

import java.util.Scanner;

public class Bukleak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int aukera,a,b;
		
		System.out.println("1- Oinarrizko eragiketak");
		System.out.println("2- Eragiketa konplexuak");
		System.out.println("3- Programa amaitu");
		aukera = sc.nextInt();
		
		switch (aukera) {
			case 1: 
				System.out.println("1- Batuketa");
				System.out.println("2- Kenketa ");
				System.out.println("3- Biderketa");
				System.out.println("4- Zatiketa");
				aukera = sc.nextInt();
				
				switch (aukera) {
					case 1:
						System.out.println("Sartu bi zenbaki:");
						a = sc.nextInt();
						b = sc.nextInt();
						
						System.out.println(a+" eta "+b+"ren batuketa "+(a+b)+" da.");
					
					break;
						
					case 2:
						System.out.println("Sartu bi zenbaki:");
						a = sc.nextInt();
						b = sc.nextInt();
						
						System.out.println(a+" eta "+b+"ren kenketa "+(a-b)+" da.");
					
					break;
				
					case 3:
						System.out.println("Sartu bi zenbaki:");
						a = sc.nextInt();
						b = sc.nextInt();
						
						System.out.println(a+" eta "+b+"ren biderketa "+(a*b)+" da.");
					
					break;
			
					case 4:
						System.out.println("Sartu bi zenbaki:");
						a = sc.nextInt();
						b = sc.nextInt();
						
						System.out.println(a+" eta "+b+"ren zatiketa "+(a/b)+" da.");
						
					break;
	
				}
			break;
			
			case 2:
				System.out.println("1- Berreketa");
				System.out.println("2- Erro karratua");
				aukera = sc.nextInt();
				
				switch (aukera) {
					case 1:
						System.out.println("Sartu zenbaki bat:");
						a = sc.nextInt();
						
						System.out.println(a+" ren berreketa"+(a*a)+" da.");
						
					break;
					
					case 2:
						System.out.println("Sartu zenbaki bat:");
						a = sc.nextInt();
						
						System.out.println(a+" ren erro karratua "+Math.sqrt(a)+" da.");
						
					break;
				}
			break;
			
			case 3:
				System.out.println("Eskerrikasko, agur!");
				System.exit(0);
			break;
		}
	}

}
