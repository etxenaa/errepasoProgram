package Pertsona;

import java.util.Scanner;

public class Empleado extends Persona {

	private String departamento;
	private String puesto;
	private double salario;

	public Empleado() {
		super();
		this.departamento = "";
		this.puesto = "";
		this.salario = 0;
	}

	public Empleado(String de, String pu, double sa) {
		this.departamento = de;
		this.puesto = pu;
		this.salario = sa;
	}

	public Empleado(String d, String n, String a, Fecha f, String de, String pu, double sa) {
		super(d, n, a, f);
		this.departamento = de;
		this.puesto = pu;
		this.salario = sa;
	}
	
	public Empleado(Empleado e) {
		super(e);
		this.departamento = e.departamento;
		this.puesto = e.puesto;
		this.salario = e.salario;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [departamento=" + departamento + ", puesto=" + puesto + ", salario=" + salario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((departamento == null) ? 0 : departamento.hashCode());
		result = prime * result + ((puesto == null) ? 0 : puesto.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Empleado other = (Empleado) obj;
		if (departamento == null) {
			if (other.departamento != null)
				return false;
		} else if (!departamento.equals(other.departamento))
			return false;
		if (puesto == null) {
			if (other.puesto != null)
				return false;
		} else if (!puesto.equals(other.puesto))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	public void Irakurri(Scanner sc) {
		super.leer(sc);
		System.out.println("LAN DATUAK: ");
		System.out.println("Departamentua: ");
		this.departamento=sc.next();
		System.out.println("Postua: ");
		this.puesto=sc.next();
		System.out.println("Soldata: ");
		this.salario=sc.nextDouble();
		}
	
	
}
