package hotelak;

import java.util.Scanner;

public abstract class pertsona {
	protected String dni;
	protected String izena;
	protected String pasahitza;
	
	public pertsona() {
		this.dni="";
		this.izena="";
		this.pasahitza="";
	}
	
	public pertsona(String d, String i, String p) {
		this.dni=d;
		this.izena=i;
		this.pasahitza=p;
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

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + ((pasahitza == null) ? 0 : pasahitza.hashCode());
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
		pertsona other = (pertsona) obj;
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
		if (pasahitza == null) {
			if (other.pasahitza != null)
				return false;
		} else if (!pasahitza.equals(other.pasahitza))
			return false;
		return true;
	}
	
	public abstract void pantailaratu();
	
	public void irakurri(Scanner sc) {
		do {
		System.out.println("Sartu DNI: ");
		this.dni=sc.next();
		if(dni.length()!=9) {
			System.out.println("9 karaktere izan behar ditu");
		}
		}while(dni.length()!=9);
		System.out.println("Sartu izena: ");
		this.izena=sc.next();
		System.out.println("Sartu pasahitza: ");
		this.pasahitza=sc.next();
	}
}
