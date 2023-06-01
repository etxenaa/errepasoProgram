package finala_ikasleak;

public class abestia {
	private int id;
	private String izena;
	private String dni_ekoizlea;
	
	public abestia() {
		this.id=0;
		this.izena="";
		this.dni_ekoizlea="";
	}

	public abestia(int id, String izena, String dni_ekoizlea) {
		this.id = id;
		this.izena = izena;
		this.dni_ekoizlea = dni_ekoizlea;
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

	public String getDni_ekoizlea() {
		return dni_ekoizlea;
	}

	public void setDni_ekoizlea(String dni_ekoizlea) {
		this.dni_ekoizlea = dni_ekoizlea;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni_ekoizlea == null) ? 0 : dni_ekoizlea.hashCode());
		result = prime * result + id;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
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
		abestia other = (abestia) obj;
		if (dni_ekoizlea == null) {
			if (other.dni_ekoizlea != null)
				return false;
		} else if (!dni_ekoizlea.equals(other.dni_ekoizlea))
			return false;
		if (id != other.id)
			return false;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "abestia [id=" + id + ", izena=" + izena + ", dni_ekoizlea=" + dni_ekoizlea + "]";
	}
	
	
}
