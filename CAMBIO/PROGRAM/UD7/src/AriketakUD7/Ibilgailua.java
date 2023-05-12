package AriketakUD7;

import java.util.Arrays;
import java.util.Scanner;

public class Ibilgailua {
	
	private String matricula;
	private String modelo;
	private int potentzia;
	private int plazakopurua;
	private String[] kolorea = new String[3];
	
	public Ibilgailua() {
		this.matricula="";
		this.modelo="";
		this.potentzia=0;
		this.plazakopurua=0;
		this.kolorea[0]="zuria";
		this.kolorea[1]="beltza";
		this.kolorea[2]="urdina";
	}
	
	public Ibilgailua(String ma, String mo, int po, int pl, String[] ko) {
		this.matricula=ma;
		this.modelo=mo;
		this.potentzia=po;
		this.plazakopurua=pl;
		this.kolorea=ko;
	}
	
	public Ibilgailua(Ibilgailua a) {
		this.matricula=a.matricula;
		this.modelo=a.modelo;
		this.potentzia=a.potentzia;
		this.plazakopurua=a.plazakopurua;
		this.kolorea=a.kolorea;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotentzia() {
		return potentzia;
	}

	public void setPotentzia(int potentzia) {
		this.potentzia = potentzia;
	}

	public int getPlazakopurua() {
		return plazakopurua;
	}

	public void setPlazakopurua(int plazakopurua) {
		this.plazakopurua = plazakopurua;
	}

	public String[] getKolorea() {
		return kolorea;
	}

	public void setKolorea(String[] kolorea) {
		this.kolorea = kolorea;
	}
	
	@Override
	public String toString() {
		return "Ibilgailua [matricula=" + matricula + ", modelo=" + modelo + ", potentzia=" + potentzia
				+ ", plazakopurua=" + plazakopurua + ", kolorea=" + Arrays.toString(kolorea) + "]";
	}
	
	public void Pantailaratu() {
		System.out.println(this.matricula);
		System.out.println(this.modelo);
		System.out.println(this.potentzia);
		System.out.println(this.plazakopurua);
		for (int i=0;i<kolorea.length;i++) {
			System.out.println(this.kolorea[i]);
		}
	}

	public void irakurri(Scanner sc) {
		System.out.print("Matricula: ");
		this.matricula = sc.next();
		sc.nextLine();
		sc.reset();
		System.out.print("Modelo: ");
		this.modelo = sc.next();
		System.out.print("Potentzia: ");
		this.potentzia=sc.nextInt();
		System.out.print("Plaza kopurua: ");
		this.plazakopurua=sc.nextInt();
		for (int i=0;i<kolorea.length;i++) {
			System.out.print((i+1)+". Kolorea: ");
			this.kolorea[i]=sc.next();
		}
		
	}

}
