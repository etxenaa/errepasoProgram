package hasierakoariketak;

import java.util.Scanner;

public class CelsiusConversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a;
		
		
		System.out.println("Sartu temperatura Celsius graduetan");
		a = sc.nextDouble();
		System.out.println("Fahrenheit: "+((a*9/5)+32)+"ºF");
		System.out.println("Kelvin: "+(a+273.15)+"ºK");
	}

}
