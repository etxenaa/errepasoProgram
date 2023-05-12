package AriketakUD2;

import java.util.Scanner;

public class ARTIKULUAK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kodea,kantitatea;
		double prezioa;
		
		System.out.println("Esan kodea");
		kodea = sc.nextInt();
		
		System.out.println("Esan prezioa");
		prezioa = sc.nextDouble();
		
		System.out.println("Esan kantitatea");
		kantitatea = sc.nextInt();
		
		if (kantitatea>100)
		{
			System.out.println("Zure deskontua %40koa da, alea "+((prezioa-prezioa*0.4)*kantitatea)+"€tan gelditzen zaizu.");
		}
		
		else if (25<kantitatea&kantitatea<=100)
		{
			System.out.println("Zure deskontua %20koa da, alea "+((prezioa-prezioa*0.2)*kantitatea)+"€tan gelditzen zaizu.");
		}
		
		else if (10<kantitatea&kantitatea<=25)
		{
			System.out.println("Zure deskontua %10koa da, alea "+((prezioa-prezioa*0.1)*kantitatea)+"€tan gelditzen zaizu.");
		}
		
		else
		{
			System.out.println("Zure deskontua %0koa da, alea "+prezioa+"€tan gelditzen zaizu.");
		}
	}

}
