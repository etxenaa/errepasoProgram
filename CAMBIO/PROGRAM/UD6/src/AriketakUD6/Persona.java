package AriketakUD6;

import java.util.Objects;
import java.util.Scanner;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private Fecha fechanacimiento;

	
	public Persona() {
		this.dni = "";
		this.nombre = "";
		this.apellido = "";
		this.fechanacimiento = new Fecha();
	}

	public Persona(String d, String n, String a, Fecha f) {
		this.dni = d;
		this.nombre = n;
		this.apellido = a;
		this.fechanacimiento = new Fecha(f);
	}

	public Persona(Persona p) {
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellido = p.apellido;
		this.fechanacimiento = new Fecha(p.fechanacimiento);
	}

	
	@Override
	public String toString() {
		return "Persona1 [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fechanacimiento=" + fechanacimiento + "]";
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

	public Fecha getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Fecha fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechanacimiento == null) ? 0 : fechanacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechanacimiento == null) {
			if (other.fechanacimiento != null)
				return false;
		} else if (!fechanacimiento.equals(other.fechanacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	public void leer(Scanner teclado) {
		System.out.print("DNI: ");
		this.dni = teclado.next();
		System.out.print("NOMBRE: ");
		this.nombre = teclado.next();
		System.out.print("ABIZENA: ");
		this.apellido = teclado.next();
		this.fechanacimiento.leer(teclado);
	}
	
	

}