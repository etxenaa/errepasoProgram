package AriketakUD5;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		
		System.out.println(p1);
		
		
		p1.setNombre("Leire");
		System.out.println(p1);
		System.out.println(p1.getNombre());
		
		Fecha f1 = new Fecha(12,2,1988);
		
		p1.setFechanacimiento(f1);
		System.out.println(p1);
		
		if (p2.equals(p3)) {
			System.out.println("Berdinak dira");
		}
		else {
			System.out.println("Ez dira berdinak");
		}
		
		
		p2.setNombre("Etxena");
		if (p2.equals(p3)) {
			System.out.println("Berdinak dira");
		}
		else {
			System.out.println("Ez dira berdinak");
		}
	}

}
