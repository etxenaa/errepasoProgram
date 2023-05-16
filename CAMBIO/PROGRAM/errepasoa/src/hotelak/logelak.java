package hotelak;

import java.util.Scanner;

public class logelak {
    private int id;
    private String izena;
    private String zerbitzuak;
    private int id_hotel;
    private int okupatuta;

    public logelak() {
        this.id = 0;
        this.izena = "";
        this.zerbitzuak = "";
        this.id_hotel = 0;
        this.okupatuta = 0;
    }

    public logelak(int i, String iz, String z, int ih, int o) {
        this.id = i;
        this.izena = iz;
        this.zerbitzuak = z;
        this.id_hotel = ih;
        this.okupatuta = o;
    }

  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + id_hotel;
		result = prime * result + ((izena == null) ? 0 : izena.hashCode());
		result = prime * result + okupatuta;
		result = prime * result + ((zerbitzuak == null) ? 0 : zerbitzuak.hashCode());
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
		logelak other = (logelak) obj;
		if (id != other.id)
			return false;
		if (id_hotel != other.id_hotel)
			return false;
		if (izena == null) {
			if (other.izena != null)
				return false;
		} else if (!izena.equals(other.izena))
			return false;
		if (okupatuta != other.okupatuta)
			return false;
		if (zerbitzuak == null) {
			if (other.zerbitzuak != null)
				return false;
		} else if (!zerbitzuak.equals(other.zerbitzuak))
			return false;
		return true;
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

	public String getZerbitzuak() {
		return zerbitzuak;
	}

	public void setZerbitzuak(String zerbitzuak) {
		this.zerbitzuak = zerbitzuak;
	}

	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	public int getOkupatuta() {
		return okupatuta;
	}

	public void setOkupatuta(int okupatuta) {
		this.okupatuta = okupatuta;
	}

	public void pantailaratu() {
        System.out.println("///////////////");
        System.out.println("Logelarern Id: " + this.id);
        System.out.println("Izena: " + this.izena);
        System.out.println("Zerbitzuak: " + this.zerbitzuak);
        System.out.println("Hotelaren id: " + this.id_hotel);
        System.out.println("Okupatuta: " + this.okupatuta);
        System.out.println("///////////////");

    }

    public void irakurri(Scanner sc) {
        System.out.println("Sartu logelaren izena");
        this.izena = sc.next();
        System.out.println("Sartu zerbitzuak");
        this.zerbitzuak = sc.next();

    }

}
