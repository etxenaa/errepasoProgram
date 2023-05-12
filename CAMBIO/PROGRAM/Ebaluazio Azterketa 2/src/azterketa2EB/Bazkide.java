package azterketa2EB;

import java.util.ArrayList;
import java.util.Scanner;

public class Bazkide {

	private String dni;
	private String izena;
	private String abizena;
	private int adina;
	private ArrayList<Publikazioa> aPublikazioa;

	public Bazkide() {
		this.dni = "";
		this.izena = "";
		this.abizena = "";
		this.adina = 0;
		this.aPublikazioa = new ArrayList<Publikazioa>();
	}

	public Bazkide(String d, String i, String a, int ad, ArrayList<Publikazioa> ap) {
		this.dni = d;
		this.izena = i;
		this.abizena = a;
		this.adina = ad;
		this.aPublikazioa = ap;
	}
	
	public Bazkide(String d, String i, String a, int ad) {
		this.dni = d;
		this.izena = i;
		this.abizena = a;
		this.adina = ad;
		this.aPublikazioa = new ArrayList<Publikazioa>();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public ArrayList<Publikazioa> getaPublikazioa() {
		return aPublikazioa;
	}

	public void setaPublikazioa(ArrayList<Publikazioa> aPublikazioa) {
		this.aPublikazioa = aPublikazioa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aPublikazioa == null) ? 0 : aPublikazioa.hashCode());
		result = prime * result + ((abizena == null) ? 0 : abizena.hashCode());
		result = prime * result + adina;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bazkide other = (Bazkide) obj;
		if (aPublikazioa == null) {
			if (other.aPublikazioa != null)
				return false;
		} else if (!aPublikazioa.equals(other.aPublikazioa))
			return false;
		if (abizena == null) {
			if (other.abizena != null)
				return false;
		} else if (!abizena.equals(other.abizena))
			return false;
		if (adina != other.adina)
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		return true;
	}
	
	public void irakurri(Scanner sc) {
		System.out.println("Bazkide hori ez dago gure datu basean, sartu zure datuak mesedez.");
		System.out.println("Zein da zure NAN zenbakia?");
		this.dni = sc.next();
		System.out.println("Zein da zure izena?");
		this.izena = sc.next();
		System.out.println("Zein da zure abizena?");
		this.abizena = sc.next();
		System.out.println("Zein da zure adina?");
		this.adina = sc.nextInt();
		while (this.adina < 0) {
			System.out.println("Ezin dituzu 0 baino urte gutxiago izan. Zein da zure adina?");
			this.adina = sc.nextInt();
		}
	}
	
	public void publikazioaGehitu(Publikazioa p) {
		aPublikazioa.add(p);
	}
	
	public void print() {
		System.out.println("**************************************");
		System.out.println("** Bazkidearen NANa: " + this.dni);
		System.out.println("** Bazkidearen izena: " + this.izena);
		System.out.println("** Bazkidearen abizena: " + this.abizena);
		System.out.println("** Bazkidearen adina: " + this.adina);
		System.out.println("**************************************");
		for (Publikazioa kont : aPublikazioa) {
			System.out.println(kont);
		}
	}
	
	@Override
	public String toString() {
		return "Bazkide [dni=" + dni + ", izena=" + izena + ", abizena=" + abizena + ", adina=" + adina+ ", aPublikazioa=" + aPublikazioa + "]";
	}
	
	

}
