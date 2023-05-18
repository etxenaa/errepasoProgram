package examenErrepaso;

public class dendabezeroa {
	
	private String nan;
	private String izena;
	private String abizena;
	
	public dendabezeroa() {
		this.nan = "";
		this.izena = "";
		this.abizena = "";
	}
	
	public dendabezeroa(String n, String i, String a) {
		this.nan = n;
		this.izena = i;
		this.abizena = a;
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

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abizena == null) ? 0 : abizena.hashCode());
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
		dendabezeroa other = (dendabezeroa) obj;
		if (abizena == null) {
			if (other.abizena != null)
				return false;
		} else if (!abizena.equals(other.abizena))
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
		return "dendabezeroa [nan=" + nan + ", izena=" + izena + ", abizena=" + abizena + "]";
	}
	
	public void pantailaratu() {
		System.out.println("-----");
		System.out.println("Nan--> "+this.nan);
		System.out.println("Izena--> "+this.izena);
		System.out.println("Abizena--> "+this.abizena);
		System.out.println("-----");
	}
	
}
