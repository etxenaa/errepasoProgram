package finala_ikasleak;

public class artista {
	protected String nan;
	protected String izena;
	protected int soldata;
	
	public artista() {
		this.nan="";
		this.izena="";
		this.soldata=0;
	}

	public artista(String nan, String izena, int soldata) {
		this.nan = nan;
		this.izena = izena;
		this.soldata = soldata;
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

	public int getSoldata() {
		return soldata;
	}

	public void setSoldata(int soldata) {
		this.soldata = soldata;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + ((nan == null) ? 0 : nan.hashCode());
		result = prime * result + soldata;
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
		artista other = (artista) obj;
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
		if (soldata != other.soldata)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "artista [nan=" + nan + ", izena=" + izena + ", soldata=" + soldata + "]";
	}
}
