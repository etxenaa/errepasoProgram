package Bodega;

public abstract class artikuloa {
	
	//atributoak
	protected String kodea;
	protected String izena;
	protected String marka;
	protected double salneurria;
	protected int stock;
	
	
	//konstruktoreak
	
	public artikuloa() {
		this.kodea="";
		this.izena="";
		this.marka="";
		this.salneurria=0.0;
		this.stock=0;
	}
	
	public artikuloa(String k, String i, String m, double s, int st) {
		this.kodea=k;
		this.izena=i;
		this.marka=m;
		this.salneurria=s;
		this.stock=st;
	}

	
	//getters and setters
		
	public String getKodea() {
		return kodea;
	}

	public void setKodea(String kodea) {
		this.kodea = kodea;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public double getSalneurria() {
		return salneurria;
	}

	public void setSalneurria(double salneurria) {
		this.salneurria = salneurria;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	

	
	//equals
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + ((kodea == null) ? 0 : kodea.hashCode());
		result = prime * result + ((marka == null) ? 0 : marka.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salneurria);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		artikuloa other = (artikuloa) obj;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (kodea == null) {
			if (other.kodea != null)
				return false;
		} else if (!kodea.equals(other.kodea))
			return false;
		if (marka == null) {
			if (other.marka != null)
				return false;
		} else if (!marka.equals(other.marka))
			return false;
		if (Double.doubleToLongBits(salneurria) != Double.doubleToLongBits(other.salneurria))
			return false;
		if (stock != other.stock)
			return false;
		return true;
	}
	
	
	public int GehituStock(int a) {
		this.stock=this.stock+a;
		return stock;
	}
	
	public int KenduStock(int a) {
		this.stock=this.stock-a;
		return stock;
	}
	
	
	public abstract void printEzaugarriak();
	
	public abstract boolean osasungarriak();
	
}
