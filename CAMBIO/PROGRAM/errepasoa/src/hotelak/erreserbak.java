package hotelak;

import java.util.Objects;
import java.util.Scanner;

public class erreserbak {
	private int id_erreserba;
	private int id_logela;
	private String dni_cliente;
	
	public erreserbak() {
		this.id_erreserba=0;
		this.id_logela=0;
		this.dni_cliente="";
	}
	
	public erreserbak(int ie, int il, String dc) {
		this.id_erreserba=ie;
		this.id_logela=il;
		this.dni_cliente=dc;
	}

	public int getId_erreserba() {
		return id_erreserba;
	}

	public void setId_erreserba(int id_erreserba) {
		this.id_erreserba = id_erreserba;
	}

	public int getId_logela() {
		return id_logela;
	}

	public void setId_logela(int id_logela) {
		this.id_logela = id_logela;
	}

	public String getDni_cliente() {
		return dni_cliente;
	}

	public void setDni_cliente(String dni_cliente) {
		this.dni_cliente = dni_cliente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni_cliente, id_erreserba, id_logela);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		erreserbak other = (erreserbak) obj;
		return Objects.equals(dni_cliente, other.dni_cliente) && id_erreserba == other.id_erreserba
				&& id_logela == other.id_logela;
	}
	
	public void irakurri(Scanner sc) {
		System.out.println("Zein da zure dni-a?");
		this.dni_cliente=sc.next();
	}
	
	public void pantailaratu() {
		System.out.println("");
		System.out.println("///////////////");
		System.out.println("Erreserbaren id-a: "+this.id_erreserba);
		System.out.println("Logelaren id-a: "+this.id_logela);
		System.out.println("Bezeroaren dni-a: "+this.dni_cliente);
		System.out.println("///////////////");
		System.out.println("");
	}
	
}
