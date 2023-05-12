package AriketakUD7;

import java.util.ArrayList;
import java.util.Scanner;

import Pertsona.Ikaslea;
import Pertsona.Pertsona;

public class FrogaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		//constructores
		Pertsona p1 = new Pertsona("1111111A","Ernesto","Perez");
		System.out.println(p1);
		
		
		Ikaslea i1 = new Ikaslea("22222B","Laura","Fernandez",10);
		System.out.println(i1);
		
		
		Ikaslea i2 = new Ikaslea();
		i2.irakurri(sc);
		System.out.println(i2);
		
		
		//arraylist
		ArrayList<Ikaslea> a = new ArrayList<Ikaslea>();
		
		Ikaslea i3;
		
		for (int i=0;i<3;i++) {
			i3 = new Ikaslea();
			System.out.println("Sartu ikaslea:");
			i3.irakurri(sc);
			a.add(i3);
		}
		
		for (Ikaslea kont : a) {
			System.out.println(kont);
		}
		
		
		//array
		Ikaslea [] c = new Ikaslea[3];
		
		for (int i=0;i<c.length;i++) {
			Ikaslea i4 = new Ikaslea();
			System.out.println("Sartu ikaslea:");
			i4.irakurri(sc);
			c[i]=i4;
		}
		
		for (Ikaslea kont : c) {
			System.out.println(kont);
		}
	}

}
