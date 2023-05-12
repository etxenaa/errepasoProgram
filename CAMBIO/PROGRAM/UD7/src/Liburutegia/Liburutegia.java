package Liburutegia;

import java.util.Scanner;

public class Liburutegia {
	
	private int kodea;
	private String izenburua;
	private int urtea;
	
	
	public Liburutegia() {
		this.kodea=0;
		this.izenburua="";
		this.urtea=0;
	}
	
	public Liburutegia(int k, String i, int u) {
		this.kodea=k;
		this.izenburua=i;
		this.urtea=u;
	}
	
	public Liburutegia(Liburutegia li) {
		this.kodea=li.kodea;
		this.izenburua=li.izenburua;
		this.urtea=li.urtea;
	}

	public int getKodea() {
		return kodea;
	}

	public void setKodea(int kodea) {
		this.kodea = kodea;
	}

	public String getIzenburua() {
		return izenburua;
	}

	public void setIzenburua(String izenburua) {
		this.izenburua = izenburua;
	}

	public int getUrtea() {
		return urtea;
	}

	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}

	@Override
	public String toString() {
		return "Liburutegia [kodea=" + kodea + ", izenburua=" + izenburua + ", urtea=" + urtea + "]";
	}
	
	public void irakurri(Scanner sc) {
		System.out.println("Sartu kodea: ");
		this.kodea=sc.nextInt();
		System.out.println("Sartu izenburua: ");
		this.izenburua=sc.next();
		System.out.println("Sartu urtea: ");
		this.urtea=sc.nextInt();
	}
	
}
