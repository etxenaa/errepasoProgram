package AriketakUD2;

import java.util.Scanner;

public class SOLDATARET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Esan zure soldata");
		a = sc.nextInt();
		
		if (a<1000)
		{
			System.out.println("Erretentzioa %10koa da.");
		}
		
		else if (a==1000)
		{
			System.out.println("Erretentzioa %12koa da.");	
		}

		else 
		{
			System.out.println("Erretentzioa %14koa da.");
		}
	}
}
