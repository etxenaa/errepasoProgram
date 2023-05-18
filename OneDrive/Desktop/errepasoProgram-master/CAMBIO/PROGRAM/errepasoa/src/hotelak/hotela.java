package hotelak;

import java.util.Scanner;

public class hotela {
	private int id;
	private String izena;
	private String hiria;
	private String nan_zuzendaria;

	public hotela() {
		this.id = 0;
		this.izena = "";
		this.hiria = "";
		this.nan_zuzendaria = "";
	}

	public hotela(int i, String iz, String h, String nz) {
		this.id = i;
		this.izena = iz;
		this.hiria = h;
		this.nan_zuzendaria = nz;
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

	public String getHiria() {
		return hiria;
	}

	public void setHiria(String hiria) {
		this.hiria = hiria;
	}

	public String getNan_zuzendaria() {
		return nan_zuzendaria;
	}

	public void setNan_zuzendaria(String nan_zuzendaria) {
		this.nan_zuzendaria = nan_zuzendaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hiria == null) ? 0 : hiria.hashCode());
		result = prime * result + id;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + ((nan_zuzendaria == null) ? 0 : nan_zuzendaria.hashCode());
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
		hotela other = (hotela) obj;
		if (hiria == null) {
			if (other.hiria != null)
				return false;
		} else if (!hiria.equals(other.hiria))
			return false;
		if (id != other.id)
			return false;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (nan_zuzendaria == null) {
			if (other.nan_zuzendaria != null)
				return false;
		} else if (!nan_zuzendaria.equals(other.nan_zuzendaria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "hotela [id=" + id + ", izena=" + izena + ", hiria=" + hiria + ", nan_zuzendaria=" + nan_zuzendaria
				+ "]";
	}

	public void pantailaratuHotelak() {
		System.out.println("/////////////// ");
		System.out.println("Id: " + this.id);
		System.out.println("Izena: " + this.izena);
		System.out.println("Hiria: " + this.hiria);
		System.out.println("Nan: " + this.nan_zuzendaria);
		System.out.println("/////////////// ");
	}

	public void irakurri(Scanner sc) {
        System.out.println("Sartu hotelaren izena");
        this.izena = sc.next();
        System.out.println("Sartu hiria");
        this.hiria = sc.next();
        
    }
}
