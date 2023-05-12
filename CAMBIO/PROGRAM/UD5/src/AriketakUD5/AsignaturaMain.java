package AriketakUD5;

import java.util.Scanner;

public class AsignaturaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Asignatura p1 = new Asignatura();
		Asignatura p2 = new Asignatura("PG","Program azterketa",9.6);
		Asignatura p3 = new Asignatura(p2);
		
		
		System.out.println(p1);
	}

}
