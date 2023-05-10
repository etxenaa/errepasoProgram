package futbolistaAriketaDB;

import java.util.Objects;
import java.util.Scanner;


public class futbolistas {
	private String dni;
	private String nombre;
	private String apellido;
	private int salario;
	private int idEquipo;
	
	public futbolistas() {
		this.dni="";
		this.nombre="";
		this.apellido="";
		this.salario=0;
		this.idEquipo=0;
	}
	
	public futbolistas(String d, String n, String a, int s, int ie) {
		this.dni=d;
		this.nombre=n;
		this.apellido=a;
		this.salario=s;
		this.idEquipo=ie;
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

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, idEquipo, nombre, salario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		futbolistas other = (futbolistas) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni) && idEquipo == other.idEquipo
				&& Objects.equals(nombre, other.nombre) && salario == other.salario;
	}
	
	public void pantailaratu() {
		System.out.println("DNI: "+this.dni);

		System.out.println("Nombre: "+this.nombre);

		System.out.println("Apellido: "+this.apellido);

		System.out.println("Salario: "+this.salario);
		
		System.out.println("ID equipo: "+this.idEquipo);
		System.out.println("");
	}
	
	public void irakurri(Scanner sc) {
		System.out.print("Introduzca el DNI deñ jugador: ");
		this.dni=sc.next();
		System.out.print("Introduzca el nombre del jugador: ");
		this.nombre=sc.next();
		System.out.print("Introduzca el apellido del jugador: ");
		this.apellido=sc.next();
		System.out.print("Introduzca el salario del jugador: ");
		this.salario=sc.nextInt();
		System.out.print("Introduzca el id del equipo del jugador: ");
		this.idEquipo=sc.nextInt();
	}
}
