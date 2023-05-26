package examenErrepaso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

import hotelak.bezeroa;
import hotelak.erabiltzailea;
import hotelak.erreserbak;
import hotelak.hotela;
import hotelak.logelak;

public class dendaMain {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean encontrado = false, dniencontrado = false, stockencontrado = false, compra = false,
				clienteañadido = false, ordenadorcambia = false;
		int b = 0, aukera = 0, mota = 0, idO = 0, stocka = 0, kop = 0, pos = 0, stock = 0;
		String izena = "", nana = "";

		bezeroak bb = new bezeroak();
		ArrayList<bezeroak> bList = new ArrayList<bezeroak>();
		ArrayList<ordenador> oList = new ArrayList<ordenador>();
		ArrayList<dendabezeroa> bdList = new ArrayList<dendabezeroa>();
		ArrayList<erosketa> eList = new ArrayList<erosketa>();

		try {
			FileInputStream fis = new FileInputStream("users.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				bb = (bezeroak) ois.readObject();
				bList.add(bb);
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error archivo no encontrado.");
		} catch (IOException ioe) {
			System.out.println("Error de Entradas / Salida");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("Error Clase No Encontrada");
		}

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM tienda.cliente;");
			while (rs.next()) {
				dendabezeroa hhh = new dendabezeroa(rs.getString("dni"), rs.getString("nombre"),
						rs.getString("apellido"));
				bdList.add(hhh);
			}
			rs = st.executeQuery("SELECT * FROM tienda.compra;");
			while (rs.next()) {
				erosketa lll = new erosketa(rs.getInt("idCompra"), rs.getInt("idOrdenador"), rs.getString("dni "),
						rs.getInt("cantidad"));
				eList.add(lll);
			}
			rs = st.executeQuery("SELECT * FROM tienda.ordenador;");
			while (rs.next()) {
				ordenador eee = new ordenador(rs.getInt("id"), rs.getString("nombre"), rs.getString("caracteristicas"),
						rs.getInt("precio"), rs.getInt("stock"));
				oList.add(eee);
			}

			rs.close();
			st.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Konexio errorea");
		}

		bezeroak login = new bezeroak();

		while (!encontrado) {
			login.irakurri(sc);
			sc.nextLine();
			if (bList.contains(login)) {
				izena = login.getUser();
				mota = login.getMota();
				encontrado = true;
			} else {
				System.out.println("Saiatu berriro");
			}
		}

		if (encontrado) {
			do {
				System.out.println("");
				System.out.println("Ongi etorri " + izena);

				System.out.println("Zer egin nahi duzu?????");
				System.out.println("0- Irten");
				System.out.println("1- Erabiltzaile bat gehitu");
				System.out.println("2- Bezeroak ikusi");
				System.out.println("3- Ordenagailuak ikusi");
				System.out.println("4- Erosketak ikusi");
				System.out.println("5- Ordenagailua gehitu");
				System.out.println("6- Erosketa bat egin");

				System.out.println("Aukeratu bat---->");
				aukera = sc.nextInt();

				switch (aukera) {
				case 1:
					bezeroak berria = new bezeroak();

					if (mota == 1) {
						System.out.println("Erabiltzaile berriaren datuak sortu");
						berria.irakurri(sc);
						if (berria.getMota() != 0 && berria.getMota() != 1) {
							System.out.println("Mota 0 edo 1 izan ahal da bakarrik");
						} else {
							bList.add(berria);
							System.out.println("Erabiltzailea gehitu da");
							clienteañadido = true;
						}
					} else {
						System.out.println("Ez dekozu baimenik");
					}
					break;
				case 2:
					for (dendabezeroa dbkont : bdList) {
						dbkont.pantailaratu();
					}
					break;
				case 3:
					for (ordenador okont : oList) {
						okont.pantailaratu();
					}
					break;
				case 4:
					for (erosketa ekont : eList) {
						ekont.pantailaratu();
					}
					break;
				case 5:
					ordenador oberria = new ordenador();
					oberria.irakurri(sc);
					if (oList.size() == 0) {
						oberria.setId(1);
					} else {
						oberria.setId(oList.get(oList.size() - 1).getId() + 1);
					}
					oList.add(oberria);
					System.out.println("Ordenagailua gorde da");
					ordenadorcambia = true;
					break;
				case 6:
					for (ordenador okont : oList) {
						okont.pantailaratu();
					}

					encontrado = false;
					dniencontrado = false;
					stockencontrado = false;

					while (!encontrado) {
						System.out.println("Zein ordenagailu erosi nahi duzu? Sartu id");
						idO = sc.nextInt();

						for (int i = 0; i < oList.size(); i++) {
							if (idO == oList.get(i).getId()) {
								encontrado = true;
								pos = i;
								stocka = oList.get(i).getStock();
							}
						}
					}
					if (!encontrado) {
						System.out.println("Ez da ordenagailua existitzen");
					}
					if (encontrado && stocka == 0) {
						System.out.println("Ezin da eskari hau egin, stock 0 da.");
						encontrado = false;
					}

					if (encontrado) {
						for (dendabezeroa dbkont : bdList) {
							dbkont.pantailaratu();
						}

						while (!dniencontrado) {
							System.out.println("Nor da bezeroa? ");
							System.out.println("Sartu nan--> ");
							nana = sc.next();
							for (int o = 0; o < bdList.size(); o++) {
								if (nana.equalsIgnoreCase(bdList.get(o).getNan())) {
									dniencontrado = true;
								}
							}

						}
						if (!dniencontrado) {
							System.out.println("Ez da dni-a existitzen");
						}
						while (dniencontrado && !stockencontrado) {
							System.out.println("Zenbat ordenagailu nahi dituzu? ");
							kop = sc.nextInt();
							if (kop > oList.get(pos).getStock()) {
								System.out.println(
										"Ezin da eskari hau egin " + oList.get(pos).getStock() + " ordenagailu ditugu");
							} else {
								stockencontrado = true;
							}
						}
						if (stockencontrado) {
							stock = oList.get(pos).getStock();
							oList.get(pos).setStock(stock - kop);
							erosketa eberria = new erosketa();
							if (eList.size() == 0) {
								eberria.setIdErosketa(1);
							} else {
								eberria.setIdErosketa(eList.get(eList.size() - 1).getIdErosketa() + 1);
							}
							eberria.setIdOrdenagailua(oList.get(pos).getId());
							eberria.setKopurua(kop);
							eberria.setNan(nana);
							eList.add(eberria);
							System.out.println("Ordenagailuaren stocka aldatu da");
							System.out.println("Eskerrik asko erosteagaitik");
							ordenadorcambia = true;
							compra = true;
						}
					}

					break;

				}

			} while (aukera != 0);
		}

