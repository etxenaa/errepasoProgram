package AriketakUD6;

import java.util.ArrayList;
import java.util.Scanner;
import  java.util.Iterator;

public class ArrayListAdib {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		//ArrayList
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		
		//isEmpty
		if (arrayListInteger.isEmpty()) {
			System.out.println("Hutsik dago");
		}
		else {
			System.out.println("Ez dago hutsik");
		}
		
		//datuak gehitzeko
		arrayListInteger.add(1);
		arrayListInteger.add(2);
		arrayListInteger.add(3);
		arrayListInteger.add(0,4);
		
		
		for (int znbk : arrayListInteger) {
			System.out.println(znbk);
		}
		
		//iterator
		Iterator<Integer> it = arrayListInteger.iterator();
		
		//hasNext
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		//--------------------------------------------
		
		
		//isEmpty
		if (arrayListInteger.isEmpty()) {
			System.out.println("Hutsik dago");
		}
		else {
			System.out.println("Ez dago hutsik");
		}
		
		//zenbat datu daude
		System.out.println(arrayListInteger.size());
		
		//arraya erakutsi
		for (int i = 0; i < arrayListInteger.size(); i++) {
			System.out.print(arrayListInteger.get(i) + " ");
		}
		
		System.out.println();
		
		//datu bat aldatu (posizioa, balioa)
		arrayListInteger.set(2,6);
		
		//arraya erakutsi
		for (int i = 0; i < arrayListInteger.size(); i++) {
			System.out.print(arrayListInteger.get(i) + " ");
		}
		
		System.out.println();
		
		//contains balio bat arrayean dagoen konprobatzen du
		System.out.println("Esan zenbaki bat");
		a = sc.nextInt();
		if (arrayListInteger.contains(a)) {
			System.out.println("Badago " + a);
		}
		else {
			System.out.println("Ez dago " + a);
		}
		
		System.out.println();
		
		//indexOf balio bat arrayaren ze posizioaten dagoen adierazten du
		System.out.println("Esan zenbaki bat");
		a = sc.nextInt();
		if (arrayListInteger.indexOf(a)==-1) {
			System.out.println("Ez dago " + a);
		}
		else {
			System.out.println("Badago " + a + " " + arrayListInteger.indexOf(a) + " posizioan.");
		}
		
		//remove
		arrayListInteger.remove(1);
		
		//enseñar el arraylist
		System.out.println();
		System.out.println(arrayListInteger);
		
		//aldatu arraylist-etik arrayera
		Object[] array = arrayListInteger.toArray();
		
		//clear
		arrayListInteger.clear();
		
		//isEmpty
		if (arrayListInteger.isEmpty()) {
			System.out.println("Hutsik dago");
		}
		else {
			System.out.println("Ez dago hutsik");
		}
		
		//enseñar el arraylist
		System.out.println();
		System.out.println(arrayListInteger);
		
		for (int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
