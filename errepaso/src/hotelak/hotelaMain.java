package hotelak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class hotelaMain {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<erabiltzailea> er = new ArrayList<erabiltzailea>();
		erabiltzailea e1 = new erabiltzailea();

		String dniLogin, pasahitzaLogin, izenagorde = "", izenaH, izenBerria, hiriBerria, nanBerria;
		int aukera = 0, konta = 3, idhotel;
		boolean hotelencontrado = false, pasahitzaencontrado = false, hotelañadido = false, encontrado = false, entrar=false;
		int kont = 0, motagorde = 0;

		ArrayList<hotela> hList = new ArrayList<hotela>();
		ArrayList<logelak> lList = new ArrayList<logelak>();
		ArrayList<bezeroa> bList = new ArrayList<bezeroa>();

		try {
			FileInputStream fis = new FileInputStream("users.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				e1 = (erabiltzailea) ois.readObject();
				er.add(e1);
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
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelak", "root", "");
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hotelak.hotela;");
			while (rs.next()) {
				hotela hhh = new hotela(rs.getInt("id"), rs.getString("izena"), rs.getString("hiria"),
						rs.getString("nan_zuzendaria"));
				hList.add(hhh);
			}
			rs = st.executeQuery("SELECT * FROM hotelak.logelak;");
			while (rs.next()) {
				logelak lll = new logelak(rs.getInt("id"), rs.getString("izena"), rs.getString("zerbitzuak"),
						rs.getInt("id_hotel"), rs.getBoolean("okupatuta"));
				lList.add(lll);
			}
			rs = st.executeQuery("SELECT * FROM hotelak.bezeroa;");
			while (rs.next()) {
				bezeroa bbb = new bezeroa(rs.getString("dni"), rs.getString("izena"));
				bList.add(bbb);
			}

			rs.close();
			st.close();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Konexio errorea");
		}

		System.out.println("LOGIN");

		System.out.println("Sartu zure DNI-a ");
		dniLogin = sc.nextLine();
		System.out.println("Sartu zure pasahitza ");
		pasahitzaLogin = sc.nextLine();

		while (!encontrado && kont < er.size()) {
			if (er.get(kont).getDni().equalsIgnoreCase(dniLogin)) {
				int pos = kont;
				while (!pasahitzaencontrado && !(konta == 0)) {
					if (er.get(pos).getPasahitza().equalsIgnoreCase(pasahitzaLogin)) {
						encontrado = true;
						pasahitzaencontrado = true;
						izenagorde = er.get(pos).getIzena();
						motagorde = er.get(pos).getTipo();
					} else {
						System.out.println("Pasahitza txarto dago");
						konta--;
						System.out.println(konta + " saiakera dituzu");
						if (konta == 0) {
							System.out.println("--AGUR--");
							System.exit(0);
						}
						System.out.println("Sartu berriro pasahitza.");
						pasahitzaLogin = sc.nextLine();
						if (er.get(pos).getPasahitza().equalsIgnoreCase(pasahitzaLogin)) {
							pasahitzaencontrado = true;
							encontrado = true;
							izenagorde = er.get(pos).getIzena();
							motagorde = er.get(pos).getTipo();
						}

					}
				}
			} else {
				kont++;
			}
		}

		if (!encontrado) {
			System.out.println("Ez da existitzen");
		} else {
			System.out.println("Kaixo " + izenagorde);

			if (motagorde == 0) {

				do {
					System.out.println("");
					System.out.println("/////////////// ");
					System.out.println("**ADMINISTRARIAREN MENUA**");
					System.out.println("/////////////// ");
					System.out.println("0-Irten ");
					System.out.println("1-Hotela gehitu ");
					System.out.println("2-Ikusi hotelak ");
					System.out.println("3-Hotela aldatu ");
					System.out.println("4-Hotela ezabatu ");
					System.out.println("5-Erabiltzailea gehitu ");
					System.out.println("6-Ikusi erabiltzaileak ");
					System.out.println("7-Erabiltzailea aldatu ");
					System.out.println("8-Erabiltzailea ezabatu ");

					aukera = sc.nextInt();

					switch (aukera) {

					case 1:
						System.out.println("/////////////// ");
						System.out.println("1-Hotela gehitu ");
						System.out.println("/////////////// ");
						hotela hBerria = new hotela();
						hBerria.setId(hList.get(hList.size() - 1).getId() + 1);
						hBerria.irakurri(sc);
						hList.add(hBerria);
						hotelañadido = true;
						break;
					case 2:
						for (hotela kontH : hList) {
							kontH.pantailaratuHotelak();
						}
						break;
					case 3:
						System.out.println("/////////////// ");
						System.out.println("3-Hotela aldatu ");
						System.out.println("/////////////// ");

						hotelencontrado = false;
						while (!hotelencontrado) {
							System.out.println("Zein hotel aldatu nahi duzu? Sartu hotelaren Id-a");
							idhotel = sc.nextInt();
							for (int k = 0; k < hList.size(); k++) {
								if (hList.get(k).getId() == idhotel) {
									System.out.println("Zein izen jarri nahi diozu? ");
									izenBerria = sc.next();
									hList.get(k).setIzena(izenBerria);
									System.out.println("Zein hiri jarri nahi diozu? ");
									hiriBerria = sc.next();
									hList.get(k).setHiria(hiriBerria);
									System.out.println("Zein nan jarri nahi diozu? ");
									nanBerria = sc.next();
									hList.get(k).setNan_zuzendaria(nanBerria);
//									if (izenaH.equalsIgnoreCase("Bai")) {
//										System.out.println("Zein izen jarri nahi diozu? ");
//										izenBerria = sc.next();
//										hList.get(k).setIzena(izenBerria);
//										System.out.println("Izena aldatu da");
//										System.out.println("Hiria aldatu nahi diozu? Bai/Ez");
//										izenaH = sc.next();
//									} else if (izenaH.equalsIgnoreCase("Ez") || izenaH.equalsIgnoreCase("Bai")) {
//										if (izenaH.equalsIgnoreCase("Bai")) {
//											System.out.println("Zein hiri jarri nahi diozu? ");
//											hiriBerria = sc.next();
//											hList.get(k).setIzena(hiriBerria);
//											System.out.println("Hiria aldatu da");
//											System.out.println("Zuzendariaren nan aldatu nahi diozu? Bai/Ez");
//											izenaH = sc.next();
//										} else if (izenaH.equalsIgnoreCase("Ez") || izenaH.equalsIgnoreCase("Bai")) {
//											if (izenaH.equalsIgnoreCase("Bai")) {
//												System.out.println("Zein nan jarri nahi diozu? ");
//												nanBerria = sc.next();
//												hList.get(k).setNan_zuzendaria(nanBerria);
//												System.out.println("Nan-a aldatu da");
//											}
//										}
//									}

									hotelencontrado = true;
								}
								
							}
							
							if(!hotelencontrado) {
								System.out.println("Hotel hori ez da existitzen.");
								System.out.println("Berriro saiatu nahi duzu? Bai / Ez");
								String aukera2=sc.next();
								if(aukera2.equalsIgnoreCase("ez")) {
									hotelencontrado=true;
								}
							}
							
							else {
								System.out.println("Hotelaren datuak aldatu dira");
							}
						}
						break;
					case 4:
						System.out.println("/////////////// ");
						System.out.println("4-Hotela ezabatu ");
						System.out.println("/////////////// ");

						hotelencontrado = false;
						while (!hotelencontrado) {
							System.out.println("Zein hotel ezabatu nahi duzu? Sartu hotelaren Id-a");
							idhotel = sc.nextInt();
							for (int i = 0; i < hList.size(); i++) {
								if (hList.get(i).getId() == idhotel) {
									System.out.println(hList.get(i).getIzena() + " hotela ezabatu da");
									hList.remove(i);
									hotelencontrado = true;
								} else if (idhotel == 0) {
									hotelencontrado = true;
								}
							}

							if (!hotelencontrado) {
								System.out.println("Hotela ez da existitzen");
								System.out.println("Saiatu berriro. Irten nahi baduzu jarri 0");
							}

						}
						break;
					case 5:
						System.out.println("/////////////// ");
						System.out.println("5-Erabiltzailea gehitu ");
						System.out.println("/////////////// ");
						
						erabiltzailea eBerria = new erabiltzailea();
						eBerria.irakurri(sc);
						if(er.contains(eBerria)) {
								System.out.println("Erabiltzaile hori existizen da.");
						}
						er.add(eBerria);
						
						break;
					case 6:
						break;
					case 7:
						break;
					case 8:
						break;

					}

				} while (aukera != 0);
			} else if (motagorde == 1) {

			} else if (motagorde == 2) {

			}
		}

	}

}