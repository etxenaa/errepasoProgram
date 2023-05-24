package errepaso2final;

import java.util.ArrayList;
import java.util.Scanner;

public class katalogoa {

	Scanner sc = new Scanner(System.in);
	ArrayList<produktuak> lista;

	public katalogoa(ArrayList<produktuak> array) {
		this.lista = array;
	}

	public void fillData() {

		// Datuak sartu
		mahai m1 = new mahai(1, "lack", 5, "beltza", 100, "borobila");
		mahai m2 = new mahai(2, "top", 4, "gorria", 101, "borobila");
		mahai m3 = new mahai(3, "studio", 3, "berdea", 99, "borobila");
		mahai m4 = new mahai(4, "super", 2, "zuria", 40, "borobila");
		mahai m5 = new mahai(5, "elegance", 0, "horia", 349, "borobila");
		gortina g1 = new gortina(1, "sukalde", 5, "zuria", 33, "kotoia");
		gortina g2 = new gortina(2, "logela", 100, "zuria", 466, "kotoia");
		gortina g3 = new gortina(3, "komuna", 0, "zuria", 77, "kotoia");
		gortina g4 = new gortina(4, "egongela", 4, "zuria", 55, "kotoia");
		gortina g5 = new gortina(5, "outdoor", 5, "zuria", 100, "kotoia");
		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		lista.add(m4);
		lista.add(m5);
		lista.add(g1);
		lista.add(g2);
		lista.add(g3);
		lista.add(g4);
		lista.add(g5);
	}

	public int produktuPosizioa(String izena) {
		int pos = lista.indexOf(izena);
		
		if(pos>0) {
			return pos;
		}
		else {
			return -1;
		}
	}

	public void stockpositiboa() {
		for (int f = 0; f < lista.size(); f++) {
			if (lista.get(f).getStock() >= 1) {
				System.out.println(lista.get(f));
			}
		}
	}

}
