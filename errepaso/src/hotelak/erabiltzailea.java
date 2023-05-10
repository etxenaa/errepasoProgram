package hotelak;

import java.io.Serializable;
import java.util.Scanner;

public class erabiltzailea extends pertsona implements Serializable {
	private int mota;

	public erabiltzailea() {
		super();
		this.mota = 0;
	}

	public erabiltzailea(String d, String i, String p, int t) {
		super(d, i, p);
		this.mota = t;
	}

	public int getTipo() {
		return mota;
	}

	public void setTipo(int tipo) {
		this.mota = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + mota;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		erabiltzailea other = (erabiltzailea) obj;
		if (mota != other.mota)
			return false;
		return true;
	}

	@Override
	public void pantailaratu() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("DNI: " + this.dni);
		System.out.println("Izena: " + this.izena);
		System.out.println("Pasahitza: " + this.pasahitza);
		System.out.println("Mota: " + this.mota);
		System.out.println("");

	}

	public void irakurri(Scanner sc) {
		System.out.println("");
		do {
			System.out.println("Sartu DNI: ");
			this.dni = sc.next();
			
			if(this.dni.length()!=9) {
				System.out.println("9 karaktere izan behar ditu");
			}
		} while (this.dni.length() != 9);
		System.out.println("Sartu izena: ");
		this.izena = sc.next();
		System.out.println("Sartu pasahitza: ");
		this.pasahitza = sc.next();
		do{
			System.out.println("Sartu mota: ");
			this.mota = sc.nextInt();
			
			if(this.mota<0 || this.mota>2) {
				System.out.println("0, 1 edo 2 izan behar da");
			}
		}while(this.mota<0 || this.mota>2);
		System.out.println("");
	}

	public void irakurrilogin(Scanner sc) {
		System.out.println("Sartu zure DNI: ");
		this.dni = sc.next();
		System.out.println("Sartu pasahitza");
		this.pasahitza = sc.next();
	}

}
