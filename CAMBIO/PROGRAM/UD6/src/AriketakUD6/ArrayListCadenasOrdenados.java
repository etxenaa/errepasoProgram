package AriketakUD6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListCadenasOrdenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> a = new ArrayList<String>();
		
		String hitza;
		System.out.println("Sartu hitz bat:");
		hitza=sc.nextLine();
		
		while (!hitza.equals("")) {
			a.add(hitza);
			System.out.println("Sartu hitz bat:");
			sc.reset();
			hitza=sc.nextLine();
		}
		
		for (String i : a) {
			System.out.println(i);
		}
		
		System.out.println("Txikitik handira");
		Collections.sort(a);
		for (String i : a) {
			System.out.println(i);
		}
		
		System.out.println("Handitik txikira");
		Comparator<String> comparador = Collections.reverseOrder();
		Collections.sort(a, comparador);
		for (String i : a) {
			System.out.println(i);
		}
	}

}
