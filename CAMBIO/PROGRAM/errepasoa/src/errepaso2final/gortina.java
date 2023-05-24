package errepaso2final;

import java.util.Scanner;

public class gortina extends produktuak {

	private String ohiala;

	public gortina() {
		super();
		this.ohiala = "";
	}

	public gortina(int kod, String izena, int stock, String kolorea, int prezioa, String ohiala) {
		super(kod, izena, stock, kolorea, prezioa);
		this.ohiala = ohiala;
	}

	@Override
	public String toString() {
		return  super.toString()+"gortina [ohiala=" + ohiala + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((ohiala == null) ? 0 : ohiala.hashCode());
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
		gortina other = (gortina) obj;
		if (ohiala == null) {
			if (other.ohiala != null)
				return false;
		} else if (!ohiala.equals(other.ohiala))
			return false;
		return true;
	}

	public String getOhiala() {
		return ohiala;
	}

	public void setOhiala(String ohiala) {
		this.ohiala = ohiala;
	}

	public void irakurri(Scanner sc) {
		System.out.print("Sartu kod-->");
		this.kod=sc.nextInt();
		System.out.print("Sartu izena-->");
		this.izena=sc.next();
		System.out.print("Sartu stock-a-->");
		this.stock=sc.nextInt();
		System.out.print("Sartu kolorea-->");
		this.kolorea=sc.next();
		System.out.print("Sartu prezioa-->");
		this.prezioa=sc.nextInt();
		System.out.print("Sartu ohiala-->");
		this.ohiala=sc.next();
	}
	
	public void pantailaratu() {
		super.pantailaratu();
		System.out.println("Ohiala-->"+this.ohiala);
		System.out.println("-------------");
	}

}
