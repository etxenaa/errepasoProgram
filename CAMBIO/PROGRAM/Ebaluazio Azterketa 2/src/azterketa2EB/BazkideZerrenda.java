package azterketa2EB;

import java.util.ArrayList;
import java.util.Scanner;

public class BazkideZerrenda {
	
	protected ArrayList<Bazkide> zerrenda;

	public BazkideZerrenda() {
		this.zerrenda = new ArrayList<Bazkide>();
	}

	public ArrayList<Bazkide> getLista() {
		return zerrenda;
	}

	public void setLista(ArrayList<Bazkide> lista) {
		this.zerrenda = lista;
	}

	public void fillData() {
		Bazkide b1 = new Bazkide("1","Leire","Trabado",34);
		Bazkide b2 = new Bazkide("2222222A","Antonio","Rodelgo",35);
		Bazkide b3 = new Bazkide("3333333V","Jon","Gonzalez",36);
		Bazkide b4 = new Bazkide("5555555J","Laura","Gomez",12);
		
		zerrenda.add(b1);
		zerrenda.add(b2);
		zerrenda.add(b3);
		zerrenda.add(b4);
	}
	
	public boolean bazkideEgin(String ddni) {
		for (Bazkide kont : zerrenda) {
			if (ddni.equalsIgnoreCase(kont.getDni())) {
				return true;
			}
		}
		return false;
		
	}
	
	public void BazkideEgin(Scanner sc) {
		Bazkide f1 = new Bazkide();
		f1.irakurri(sc);
		zerrenda.add(f1);
	}
	
	public int bazkidearenPosizioa(String nnan) {
		for (Bazkide kont : zerrenda) {
			if (nnan.equalsIgnoreCase(kont.getDni())) {
				return zerrenda.indexOf(kont);
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return super.toString() + zerrenda;
	}
	
	
}
