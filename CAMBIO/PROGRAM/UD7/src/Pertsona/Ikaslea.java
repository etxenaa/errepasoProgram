package Pertsona;

import java.util.Scanner;

public class Ikaslea extends Pertsona {
	
	private double nota;
	
	public Ikaslea() {
		super();
		this.nota=0;
	}
	
	public Ikaslea (String n, String i, String a, double no) {
		super(n,i,a);
		this.nota=no;
	}
	
	public Ikaslea (double no) {
		super();
		this.nota=no;
	}
	
	
	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return super.toString() + "Ikaslea [nota=" + nota + "]";
	}

	public void irakurri(Scanner sc) {
		super.irakurri(sc);
		System.out.print("NOTA: ");
		this.nota = sc.nextDouble();
	}
	
}
