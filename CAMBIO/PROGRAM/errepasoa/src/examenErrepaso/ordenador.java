package examenErrepaso;

import java.util.Scanner;

public class ordenador {
	private int id;
	private String izena;
	private String ezaugarriak;
	private int prezioa;
	private int stock;
	
	public ordenador() {
		this.id = 0;
		this.izena = "";
		this.ezaugarriak = "";
		this.prezioa = 0;
		this.stock = 0;
	}

	public ordenador(int id, String izena, String ezaugarriak, int prezioa, int stock) {
		this.id = id;
		this.izena = izena;
		this.ezaugarriak = ezaugarriak;
		this.prezioa = prezioa;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getEzaugarriak() {
		return ezaugarriak;
	}

	public void setEzaugarriak(String ezaugarriak) {
		this.ezaugarriak = ezaugarriak;
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
		result = prime * result + ((ezaugarriak == null) ? 0 : ezaugarriak.hashCode());
		result = prime * result + id;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
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
		ordenador other = (ordenador) obj;
		if (ezaugarriak == null) {
			if (other.ezaugarriak != null)
				return false;
		} else if (!ezaugarriak.equals(other.ezaugarriak))
			return false;
		if (id != other.id)
			return false;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (prezioa != other.prezioa)
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ordenador [id=" + id + ", izena=" + izena + ", ezaugarriak=" + ezaugarriak + ", prezioa=" + prezioa
				+ ", stock=" + stock + "]";
	}
	
	public void pantailaratu() {
		System.out.println("-----");
		System.out.println("Id--> "+this.id);
		System.out.println("Izena--> "+this.izena);
		System.out.println("Ezaugarriak--> "+this.ezaugarriak);
		System.out.println("Prezioa--> "+this.prezioa);
		System.out.println("Stock--> "+this.stock);
		System.out.println("-----");
	}
	
	public void irakurri(Scanner sc) {
		System.out.println("Zein da ordenagailuaren izena??");
		this.izena=sc.next();
		System.out.println("Zein da ordenagailuaren ezaugarria??");
		this.ezaugarriak=sc.next();
		System.out.println("Zein da ordenagailuaren prezioa??");
		this.prezioa=sc.nextInt();
		System.out.println("Zein da ordenagailuaren stock-a??");
		this.stock=sc.nextInt();
	}
	
	
}
