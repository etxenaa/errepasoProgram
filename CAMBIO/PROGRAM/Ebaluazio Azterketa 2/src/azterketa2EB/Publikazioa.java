package azterketa2EB;

import java.util.Scanner;

public abstract class Publikazioa {

	protected String kodigoa;
	protected String tituloa;
	protected int urtea;

	public Publikazioa() {
		this.kodigoa = "";
		this.tituloa = "";
		this.urtea = 0;
	}

	public Publikazioa(String k, String t, int u) {
		this.kodigoa = k;
		this.tituloa = t;
		this.urtea = u;
	}

	public String getKodigoa() {
		return kodigoa;
	}

	public void setKodigoa(String kodigoa) {
		this.kodigoa = kodigoa;
	}

	public String getTituloa() {
		return tituloa;
	}

	public void setTituloa(String tituloa) {
		this.tituloa = tituloa;
	}

	public int getUrtea() {
		return urtea;
	}

	public void setUrtea(int urtea) {
		this.urtea = urtea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kodigoa == null) ? 0 : kodigoa.hashCode());
		result = prime * result + ((tituloa == null) ? 0 : tituloa.hashCode());
		result = prime * result + urtea;
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
		Publikazioa other = (Publikazioa) obj;
		if (kodigoa == null) {
			if (other.kodigoa != null)
				return false;
		} else if (!kodigoa.equals(other.kodigoa))
			return false;
		if (tituloa == null) {
			if (other.tituloa != null)
				return false;
		} else if (!tituloa.equals(other.tituloa))
			return false;
		if (urtea != other.urtea)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "KODIGOA=" + kodigoa + ", TITULOA=" + tituloa + ", URTEA=" + urtea;
	}

	public abstract void irakurri(Scanner sc);
}
