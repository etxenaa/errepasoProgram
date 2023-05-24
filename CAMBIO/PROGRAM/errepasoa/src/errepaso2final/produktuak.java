package errepaso2final;

import java.util.Scanner;

public abstract class produktuak {
	protected int kod;
	protected String izena;
	protected int stock;
	protected String kolorea;
	protected int prezioa;
	
	public produktuak() {
		this.kod=0;
		this.izena="";
		this.stock=0;
		this.kolorea="";
		this.prezioa=0;
	}

	public produktuak(int kod, String izena, int stock, String kolorea, int prezioa) {
		super();
		this.kod = kod;
		this.izena = izena;
		this.stock = stock;
		this.kolorea = kolorea;
		this.prezioa = prezioa;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getKolorea() {
		return kolorea;
	}

	public void setKolorea(String kolorea) {
		this.kolorea = kolorea;
	}

	public int getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(int prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + kod;
		result = prime * result + ((kolorea == null) ? 0 : kolorea.hashCode());
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
		produktuak other = (produktuak) obj;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (kod != other.kod)
			return false;
		if (kolorea == null) {
			if (other.kolorea != null)
				return false;
		} else if (!kolorea.equals(other.kolorea))
			return false;
		if (prezioa != other.prezioa)
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "produktuak [kod=" + kod + ", izena=" + izena + ", stock=" + stock + ", kolorea=" + kolorea
				+ ", prezioa=" + prezioa + "]";
	}
	
	public abstract void irakurri(Scanner sc);
	
	public void pantailaratu() {
		System.out.println("-------------");
		System.out.println("Kod-->"+this.kod);
		System.out.println("Izena-->"+this.izena);
		System.out.println("Stocka-->"+this.stock);
		System.out.println("Kolorea-->"+this.kolorea);
		System.out.println("Prezioa-->"+this.prezioa);
	}
}
