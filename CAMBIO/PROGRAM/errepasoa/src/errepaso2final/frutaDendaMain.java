package errepaso2final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import hotelak.erabiltzailea;

public class frutaDendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aukera = 0, pos = 0, kodigo;
		String izena;

		boolean cambio = false, encontrado = false;

		Scanner sc = new Scanner(System.in);

		fruta fberria = new fruta();
		ArrayList<fruta> fList = new ArrayList<fruta>();

		try {
			FileInputStream fis = new FileInputStream("fruta.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				fberria = (fruta) ois.readObject();
				fList.add(fberria);
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error archivo no encontrado.");
		} catch (IOException ioe) {
			System.out.println("Error de Entrada / Salida");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error Clase No Encontrada");
		}

		System.out.println("ONGI ETORRI!");
		do {
			System.out.println("Zer egin nahi duzu? ");
			System.out.println("0- Irten ");
			System.out.println("1- Frutak ikusi ");
			System.out.println("2- Fruta gehitu ");
			System.out.println("3- Fruta ezabatu ");
			aukera = sc.nextInt();

			switch (aukera) {
			case 1:
				if (fList.size() == 0) {
					System.out.println("Ez dago frutarik");
				}
				for (fruta kont : fList) {
					kont.pantailaratu();
				}
				break;
			case 2:
				fruta fBerria = new fruta();
				if (fList.size() == 0) {
					fBerria.setKod(1);
				} else {
					fBerria.setKod(fList.get(fList.size() - 1).getKod() + 1);
				}
				fBerria.irakurri(sc);
				fList.add(fBerria);
				cambio = true;
				break;
			case 3:
				if (fList.size() == 0) {
					System.out.println("Ez dago frutarik");
				}
				for (fruta kont : fList) {
					kont.pantailaratu();
				}
				while (!encontrado) {
					System.out.println("Zein da ezabatu nahi duzun frutaren izena? ");
					izena = sc.next();
					for (int f = 0; f < fList.size(); f++) {
						if (izena.equalsIgnoreCase(fList.get(f).getIzena())) {
							encontrado = true;
							pos = f;
						}
					}
					if (encontrado) {
						kodigo = fList.get(pos).getKod();
						fList.remove(pos);
						System.out.println("Fruta ezabatu da");
						for (int i = 0; i < fList.size(); i++) {
							if (kodigo < fList.get(i).getKod()) {
								fList.get(i).setKod(fList.get(i).getKod() - 1);
							}
						}
					}
				}
				break;
			case 0:
				break;
			}
		} while (aukera != 0);
	}

}
