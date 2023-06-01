package finala_ikasleak;

public class abeslari extends artista {
	private String mota;

	public abeslari() {
		super();
		this.mota = "";
	}

	public abeslari(String nan, String izena, int soldata, String m) {
		super(nan, izena, soldata);
		this.mota = m;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mota == null) ? 0 : mota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		abeslari other = (abeslari) obj;
		if (mota == null) {
			if (other.mota != null)
				return false;
		} else if (!mota.equals(other.mota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "abeslari [mota=" + mota + "]";
	}
	
	public void pantailaratu() {
		System.out.println("NAN:" + this.nan);
		System.out.println("Izena:" + this.izena);
		System.out.println("Soldata:" + this.soldata);
		System.out.println("Mota:" + this.mota);
		System.out.println("---------------");
	}

}
