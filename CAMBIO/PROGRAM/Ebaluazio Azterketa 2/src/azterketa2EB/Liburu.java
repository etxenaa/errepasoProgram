package azterketa2EB;

import java.util.Scanner;

public class Liburu extends Publikazioa{
	
	private int orriKopurua;
	
	public Liburu() {
		super();
		this.orriKopurua = 0;
	}

	public Liburu(String k, String t, int u, int z) {
		super(k, t, u);
		this.orriKopurua = z;
	}
	
	
	public int getOrriKopurua() {
		return orriKopurua;
	}

	public void setOrriKopurua(int orriKopurua) {
		this.orriKopurua = orriKopurua;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + orriKopurua;
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
		Liburu other = (Liburu) obj;
		if (orriKopurua != other.orriKopurua)
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Liburu ["+ super.toString() + ", ORRI KOPURUA=" + orriKopurua + "]";
	}

	@Override
	public void irakurri(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Sartu kodigoa: ");
		super.kodigoa = sc.next();
		System.out.println("Sartu tituloa: ");
		super.tituloa = sc.next();
		System.out.println("Sartu urtea: ");
		super.urtea = sc.nextInt();
		System.out.println("Sartu orri kopurua: ");
		this.orriKopurua = sc.nextInt();
	}

}
