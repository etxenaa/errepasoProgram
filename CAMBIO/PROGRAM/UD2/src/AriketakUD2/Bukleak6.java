package AriketakUD2;

import java.util.Scanner;

public class Bukleak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double nota1,nota2,nota3,bb;
		int suspenso=0,gainditu=0;
		
		
		System.out.println("Esan zure hiru nota:");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		while (nota1<0 || nota2<0 || nota3<0) {
			System.out.println("ERROR, nota ezin da negatiboa izan!");
			System.out.println("Esan zure notak:");
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
		}
		
		if (nota1>=5) {
			gainditu++;
		}else {
			suspenso++;
		}
		
		if (nota2>=5) {
			gainditu++;
		}else {
			suspenso++;
		}
		
		if (nota3>=5) {
			gainditu++;
		}else {
			suspenso++;
		}
		
		bb=(nota1+nota2+nota2+nota3)/3;
		
		System.out.println(suspenso+" suspenso eta "+gainditu+" gainditu dituzu");
		System.out.println("Eta zure bataz bestekoa "+bb+" da.");
		}
		/*if (nota1<5 && nota2<5 && nota3<5) {
			suspenso=3;
		} else if (nota1>=5 && nota2<5 && nota3<5){
			gainditu=1;
			suspenso=2;
		} else if (nota1>=5 && nota2>=5 && nota3<5){
			gainditu=2;
			suspenso=1;
		} else if (nota1>=5 && nota2>=5 && nota3>=5){
			gainditu=3;
		} else if (nota1<5 && nota2>=5 && nota3<5){
			gainditu=1;
			suspenso=2;
		} else if (nota1<5 && nota2<5 && nota3>=5){
			gainditu=1;
			suspenso=2;
		} else if (nota1>=5 && nota2<5 && nota3>=5){
			gainditu=2;
			suspenso=1;
		}
		*/
	

}
