package examenErrepaso;

public class erosketa {
	
	private int idErosketa;
	private int idOrdenagailua;
	private String nan;
	private int kopurua;
	
	public erosketa() {
		this.idErosketa=0;
		this.idOrdenagailua=0;
		this.nan="";
		this.kopurua=0;
	}

	public erosketa(int idErosketa, int idOrdenagailua, String nan, int kopurua) {
		this.idErosketa = idErosketa;
		this.idOrdenagailua = idOrdenagailua;
		this.nan = nan;
		this.kopurua = kopurua;
	}

	public int getIdErosketa() {
		return idErosketa;
	}

	public void setIdErosketa(int idErosketa) {
		this.idErosketa = idErosketa;
	}

	public int getIdOrdenagailua() {
		return idOrdenagailua;
	}

	public void setIdOrdenagailua(int idOrdenagailua) {
		this.idOrdenagailua = idOrdenagailua;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public int getKopurua() {
		return kopurua;
	}

	public void setKopurua(int kopurua) {
		this.kopurua = kopurua;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idErosketa;
		result = prime * result + idOrdenagailua;
		result = prime * result + kopurua;
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
		erosketa other = (erosketa) obj;
		if (idErosketa != other.idErosketa)
			return false;
		if (idOrdenagailua != other.idOrdenagailua)
			return false;
		if (kopurua != other.kopurua)
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
		return "erosketa [idErosketa=" + idErosketa + ", idOrdenagailua=" + idOrdenagailua + ", nan=" + nan
				+ ", kopurua=" + kopurua + "]";
	}	
	
	public void pantailaratu() {
		System.out.println("-----");
		System.out.println("Id erosketa--> "+this.idErosketa);
		System.out.println("Id ordenagailua--> "+this.idOrdenagailua);
		System.out.println("Nan--> "+this.nan);
		System.out.println("Kopurua--> "+this.kopurua);
		System.out.println("-----");
	}

}
