package Bodega;

import java.util.ArrayList;
import java.util.Scanner;

public class artikuloZerrenda {
	
	ArrayList<artikuloa> lista;
	
	public artikuloZerrenda() {
		this.lista = new ArrayList<artikuloa>();
	}
	
	public ArrayList<artikuloa> getLista() {
		return lista;
	}

	public void setLista(ArrayList<artikuloa> lista) {
		this.lista = lista;
	}
	
	public void fillData() {
		artikuloa a01 = new freskagarriak("FRES01", "CocaCola Zero", "CocaCola", 1.10, 100, "Zero", false, true, 0);
		artikuloa a02 = new freskagarriak("FRES02", "CocaCola", "CocaCola", 0.99, 300, "Normala", false, true, 35);
		artikuloa a03 = new freskagarriak("FRES03", "Aquarius", "Aquarius", 1.40, 250, "Limoia", false, false, 26);
		artikuloa a04 = new freskagarriak("FRES04", "Aquarius Naranja", "Aquarius", 1.50, 200, "Laranja", true, false, 26);
		artikuloa a05 = new freskagarriak("FRES05", "Nestea", "Nestle", 1.40, 40, "Limoia", true, false, 25);
		artikuloa a06 = new freskagarriak("FRES06", "Sprite", "CocaCola", 1.10, 30, "Lima-Limoia", false, true, 7);
		artikuloa a07 = new freskagarriak("FRES07", "Monster", "Monster", 1.90, 80, "Fruitu gorriak", true, true, 60);
		artikuloa a08 = new freskagarriak("FRES08", "Redbull", "Redbull", 2.00, 120, "Sandia", true, true, 52);
		
		artikuloa a09 = new ardoa("ARDO01", "Ramon Bilbao", "Ramon Bilbao", 16.00, 600, "Gorria", "Errioxa", 1876, "100% Tempranillo");
        artikuloa a10 = new ardoa("ARDO02", "Tartalo", "Tartalo", 123.94, 200, "Gorria", "Nafarroa", 1920, "48% Tempranillo, 48% Garnacha, 2% Viura, 2% Garnacha Blanca");
        artikuloa a11 = new ardoa("ARDO03", "Ahari", "Ahari", 43.00, 450, "Gorria", "Errioxa", 2020, " 70% Tempranillo y 30% Graciano");
        artikuloa a12 = new ardoa("ARDO04", "Rodriguez & Sanzo", "Rodriguez & Sanzo", 20.00, 540, "Zuria", "Segovia", 2015, "100% Verdejo");
        artikuloa a13 = new ardoa("ARDO05", "Alabaster", "Alabaster", 292.60, 10, "Beltza eta morea", "Valmediano, La Jara eta Marinacea", 1910, "100% Tinta de toro");
        artikuloa a14 = new ardoa("ARDO06", "Marko", "Marko", 22.00, 1490, "Zuria", "Bizkaia", 2019, "40% Hondarribi Zuri Zerratia, 30% Hondarribi Zuri, 20% Izkiota Txikia");
        artikuloa a15 = new ardoa("ARDO07", "Gil Berzal", "Gil Berzal", 16.00, 170, "Zuria", "Errioxa/Araba", 2001, "90% Viura y 10% Malvasía");
        artikuloa a16 = new ardoa("ARDO08", "Reserva real", "Reserva real", 292.60, 2, "Gorria", "Penedes", 2015, "Merlot, Cabernet sauvignon, Cabernet franc");
        
        lista.add(a01);
        lista.add(a02);
        lista.add(a03);
        lista.add(a04);
        lista.add(a05);
        lista.add(a06);
        lista.add(a07);
        lista.add(a08);
        lista.add(a09);
        lista.add(a10);
        lista.add(a11);
        lista.add(a12);
        lista.add(a13);
        lista.add(a14);
        lista.add(a15);
        lista.add(a16);      
	}
	
	public ArrayList<artikuloa> reponer() {
		ArrayList<artikuloa> r = new ArrayList();
		for (artikuloa i:lista) {
			if (i.getStock()<50) {
				r.add(i);
			}
		}
		return r;
    }
	
	
	public ArrayList<artikuloa> garestiena() {
		ArrayList<artikuloa> g = new ArrayList();
		double max=0;
		for (artikuloa i:lista) {
			if (i.getSalneurria()>max) {
				max=i.getSalneurria();
			}
		}
		for (artikuloa w:lista) {
			if (max==w.getSalneurria()) {
				g.add(w);
			}
		}
		return g;
    }
	
	public double salneurria(String pkodea) {
		double sa = 0;
		for (artikuloa s : lista) {
			if (pkodea.equalsIgnoreCase(s.getKodea())) {
				sa = s.getSalneurria();
			}
		}
		return sa;
	}
	
	public ArrayList<artikuloa> ekibalentea(String kodea) {
		ArrayList<artikuloa> salneurriberdina = new ArrayList<artikuloa>();
		double sal = salneurria(kodea);
		for (artikuloa k : lista) {
			if (k.getSalneurria()==sal) {
				salneurriberdina.add(k);
			}
		}
		return salneurriberdina;
	}
	
}
