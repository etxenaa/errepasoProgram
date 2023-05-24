package errepaso2final;

import java.io.Serializable;
import java.util.Scanner;

public class fruta implements Serializable{
	private int kod;
	private String izena;
	private int prezioa;
	private int stock;

	public fruta() {
		this.kod = 0;
		this.izena = "";
		this.prezioa = 0;
		this.stock = 0;
	}

	public fruta(int kod, String izena, int prezioa, int stock) {
		this.kod = kod;
		this.izena = izena;
		this.prezioa = prezioa;
		this.stock = stock;
	}

	public int getKod() {
		return kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + kod;
		result = prime * result + prezioa;
		result = prime * result + stock;
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
		fruta other = (fruta) obj;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (kod != other.kod)
			return false;
		if (prezioa != other.prezioa)
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "fruta [kod=" + kod + ", izena=" + izena + ", prezioa=" + prezioa + ", stock=" + stock + "]";
	}

	public void irakurri(Scanner sc) {
		System.out.print("Sartu izena--> ");
		this.izena = sc.next();
		System.out.print("Sartu prezioa--> ");
		this.prezioa = sc.nextInt();
		System.out.print("Sartu stock-a--> ");
		this.stock = sc.nextInt();
	}

	public void pantailaratu() {
		System.out.println("-------------");
		System.out.println("Sartu kod--> " + this.kod);
		System.out.println("Sartu izena--> " + this.izena);
		System.out.println("Sartu prezioa--> " + this.prezioa);
		System.out.println("Sartu stock-a--> " + this.stock);
		System.out.println("-------------");
	}
}
