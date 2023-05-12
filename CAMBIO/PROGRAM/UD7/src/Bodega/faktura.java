package Bodega;

import java.util.ArrayList;

public class faktura implements fakturazioa {
	private int zenbakia;
	private String izena;
	private String abizena;
	private ArrayList<fakturaLerroak> fakturaLerroak;
	private double totala;

	public faktura() {
		this.zenbakia = 0;
		this.izena = "";
		this.abizena = "";
		this.fakturaLerroak = new ArrayList<fakturaLerroak>();
	}
	
	public faktura(int znb, String izena, String abizena, ArrayList<fakturaLerroak> a) {
		this.zenbakia = znb;
		this.izena = izena;
		this.abizena = abizena;
		this.fakturaLerroak = a;
	}

	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public ArrayList<fakturaLerroak> getFakturaLerroak() {
		return fakturaLerroak;
	}

	public void setFakturaLerroak(ArrayList<fakturaLerroak> fakturaLerroak) {
		this.fakturaLerroak = fakturaLerroak;
	}

	public double getTotala() {
		return totala;
	}

	public void setTotala(double totala) {
		this.totala = totala;
	}

	public void LerroaGehitu(String pKodea, int pKopurua, double pGuztira) {
		fakturaLerroak f1 = new fakturaLerroak(pKodea, pKopurua, pGuztira);
		fakturaLerroak.add(f1);
	}

	public void print() {
		System.out.println("**************************************");
		System.out.println("** Faktura zenbakia: " + this.zenbakia);
		System.out.println("** Bezeroaren izena: " + this.izena);
		System.out.println("** Bezeroaren abizena: " + this.abizena);
		System.out.println("**************************************");
		System.out.println("KODEA  --  KOPURUA  --  PREZIOA");
		for (fakturaLerroak kont : fakturaLerroak) {
			System.out.println(kont);
		}
		System.out.println("--------------------------------------");
		System.out.println("                +  BEZ  (0.21)");
		System.out.println("--------------------------------------");
		System.out.println("** GUZTIRA: " + kalkuluTotala() + " €");

	}

	@Override
	public double kalkuluTotala() {
		double t = 0;
		for (fakturaLerroak kont : fakturaLerroak) {
			t = t + kont.getGuztiraLerro();
		}
		totala = t + (t * BEZ);
		return totala;
	}

}