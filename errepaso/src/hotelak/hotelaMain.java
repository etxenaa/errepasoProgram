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

		String dniLogin, pasahitzaLogin, izenagorde = "", izenaH, izenBerria, hiriBerria, nanBerria, eraldatu,
				pasahitzBerria, zerbitzuBerria, berrirosaiatu, aukera2;
		int aukera = 0, konta = 3, idhotel, motaBerria, idlogela, idHotel = 0, pos = 0;
		boolean hotelencontrado = false, pasahitzaencontrado = false, hotelañadido = false, encontrado = false,
				entrar = false, erarepe = false, erabiltzaileencontrado = false, okupatuta = false, logelaencontrado,
				nanencontrado = false;
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
				pos = kont;
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
						System.out.println("////////////// ");
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
									do {
										System.out.println("Zein nan jarri nahi diozu? ");
										nanBerria = sc.next();
										hList.get(k).setHiria(hiriBerria);
										if (nanBerria.length() != 9) {
											System.out.println("9 karaketere soilik izan ahal ditu ");
										} else {
											hotelencontrado = true;
										}

									} while (nanBerria.length() != 9);
								}
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

						while (!erarepe) {
							erabiltzailea eBerria = new erabiltzailea();
							eBerria.irakurri(sc);
							if (er.contains(eBerria)) {
								System.out.println("Erabiltzaile hori existizen da.");
								System.out.println("Berriro sartu.");
							} else {
								erarepe = true;
								er.add(eBerria);
							}
						}
						break;
					case 6:
						System.out.println("/////////////// ");
						System.out.println("6-Erabiltzaileak ikusi");
						System.out.println("/////////////// ");

						for (erabiltzailea ekont : er) {
							ekont.pantailaratu();
						}
						break;
					case 7:
						System.out.println("/////////////// ");
						System.out.println("7-Erabiltzailea aldatu ");
						System.out.println("/////////////// ");

						encontrado = false;
						erabiltzaileencontrado = false;

						while (!erabiltzaileencontrado) {
							System.out.println("Zein erabiltzaile aldatu nahi duzu? Sartu izena");
							eraldatu = sc.next();
							for (int f = 0; f < er.size(); f++) {
								if (er.get(f).getIzena().equalsIgnoreCase(eraldatu)) {
									do {
										System.out.println("Sartu DNI-a: ");
										nanBerria = sc.next();
										if (nanBerria.length() != 9) {
											System.out.println("DNI-ak 9 karaktere soilik izan ahal ditu");
										}
									} while (nanBerria.length() != 9);
									er.get(f).setDni(nanBerria);
									System.out.println("Sartu izena: ");
									izenBerria = sc.next();
									er.get(f).setIzena(izenBerria);
									System.out.println("Sartu pasahitza: ");
									pasahitzBerria = sc.next();
									er.get(f).setPasahitza(pasahitzBerria);
									do {
										System.out.println("Sartu mota: ");
										motaBerria = sc.nextInt();

										if (motaBerria < 0 || motaBerria > 2) {
											System.out.println("Mota 0, 1 edo 2 izan behar da");
										}
									} while (motaBerria < 0 || motaBerria > 2);
									er.get(f).setTipo(motaBerria);
									erabiltzaileencontrado = true;
									System.out.println("Erabiltzailea ezabatu da");
								}
							}

							if (!erabiltzaileencontrado) {
								System.out.println(eraldatu + " izena duen erabiltzailerik ez da existitzen");
								System.out.println("Berriro saiatu nahi duzu? ");
								System.out.println("Bai / Ez ");
								aukera2 = sc.next();
								if (aukera2.equalsIgnoreCase("Ez")) {
									erabiltzaileencontrado = true;
								}
							}
						}

						break;
					case 8:
						System.out.println("/////////////// ");
						System.out.println("8-Erabiltzailea ezabatu ");
						System.out.println("/////////////// ");

						System.out.println("Zein erabiltzaile ezabatu nahi duzu? Sartu izena");
						eraldatu = sc.next();

						for (int f = 0; f < er.size(); f++) {
							if (er.get(f).getIzena().equalsIgnoreCase(eraldatu)) {
								er.remove(f);
								erabiltzaileencontrado = true;
								System.out.println("Erabiltzailea ezabatu da");
							}
						}

						if (!erabiltzaileencontrado) {
							System.out.println(eraldatu + " izena duen erabiltzailerik ez da existitzen");
						}
						break;

					}

				} while (aukera != 0);
			} else if (motagorde == 1) {
				do {
					System.out.println("");
					System.out.println("/////////////// ");
					System.out.println("**ZUZENDARIAREN MENUA**");
					System.out.println("/////////////// ");
					System.out.println("0-Irten ");
					System.out.println("1-Logela gehitu ");
					System.out.println("2-Ikusi logelak ");
					System.out.println("3-Logela aldatu ");
					System.out.println("4-Logela ezabatu ");

					aukera = sc.nextInt();

					switch (aukera) {
					case 1:
						System.out.println("/////////////// ");
						System.out.println("1-Logela gehitu ");
						System.out.println("/////////////// ");

						logelak lBerria = new logelak();
						lBerria.setId(lList.get(lList.size() - 1).getId() + 1);
						lBerria.irakurri(sc);
						lList.add(lBerria);
						break;
					case 2:
						System.out.println("/////////////// ");
						System.out.println("2-Logelak ikusi ");
						System.out.println("/////////////// ");

						for (logelak lkont : lList) {
							lkont.pantailaratu();
						}
						break;
					case 3:
						System.out.println("/////////////// ");
						System.out.println("3-Logela aldatu ");
						System.out.println("/////////////// ");
						logelaencontrado = false;
						while (!logelaencontrado) {
							System.out.println("Zein logela aldatu nahi duzu? Sartu logelaren id-a");
							idlogela = sc.nextInt();
							for (int l = 0; l < lList.size(); l++) {
								if (lList.get(l).getId() == idlogela) {
									idHotel = lList.get(l).getId_hotel();
									pos = l;
									logelaencontrado = true;
									System.out.println("Logelaren datuak aldatu dira ");
								}
							}
							if (logelaencontrado) {
								for (int h = 0; h < hList.size(); h++) {
									if (hList.get(h).getId() == idHotel) {
										if (hList.get(h).getNan_zuzendaria().equalsIgnoreCase(dniLogin)) {
											System.out.println("Sartu logelaren izena: ");
											izenBerria = sc.next();
											lList.get(pos).setIzena(izenBerria);
											System.out.println("Sartu logelaren zerbitzuak: ");
											zerbitzuBerria = sc.next();
											System.out.println("Okupatuta dago? ");
											okupatuta = sc.nextBoolean();
											logelaencontrado = true;
										} else {
											System.out.println("Logela hori ez da zure hotelekoa");
											System.out.println("Berriro saiatu? bai / ez");
											aukera2 = sc.next();
											if (aukera2.equalsIgnoreCase("bai")) {
												logelaencontrado = false;
											}
										}
									}
								}
							} else {
								System.out.println("Logela hori ez da existitzen");
								System.out.println("Berriro saiatu? bai / ez");
								aukera2 = sc.next();
								if (aukera2.equalsIgnoreCase("bai")) {
									logelaencontrado = false;
								}

							}
						}
						break;
					case 4:
						System.out.println("/////////////// ");
						System.out.println("4-Ezabatu logela ");
						System.out.println("/////////////// ");

						logelaencontrado = false;

						while (!logelaencontrado) {
							System.out.println("Zein logela aldatu nahi duzu? Sartu logelaren id-a");
							idlogela = sc.nextInt();
							for (int l = 0; l < lList.size(); l++) {
								if (lList.get(l).getId() == idlogela) {
									idHotel = lList.get(l).getId_hotel();
									pos = l;
									logelaencontrado = true;
								}
							}
							if (logelaencontrado) {
								for (int h = 0; h < hList.size(); h++) {
									if (hList.get(h).getId() == idHotel) {
										if (hList.get(h).getNan_zuzendaria().equalsIgnoreCase(dniLogin)) {
											lList.remove(pos);
											logelaencontrado = true;
											System.out.println(lList.get(pos).getIzena() + " logela ezabatu da");
										} else {
											System.out.println("Logela hori ez da zure hotelekoa");
											System.out.println("Berriro saiatu? bai / ez");
											aukera2 = sc.next();
											if (aukera2.equalsIgnoreCase("bai")) {
												logelaencontrado = false;
											}
										}
									}
								}
							} else {
								System.out.println("Logela hori ez da existitzen");
								System.out.println("Berriro saiatu? bai / ez");
								aukera2 = sc.next();
								if (aukera2.equalsIgnoreCase("bai")) {
									logelaencontrado = false;
								}
							}
						}

						break;
					case 0:

					}
				} while (aukera != 0);
			} else if (motagorde == 2) {
				do {
					System.out.println("");
					System.out.println("/////////////// ");
					System.out.println("**LANGILEAREN MENUA**");
					System.out.println("/////////////// ");
					System.out.println("0-Irten ");
					System.out.println("1-Logela gehitu ");
					System.out.println("2-Ikusi logelak ");
					System.out.println("3-Logela aldatu ");
					System.out.println("4-Logela ezabatu ");

					aukera = sc.nextInt();

				} while (aukera != 0);
			}

			if (hotelañadido || hotelencontrado) {
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelak", "root", "");
					String consulta = "";
					Statement st = conexion.createStatement();

					// kontsultak
					consulta = "DELETE FROM hotelak.hotela;";
					st.executeUpdate(consulta);

					// bezero
					int id;
					String izena;
					String hiria;
					String nan_zuzendaria;

					for (int i = 0; i < hList.size(); i++) {
						// meto a cada variable su valor
						id = hList.get(i).getId();
						izena = hList.get(i).getIzena();
						hiria = hList.get(i).getHiria();
						nan_zuzendaria = hList.get(i).getNan_zuzendaria();
						
						// genero la consulta a ejecutar
						consulta = "INSERT INTO hotela VALUES ('" + id + "','" + izena + "','" + hiria
								+ "','" + nan_zuzendaria + "');";
						// ejecuto la consulta
						st.executeUpdate(consulta);
					}

					// cierro el statement despues de realizar la consulta
					st.close();
					// cierro la conexion
					conexion.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					System.out.println("Error de conexion hegaldia");
				}
			}

		}

	}

}
