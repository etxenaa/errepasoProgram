package finala_ikasleak;

public class sortu {
	private int id;
	private int id_abestia;
	private String nan_abeslari;
	
	public sortu() {
		this.id=0;
		this.id_abestia=0;
		this.nan_abeslari="";

	}
	
	public sortu(int i, int ia, String na) {
		this.id=i;
		this.id_abestia=ia;
		this.nan_abeslari=na;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_abestia() {
		return id_abestia;
	}

	public void setId_abestia(int id_abestia) {
		this.id_abestia = id_abestia;
	}

	public String getNan_abeslari() {
		return nan_abeslari;
	}

	public void setNan_abeslari(String nan_abeslari) {
		this.nan_abeslari = nan_abeslari;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + id_abestia;
		result = prime * result + ((nan_abeslari == null) ? 0 : nan_abeslari.hashCode());
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
		sortu other = (sortu) obj;
		if (id != other.id)
			return false;
		if (id_abestia != other.id_abestia)
			return false;
		if (nan_abeslari == null) {
			if (other.nan_abeslari != null)
				return false;
		} else if (!nan_abeslari.equals(other.nan_abeslari))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "sortu [id=" + id + ", id_abestia=" + id_abestia + ", nan_abeslari=" + nan_abeslari + "]";
	}
	
	
}
