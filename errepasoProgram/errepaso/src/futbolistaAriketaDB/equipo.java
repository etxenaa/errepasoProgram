package futbolistaAriketaDB;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class equipo{
	private int idEquipo;
	private String nombre;
	private String ciudad;
	
	public equipo() {
		this.idEquipo=0;
		this.nombre="";
		this.ciudad="";
	}
	
	public equipo(int i, String n, String c) {
		this.idEquipo=i;
		this.nombre=n;
		this.ciudad=c;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, idEquipo, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		equipo other = (equipo) obj;
		return Objects.equals(ciudad, other.ciudad) && idEquipo == other.idEquipo
				&& Objects.equals(nombre, other.nombre);
	}
	
	public void pantailaratu() {
		System.out.println("ID equipo: "+this.idEquipo);

		System.out.println("Nombre: "+this.nombre);

		System.out.println("Ciudad: "+this.ciudad);
		System.out.println("");
	}

	public void irakurri(Scanner sc) {
		System.out.print("Introduzca el nombre del equipo: ");
		this.nombre=sc.next();
		System.out.print("Introduzca la ciudad del equipo: ");
		this.ciudad=sc.next();
	}
	
}
