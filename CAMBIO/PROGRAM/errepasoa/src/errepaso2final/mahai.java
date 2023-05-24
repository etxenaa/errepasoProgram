package errepaso2final;

import java.util.Scanner;

public class mahai extends produktuak{

	private String forma;
	
	public mahai() {
		super();
		this.forma="";
	}
	
	
	
	public mahai(int kod, String izena, int stock, String kolorea, int prezioa, String forma) {
		super(kod, izena, stock, kolorea, prezioa);
		this.forma = forma;
	}

	

	@Override
	public String toString() {
		return super.toString()+"mahai [forma=" + forma + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((forma == null) ? 0 : forma.hashCode());
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
		mahai other = (mahai) obj;
		if (forma == null) {
			if (other.forma != null)
				return false;
		} else if (!forma.equals(other.forma))
			return false;
		return true;
	}



	public String getForma() {
		return forma;
	}



	public void setForma(String forma) {
		this.forma = forma;
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
		System.out.print("Sartu forma-->");
		this.forma=sc.next();
	}

	public void pantailaratu() {
		super.pantailaratu();
		System.out.println("Forma-->"+this.forma);
		System.out.println("-------------");
	}
	
}
