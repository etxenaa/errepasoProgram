package AriketakUD5;

import java.util.Scanner;

public class Asignatura {

	private String codigo;
	private String descripcion;
	private double nota;
	
	
	public Asignatura() {
		this.codigo="";
		this.descripcion="";
		this.nota=0.0;
	}
	
	public Asignatura(String c, String d, double n) {
		this.codigo=c;
		this.descripcion=d;
		this.nota=n;
	}
	
	public Asignatura(Asignatura a) {
		this.codigo=a.codigo;
		this.descripcion=a.descripcion;
		this.nota=a.nota;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return codigo + " - " + nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Asignatura other = (Asignatura) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}
	
	
	public void leer(Scanner teclado) {
		System.out.print("Descripcion: ");
		this.descripcion = teclado.next();
		//al ser otro string se vacia el teclado
		teclado.nextLine();
		teclado.reset();
		System.out.print("Codigo: ");
		this.codigo = teclado.next();
		//al cambiar a double no hace falta vaciar
		System.out.print("Nota: ");
		this.nota = teclado.nextDouble();
	}
	
	
	
}
