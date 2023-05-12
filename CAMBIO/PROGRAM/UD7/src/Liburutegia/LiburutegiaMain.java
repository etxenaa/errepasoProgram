package Liburutegia;

import java.util.ArrayList;
import java.util.Scanner;

public class LiburutegiaMain {

	public static int publicacionesAnterioresA(ArrayList<Liburutegia> lista, int urtea) {
		int i = 0;
		for (Liburutegia l : lista) {
			if (l.getUrtea() < urtea) {
				i++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Liburutegia> a = new ArrayList<Liburutegia>();
		ArrayList<Liburua> b = new ArrayList<Liburua>();
		
		Liburua li1;
		
		Liburutegia l1 = new Liburua(23,"La parcela",2021,false);
		a.add(l1);
		Liburutegia l2 = new Liburua(67,"Los siete maridos de evelyn hugo",2017,true);
		a.add(l2);
		Liburutegia l3 = new Aldizkaria(998,"Playboy",2007,54);
		a.add(l3);
		Liburutegia l4 = new Aldizkaria(423,"Whatsapp 2",2043,1);
		a.add(l4);
		
		Scanner sc = new Scanner(System.in);
		int urtea, zenbat=0;
		
		
		System.out.println("Zein da konprobatu nahi duzun urtea?");
		urtea=sc.nextInt();
		
		System.out.println(publicacionesAnterioresA(a, urtea));
		
		
		
		for (int i=0;i<2;i++) {
			li1 = new Liburua();
			li1.irakurri(sc);
			b.add(li1);
		}
		
		for (Liburua l : b) {
			if (l.mailegatuta()) {
				zenbat++;
			}
		}
		
		System.out.println(zenbat + " liburu maileguan utzi dira.");
	}

}
