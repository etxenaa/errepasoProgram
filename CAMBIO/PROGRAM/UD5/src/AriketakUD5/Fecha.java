package AriketakUD5;

import java.util.Objects;
import java.util.Scanner;

public class Fecha implements Comparable <Fecha> {
	private int dia;
	private int mes;
	private int anyo;

	// constructores

	// constructor por defecto
	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anyo = 2021;
	}

	// constructor copia
	public Fecha(Fecha f) {
		this.dia = f.dia;
		this.mes = f.mes;
		this.anyo = f.anyo;
	}

	// constructor parametro
	public Fecha(int d, int m, int a) {
		// dia
		if (d >= 1 && d <= 31) {
			this.dia = d;
		} else {
			System.out.println("El valor de dia NO es valido. Se ha puesto 1 como dia");
			this.dia = 1;
		}
		// mes
		if (m >= 1 && m <= 12) {
			this.mes = m;
		} else {
			System.out.println("El valor de mes NO es valido. Se ha puesto 1 como mes");
			this.mes = 1;
		}
		// año
		if (a != 0) {
			this.anyo = a;
		} else {
			System.out.println("El valor de anyo NO es valido. Se ha puesto 2021 como anyo");
			this.anyo = 2021;
		}
	}

	// getters and setters
	public int getDia() {
		return dia;
	}

	public void setDia(int d) {
		if (d >= 1 && d <= 31) {
			this.dia = d;
		} else {
			System.out.println("El valor de dia NO es valido. Se ha puesto 1 como dia");
			this.dia = 1;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int m) {
		if (m >= 1 && m <= 12) {
			this.mes = m;
		} else {
			System.out.println("El valor de mes NO es valido. Se ha puesto 1 como mes");
			this.mes = 1;
		}
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int a) {
		if (a != 0) {
			this.anyo = a;
		} else {
			System.out.println("El valor de anyo NO es valido. Se ha puesto 2021 como anyo");
			this.anyo = 2021;
		}
	}

	// to string
	@Override
	public String toString() {
		return dia + " / " + mes + " / " + anyo;
	}

	// hashCode and equals
	@Override
	public int hashCode() {
		return Objects.hash(anyo, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anyo == other.anyo && dia == other.dia && mes == other.mes;
	}

	public void leer(Scanner sc) {
		System.out.println("JAIOTZE DATA:");
		System.out.println("Sartu eguna:");
		this.dia = sc.nextInt();
		while ((this.dia < 1) || (this.dia > 31)) {
			System.out.println("ERROR");
			System.out.println("Sartu eguna:");
			this.dia = sc.nextInt();
		}

		System.out.println("Sartu hilabetea:");
		this.mes = sc.nextInt();
		while ((this.mes < 1) || (this.mes > 12)) {
			System.out.println("ERROR");
			System.out.println("Sartu hilabetea:");
			this.mes = sc.nextInt();
		}

		System.out.println("Sartu urtea:");
		this.anyo = sc.nextInt();
		while ((this.anyo < 0)) {
			System.out.println("ERROR");
			System.out.println("Sartu urtea:");
			this.anyo = sc.nextInt();
		}
	}

	@Override
	public int compareTo(Fecha other) {
		// TODO Auto-generated method stub
		if (this.anyo > other.anyo) {
			return (1);
		}
		else if (this.anyo < other.anyo) {
			return (-1);
		}
		else {
			if (this.mes > other.mes) {
				return (1);
			}
			else if (this.mes < other.mes) {
				return (-1);
			}
			else {
				if (this.dia > other.dia) {
					return (1);
				}
				else if (this.dia < other.dia) {
					return (-1);
				}
			}
			
		}
		return 0;
	}
}