		if (clienteañadido) {
			try {
				FileOutputStream fos = new FileOutputStream("users.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				bezeroak eee = new bezeroak();
				for (int i = 0; i < bList.size(); i++) {
					eee = bList.get(i);
					oos.writeObject(eee);

				}
				System.out.println("Erabiltzaileko datuak gorde dira fitxategian");
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

		if (ordenadorcambia) {
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
				String consulta = "";
				Statement st = conexion.createStatement();

				consulta = "DELETE FROM tienda.ordenador;";
				st.executeUpdate(consulta);

				int id;
				String nombre;
				String zerbitzuak;
				int prezioa;
				int stockk;

				for (int i = 0; i < oList.size(); i++) {
// meto a cada variable su valor
					id = oList.get(i).getId();
					nombre = oList.get(i).getIzena();
					zerbitzuak = oList.get(i).getEzaugarriak();
					prezioa = oList.get(i).getPrezioa();
					stock = oList.get(i).getStock();

// genero la consulta a ejecutar

					consulta = "INSERT INTO ordenador VALUES (" + id + ",'" + nombre + "','" + zerbitzuak + "',"
							+ prezioa + "," + stock + ")";
// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				System.out.println("Ordenagailuen datuak gorde dira datu basean");

// cierro el statement despues de realizar la consulta
				st.close();
// cierro la conexion
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion tienda");
			}
		}

		if (compra) {
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tienda", "root", "");
				String consulta = "";
				Statement st = conexion.createStatement();

				consulta = "DELETE FROM tienda.compra;";
				st.executeUpdate(consulta);

				int idCompra;
				int idOrdenador;
				String dni;
				int cantidad;

				for (int i = 0; i < eList.size(); i++) {
// meto a cada variable su valor
					idCompra = eList.get(i).getIdErosketa();
					idOrdenador = eList.get(i).getIdOrdenagailua();
					dni = eList.get(i).getNan();
					cantidad = eList.get(i).getKopurua();
// genero la consulta a ejecutar

					consulta = "INSERT INTO compra VALUES (" + idCompra + "," + idOrdenador + ",'" + dni + "',"
							+ cantidad + ")";
// ejecuto la consulta
					st.executeUpdate(consulta);
				}
				System.out.println("Erosketen datuak gorde dira datu basean");

// cierro el statement despues de realizar la consulta
				st.close();
// cierro la conexion
				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion tienda");
			}
		}
	}
}
