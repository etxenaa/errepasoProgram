package Pertsona;

import java.util.Scanner;

public class Pertsona {
	
	private String dni;
	private String nombre;
	private String apellido;
	
	public Pertsona() {
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
	}

	public Pertsona(String d, String n, String a) {
		this.dni = d;
		this.nombre = n;
		this.apellido = a;
	}

	public Pertsona(Pertsona p) {
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	@Override
	public String toString() {
		return "Pertsona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "] ";
	}

	public void irakurri(Scanner sc) {
		System.out.print("DNI: ");
		this.dni = sc.next();
		System.out.print("IZENA: ");
		this.nombre = sc.next();
		System.out.print("ABIZENA: ");
		this.apellido = sc.next();
	}
	
}
