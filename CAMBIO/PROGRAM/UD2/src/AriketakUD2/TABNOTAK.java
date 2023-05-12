package AriketakUD2;

import java.util.Scanner;

public class TABNOTAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Esan zure notaren zenbakia");
		a = sc.nextInt();
		
		if (9<=a&a<=10)
		{
			System.out.println("BIKAIN");
		}
		
		else if (7<=a&a<=9)
		{
			System.out.println("OSO ONGI");
		}
		
		else if (6<=a&a<=7)
		{
			System.out.println("ONDO");
		}
		
		else if (5<=a&a<=6)
		{
			System.out.println("NAHIKO");
		}
		
		else if (3<=a&a<=5)
		{
			System.out.println("GUTXI");	
		}
		
		else
		{
			System.out.println("OSO GUTXI");
		}
		
	}

}
