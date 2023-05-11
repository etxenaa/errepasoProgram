package hotelak;

import java.util.Scanner;

public class bezeroa {
    private String dni;
    private String izena;

    public bezeroa() {
        this.dni = "";
        this.izena = "";
    }

    public bezeroa(String d, String i) {
        this.dni = d;
        this.izena = i;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
        bezeroa other = (bezeroa) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (izena == null) {
            if (other.izena != null)
                return false;
        } else if (!izena.equals(other.izena))
            return false;
        return true;
    }

    public void irakurri(Scanner sc) {
        System.out.println("Sartu dni: ");
        this.dni = sc.next();
        System.out.println("Sartu bezeroaren izena: ");
        this.izena = sc.next();
    }

    public void pantailaratu() {
        System.out.println("Bezeroaren DNI: " + this.dni);
        System.out.println("Bezeroaren izena: " + this.izena);
    }
}
