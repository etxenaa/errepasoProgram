package azterketa2EB;

import java.util.ArrayList;

public class Katalogo {

	protected ArrayList<Publikazioa> kata;

	public Katalogo() {
		this.kata = new ArrayList<Publikazioa>();
	}

	public ArrayList<Publikazioa> getLista() {
		return kata;
	}

	public void setLista(ArrayList<Publikazioa> lista) {
		this.kata = lista;
	}

	public void fillData() {
		Publikazioa l1 = new Liburu("l1", "Txoriak kolpeka", 1997, 30);
		Publikazioa l2 = new Liburu("l2", "123", 2000, 40);
		Publikazioa l3 = new Liburu("l3", "Ezer ez", 1897, 50);
		Publikazioa l4 = new Liburu("l4", "Txanogorritxu", 1997, 40);

		kata.add(l1);
		kata.add(l2);
		kata.add(l3);
		kata.add(l4);

		Publikazioa a1 = new Aldizkari("a1", "Mundua", 2020, 1);
		Publikazioa a2 = new Aldizkari("a2", "Mundua", 2020, 2);
		Publikazioa a3 = new Aldizkari("a3", "Historia", 2020, 1);
		Publikazioa a4 = new Aldizkari("a4", "Animaliak", 2020, 1);

		kata.add(a1);
		kata.add(a2);
		kata.add(a3);
		kata.add(a4);
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + kata;
	}

	public int publikazioPosizioa(String kkodea) {
		for (Publikazioa kont : kata) {
			if (kkodea.equalsIgnoreCase(kont.getKodigoa())) {
				return kata.indexOf(kont);
			}
		}
		return -1;
	}

}
