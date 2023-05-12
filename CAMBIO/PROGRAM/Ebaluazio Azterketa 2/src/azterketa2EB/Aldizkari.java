package azterketa2EB;

import java.util.Scanner;

public class Aldizkari extends Publikazioa {

	private int zenbakia;

	public Aldizkari() {
		super();
		this.zenbakia = 0;
	}

	public Aldizkari(String k, String t, int u, int z) {
		super(k, t, u);
		this.zenbakia = z;
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + zenbakia;
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
		Aldizkari other = (Aldizkari) obj;
		if (zenbakia != other.zenbakia)
			return false;
		return true;
	}

	
	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}
	
	
	@Override
	public String toString() {
		return "Aldizkari [" + super.toString() + ", ZENBAKIA=" + zenbakia + "]";
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
		System.out.println("Sartu zenbakia: ");
		this.zenbakia = sc.nextInt();
	}

}
