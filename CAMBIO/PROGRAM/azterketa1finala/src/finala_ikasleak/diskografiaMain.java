package finala_ikasleak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class diskografiaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int aukera = 0, pos = 0, b = 0, r = 0, s = 0, q = 0, idAbestia = 0, posi = 0;
		boolean encontrado = false, musikaEkoizlea = false, abeslari = false, abestiaa = false;
		String nan, estilo, abestia, izena, nana = "", izenaa;

		musikaEkoizlea meBerria = new musikaEkoizlea();
		ArrayList<musikaEkoizlea> meList = new ArrayList<musikaEkoizlea>();

		ArrayList abeslariak = new ArrayList();
		ArrayList abeslariak2 = new ArrayList();
		ArrayList<abeslari> abList = new ArrayList<abeslari>();
		ArrayList<sortu> sList = new ArrayList<sortu>();
		ArrayList<abestia> abestiList = new ArrayList<abestia>();

		try {
			FileInputStream fis = new FileInputStream("musikaEkoizlea.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				meBerria = (musikaEkoizlea) ois.readObject();
				meList.add(meBerria);
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

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/diskografika", "root", "");
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM abeslari, artista WHERE artista.nan=abeslari.nan;");
			while (rs.next()) {
				abeslari abb = new abeslari(rs.getString("nan"), rs.getString("izena"), rs.getInt("soldata"),
						rs.getString("mota"));
				abList.add(abb);
			}
			rs = st.executeQuery("SELECT * FROM diskografika.sortu;");
			while (rs.next()) {
				sortu so = new sortu(rs.getInt("id"), rs.getInt("id_abestia"), rs.getString("nan_abeslari"));
				sList.add(so);
			}
			rs = st.executeQuery("SELECT * FROM diskografika.abestia;");
			while (rs.next()) {
				abestia abe = new abestia(rs.getInt("id"), rs.getString("izena"), rs.getString("dni_ekoizlea"));
				abestiList.add(abe);
			}

			rs.close();
			st.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Konexio errorea");
		}

		System.out.println("Ongi etorri!");

		do {
			r = 0;
			s = 0;
			b = 0;
			q = 0;
			pos = 0;
			posi = 0;

			System.out.println("Zer egin nahi duzu?");
			System.out.println("0- Irten");
			System.out.println("1- Musika ekoizleak ikusi");
			System.out.println("2- Abeslariak ikusi");
			System.out.println("3- Musika ekoizlearen estiloa aldatu");
			System.out.println("4- Abeslaria ezabatu");
			System.out.println("5- Abeslari baten abesti berria gehitu");
			System.out.println("6- Abesti baten abeslariak ikusi");
			System.out.println("----------");
			System.out.print("Zure aukera-->");
			aukera = sc.nextInt();

			switch (aukera) {
			case 1:
				System.out.println("** MUSIKA EKOIZLEAK **");
				System.out.println("---------------");
				for (musikaEkoizlea kont : meList) {
					kont.pantailaratu();
				}
				break;

			case 2:
				System.out.println("** ABESLARIAK **");
				System.out.println("---------------");
				for (abeslari konta : abList) {
					konta.pantailaratu();
				}
				break;

			case 3:
				System.out.println("** Musika ekoizlearen estiloa aldatu **");
				System.out.println("---------------");
				System.out.println("Aldatu nahi duzun musika ekoizlearen nan zenbakia sartu");
				nan = sc.next();
				for (int m = 0; m < meList.size(); m++) {
					if (meList.get(m).getNan().equalsIgnoreCase(nan)) {
						System.out.println("Aldatuko dituzun musika ekoizlearen datuak hauek dira:");
						encontrado = true;
						pos = m;
					}
				}
				if (!encontrado) {
					System.out.println("Nan-a ez dago datu basean");
					System.out.println("---------------");
				} else {
					for (musikaEkoizlea kont : meList) {
						if (kont.getNan().equalsIgnoreCase(nan)) {
							kont.pantailaratu();
						}
					}
					System.out.println("---------------");
					System.out.println("Zein da estilo berria?");
					estilo = sc.next();
					meList.get(pos).setEstiloa(estilo);
					System.out.println("Aldaketa egin da");
					musikaEkoizlea = true;
				}
				break;

			case 4:
				System.out.println("** Abeslaria ezabatu **");
				System.out.println("---------------");
				System.out.println("Ezabatu nahi duzun abeslariaren nan zenbakia sartu:");
				encontrado = false;
				nan = sc.next();
				for (int a = 0; a < abList.size(); a++) {
					if (abList.get(a).getNan().equalsIgnoreCase(nan)) {
						abList.remove(a);
						System.out.println("Abeslaria ezabatu egin da");
						encontrado = true;
						abeslari = true;
					}
				}
				if (!encontrado) {
					System.out.println("Nan-a ez dago datu basean");
					System.out.println("---------------");
				}

				break;

			case 5:
				encontrado = false;

				System.out.println("** Abeslari baten abesti berria gehitu **");
				System.out.println("---------------");
				System.out.println("Gehitu nahi duzun abestiaren izena sartu");
				abestia = sc.next();
				sc.nextLine();
				while (!encontrado && b < abestiList.size()) {
					if (abestia.equalsIgnoreCase(abestiList.get(b).getIzena())) {
						encontrado = true;
					}

					b++;
				}
				if (encontrado) {
					System.out.println("Abestia gure datu basean dago");
					System.out.println("---------------");
				} else {
					System.out.println("Ekoizlearen izena sartu");
					izena = sc.nextLine();
					while (!encontrado && r < meList.size()) {
						if (izena.equalsIgnoreCase(meList.get(r).getIzena())) {
							encontrado = true;
						}
						r++;
					}
					if (!encontrado) {
						System.out.println("Ekoizlea ez dago datu basean");
						System.out.println("---------------");
					} else {
						System.out.println("Abeslariaren NANa sartu:");
						nan = sc.next();
						while (encontrado && s < abList.size()) {
							if (nan.equalsIgnoreCase(abList.get(s).getNan())) {
								encontrado = false;
							}
							s++;
						}
						if (encontrado) {
							System.out.println("Abeslaria ez dago datu basean");
							System.out.println("---------------");
						} else {
							abestia abestiBerria = new abestia();
							sortu sBerria = new sortu();
							if (abestiList.size() == 0) {
								abestiBerria.setId(1);
							} else {
								abestiBerria.setId(abestiList.get(abestiList.size() - 1).getId() + 1);
							}
							abestiBerria.setIzena(abestia);
							while (!encontrado && q < meList.size()) {
								if (meList.get(q).getIzena().equalsIgnoreCase(izena)) {
									abestiBerria.setDni_ekoizlea(meList.get(q).getNan());
								}
								q++;
							}
							abestiList.add(abestiBerria);
							if (sList.size() == 0) {
								sBerria.setId(1);
							} else {
								sBerria.setId(sList.get(sList.size() - 1).getId() + 1);
							}
							sBerria.setId_abestia(abestiList.get(abestiList.size() - 1).getId());
							sBerria.setNan_abeslari(nan);
							sList.add(sBerria);

							System.out.println("abestia gehituta");
							System.out.println("---------------");
							abestiaa = true;
						}
					}
				}
				break;

			case 6:
				encontrado = false;
				for (abestia kont : abestiList) {
					System.out.println(kont);
				}
				for (abeslari kont : abList) {
					System.out.println(kont);
				}

				System.out.println("** Abesti baten abeslariak ikusi **");
				System.out.println("---------------");
				System.out.println("Abestiaren izena sartu: ");
				izenaa = sc.next();

				while (!encontrado && s < abestiList.size()) {
					if (izenaa.equalsIgnoreCase(abestiList.get(s).getIzena())) {
						encontrado = true;
						pos = s;
					}
					s++;
				}
				if (!encontrado) {
					System.out.println("Abestia ez dago gure datu basean");
					System.out.println("---------------");
				} else {
					for (int z = 0; z < sList.size(); z++) {
						if (abestiList.get(pos).getId() == sList.get(z).getId_abestia()) {
							abeslariak.add(sList.get(z).getNan_abeslari());
						}
					}
					for (int x = 0; x < abList.size(); x++) {

						if (abeslariak.contains(abList.get(x).getNan())) {
							System.out.println(abList.get(x).getIzena());
							System.out.println("---------------");
						}
					}

					
					
				}
				break;

			}
		} while (aukera != 0);
		if (musikaEkoizlea) {
			try {
				FileOutputStream fos = new FileOutputStream("users.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				musikaEkoizlea mmm = new musikaEkoizlea();
				for (int i = 0; i < meList.size(); i++) {
					mmm = meList.get(i);
					oos.writeObject(mmm);

				}
				System.out.println("Musika ekoizleen datuak gorde dira fitxategian");
				oos.close();
				fos.close();
			} catch (FileNotFoundException eah) {
				System.out.print("El archivo no existe");
				eah.printStackTrace();
			} catch (IOException eh) {
				System.out.print("El archivo no existe");
				eh.printStackTrace();
			}
		}
		if (abeslari) {
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/diskografika", "root", "");
				String consulta = "";
				Statement st = conexion.createStatement();

				consulta = "DELETE FROM diskografika.abeslari;";
				st.executeUpdate(consulta);

				String nanaa;
				String motaa;

				for (int i = 0; i < abList.size(); i++) {
					// meto a cada variable su valor
					nanaa = abList.get(i).getNan();
					motaa = abList.get(i).getMota();

					// genero la consulta a ejecutar

					consulta = "INSERT INTO abeslari VALUES ('" + nanaa + "','" + motaa + "')";
					// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				System.out.println("Abeslari datuak gorde dira datu basean");

				// cierro el statement despues de realizar la consulta
				st.close();
				// cierro la conexion
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion abeslari, artista");
			}
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/diskografika", "root", "");
				String consulta = "";
				Statement st = conexion.createStatement();

				consulta = "DELETE FROM diskografika.artista;";
				st.executeUpdate(consulta);

				String nanaaa;
				String izenaaa;
				int soldataaaa;
				String motaa;

				for (int i = 0; i < abList.size(); i++) {
					// meto a cada variable su valor
					nanaaa = abList.get(i).getNan();
					izenaaa = abList.get(i).getIzena();
					soldataaaa = abList.get(i).getSoldata();

					// genero la consulta a ejecutar

					consulta = "INSERT INTO artista VALUES ('" + nanaaa + "','" + izenaaa + "'," + soldataaaa + ")";
					// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				System.out.println("Artisten datuak gorde dira datu basean");

				// cierro el statement despues de realizar la consulta
				st.close();
				// cierro la conexion
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion artista");
			}
		}
		if (abestiaa) {
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/diskografika", "root", "");
				String consulta = "";
				Statement st = conexion.createStatement();

				consulta = "DELETE FROM diskografika.abestia";
				st.executeUpdate(consulta);

				int ida;
				String izenaaa;
				String dni_ekoizlea;

				for (int i = 0; i < abestiList.size(); i++) {
					// meto a cada variable su valor
					ida = abestiList.get(i).getId();
					izenaaa = abestiList.get(i).getIzena();
					dni_ekoizlea = abestiList.get(i).getDni_ekoizlea();

					// genero la consulta a ejecutar

					consulta = "INSERT INTO abestia VALUES (" + ida + ",'" + izenaaa + "','" + dni_ekoizlea + "')";
					// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				System.out.println("Abestien datuak gorde dira datu basean");

				// cierro el statement despues de realizar la consulta
				st.close();
				// cierro la conexion
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion abestia");
			}

			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/diskografika", "root", "");
				String consulta = "";
				Statement st = conexion.createStatement();

				consulta = "DELETE FROM diskografika.sortu";
				st.executeUpdate(consulta);

				int idaa;
				int id_abestia;
				String nan_abeslari;

				for (int i = 0; i < sList.size(); i++) {
					// meto a cada variable su valor
					idaa = sList.get(i).getId();
					id_abestia = sList.get(i).getId_abestia();
					nan_abeslari = sList.get(i).getNan_abeslari();

					// genero la consulta a ejecutar

					consulta = "INSERT INTO sortu VALUES (" + idaa + "," + id_abestia + ",'" + nan_abeslari + "')";
					// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				System.out.println("Sortu datuak gorde dira datu basean");

				// cierro el statement despues de realizar la consulta
				st.close();
				// cierro la conexion
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion sortu");
			}
		}
	}

}
