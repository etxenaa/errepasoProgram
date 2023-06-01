package finala_ikasleak;

import java.io.Serializable;

public class musikaEkoizlea implements Serializable {
	private String nan;
	private String izena;
	private String estiloa;

	public musikaEkoizlea() {
		this.nan = "";
		this.izena = "";
		this.estiloa = "";
	}

	public musikaEkoizlea(String n, String i, String e) {
		this.nan = n;
		this.izena = i;
		this.estiloa = e;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getEstiloa() {
		return estiloa;
	}

	public void setEstiloa(String estiloa) {
		this.estiloa = estiloa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estiloa == null) ? 0 : estiloa.hashCode());
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + ((nan == null) ? 0 : nan.hashCode());
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
		musikaEkoizlea other = (musikaEkoizlea) obj;
		if (estiloa == null) {
			if (other.estiloa != null)
				return false;
		} else if (!estiloa.equals(other.estiloa))
			return false;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (nan == null) {
			if (other.nan != null)
				return false;
		} else if (!nan.equals(other.nan))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "nan=" + nan + ", izena=" + izena + ", estiloa=" + estiloa + "]";
	}

	public void pantailaratu() {
		System.out.println("NAN: " + this.nan);
		System.out.println("Izena: " + this.izena);
		System.out.println("Estiloa: " + this.estiloa);
		System.out.println("---------------");
	}

}
