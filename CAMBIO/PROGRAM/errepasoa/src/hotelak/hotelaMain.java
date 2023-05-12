package hotelak;

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

public class hotelaMain {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<erabiltzailea> er = new ArrayList<erabiltzailea>();
		erabiltzailea e1 = new erabiltzailea();

		String dniLogin, pasahitzaLogin, izenagorde = "", izenaH, izenBerria, hiriBerria, nanBerria, eraldatu,
				pasahitzBerria, zerbitzuBerria, berrirosaiatu, aukera2, nana = null, dnicliente, dni_zuzendaria;
		boolean reservaencontrada = false, reservahecha = false, salir = false, salirr = true, hotelencontrado = false,
				pasahitzaencontrado = false, hotelañadido = false, encontrado = false, entrar = false, erarepe = false,
				erabiltzaileencontrado = false, logelaencontrado = false, nanencontrado = false, logelaañadido = false,
				existe = false, existereserva = false, okupatuta = false, clienteencontrado = false;
		int kont = 0, motagorde = 0, erreserbaberria, ida = 0, aukera = 0, konta = 3, idhotel, motaBerria, idlogela,
				idHotel = 0, pos = 0, posi = 0, erreserbaegin = 0;

		ArrayList<hotela> hList = new ArrayList<hotela>();
		ArrayList<logelak> lList = new ArrayList<logelak>();
		ArrayList<bezeroa> bList = new ArrayList<bezeroa>();
		ArrayList<erreserbak> eList = new ArrayList<erreserbak>();

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
						rs.getInt("id_hotel"), rs.getInt("okupatuta"));
				lList.add(lll);
			}
			rs = st.executeQuery("SELECT * FROM hotelak.erreserbak;");
			while (rs.next()) {
				erreserbak eee = new erreserbak(rs.getInt("id_reserva"), rs.getInt("id_logela"),
						rs.getString("dni_cliente"));
				eList.add(eee);
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
						do {
							System.out.println("Sartu zuzendariaren nan-a");
							dni_zuzendaria = sc.next();

							if (dni_zuzendaria.length() != 9) {
								System.out.println("NAN zenbakiak 9 karaktere soili izan ahal ditu");
								System.out.println("Saiatu berriro");
							}
							else {
								encontrado=true;
							}
						} while (dni_zuzendaria.length() != 9);
						
						
						
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
									System.out.println("" + "Zein hiri jarri nahi diozu? ");
									hiriBerria = sc.next();
									hList.get(k).setHiria(hiriBerria);

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

						erarepe = false;

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

						erabiltzaileencontrado = false;

						System.out.println("Zein erabiltzaile ezabatu nahi duzu? Sartu izena");
						eraldatu = sc.next();
						while (!erabiltzaileencontrado) {
							for (int ekont = 0; ekont < er.size(); ekont++) {
								if (er.get(ekont).getIzena().equalsIgnoreCase(eraldatu)) {
									erabiltzaileencontrado = true;
									er.remove(ekont);
									System.out.println(er.get(ekont).getIzena() + " erabiltzailea ezabatu da");
								}
							}
							if (!erabiltzaileencontrado) {
								System.out.println("Ez da erabiltzaile hori existitzen");
								System.out.println("Berriro saiatu nahi? Bai / Ez");
								aukera2 = sc.next();

								if (aukera2.equalsIgnoreCase("ez")) {
									erabiltzaileencontrado = true;
								}
							}
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
						if (lList.size() == 0) {
							lBerria.setId(10);
						} else {

							lBerria.setId(lList.get(lList.size() - 1).getId() + 1);
						}
						lBerria.setOkupatuta(0);
						lBerria.irakurri(sc);
						lList.add(lBerria);
						logelaañadido = true;
						break;
					case 2:
						System.out.println("/////////////// ");
						System.out.println("2-Logelak ikusi ");
						System.out.println("/////////////// ");
						System.out.println(lList.size());
						for (logelak lkont : lList) {
							lkont.pantailaratu();
						}
						break;
					case 3:
						System.out.println("/////////////// ");
						System.out.println("3-Logela aldatu ");
						System.out.println("/////////////// ");
						logelaencontrado = false;
						logelaañadido = false;
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
								for (int hkont = 0; hkont < hList.size(); hkont++) {
									if (idHotel == hList.get(hkont).getId()) {
										if (hList.get(hkont).getNan_zuzendaria().equalsIgnoreCase(dniLogin)) {
											System.out.println("Zein izen jarri nahi diozu logelari?");
											izenBerria = sc.next();
											lList.get(pos).setIzena(izenBerria);
											System.out.println("Zein zerbitzu jarri nahi dizkiozu?");
											zerbitzuBerria = sc.next();
											lList.get(pos).setZerbitzuak(zerbitzuBerria);
											lList.get(pos).setOkupatuta(0);
											System.out.println("Logelaren datuak aldatu dira ");
											logelaañadido = true;
										} else {
											System.out.println("Logela hori ez da zure hotelekoa.");
											hotelencontrado = false;
											System.out.println("Berriro saiatu? Bai/Ez");
											aukera2 = sc.next();
											if (aukera2.equalsIgnoreCase("ez")) {
												logelaencontrado = true;
											}
										}
									}
								}
							} else {
								System.out.println("Logela hori ez da existitzen");
								System.out.println("Berriro saiatu? Bai/Ez");
								aukera2 = sc.next();
								if (aukera2.equalsIgnoreCase("ez")) {
									logelaencontrado = true;
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
							System.out.println("Zein logela ezabatu nahi duzu? Sartu logelaren id-a");
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
											System.out.println("Logela ezabatu da");
											logelaañadido = true;
										} else {
											System.out.println("Logela hori ez da zure hotelekoa.");
											hotelencontrado = false;
											System.out.println("Berriro saiatu? Bai/Ez");
											aukera2 = sc.next();
											if (aukera2.equalsIgnoreCase("ez")) {
												logelaencontrado = true;
											} else {
												logelaencontrado = false;
											}
										}
									}
								}
							} else if (!logelaencontrado) {
								System.out.println("Logela hori ez da existitzen");
								System.out.println("Berriro saiatu? Bai/Ez");
								aukera2 = sc.next();
								if (aukera2.equalsIgnoreCase("ez")) {
									logelaencontrado = true;
								}
							}
						}

						break;

					}
				} while (aukera != 0);
			} else if (motagorde == 2) {
				do {
					System.out.println("");
					System.out.println("/////////////// ");
					System.out.println("**LANGILEAREN MENUA**");
					System.out.println("/////////////// ");
					System.out.println("0-Irten ");
					System.out.println("1-Erreserba egin ");
					System.out.println("2-Ikusi erreserbak ");
					System.out.println("3-Erreserba ezabatu ");
					System.out.println("4-Ikusi logelak ");

					aukera = sc.nextInt();

					switch (aukera) {
					case 1:
						System.out.println("/////////////// ");
						System.out.println("1-Erreserba egin ");
						System.out.println("/////////////// ");

						salir = false;

						while (!salir) {
							existe = false;
							clienteencontrado = false;

							System.out.println("Zein logela erreserbatu nahi duzu? Sartu logelaren id-a");
							erreserbaberria = sc.nextInt();

							for (int l = 0; l < lList.size(); l++) {
								if (erreserbaberria == lList.get(l).getId()) {
									existe = true;
									pos = l;
								}
							}
							if (!existe) {
								System.out.println("Logela hori ez da existitzen");
								salir = true;
							} else {
								if (lList.get(pos).getOkupatuta() == 1) {
									System.out.println("Logela hori erreserbatuta dago");
									salir = true;
								} else {
									erreserbak berria = new erreserbak();
									if (eList.size() == 0) {
										berria.setId_erreserba(1);
									} else {
										berria.setId_erreserba(eList.get(eList.size() - 1).getId_logela() + 1);
									}
									berria.setId_logela(erreserbaberria);
									System.out.println("Sartu bezeroaren dni-a");
									dnicliente = sc.next();
									for (int b = 0; b < bList.size(); b++) {
										if (dnicliente.equalsIgnoreCase(bList.get(b).getDni())) {
											clienteencontrado = true;
										}
									}
									if (clienteencontrado) {
										berria.setDni_cliente(dnicliente);
									} else {
										System.out.println("Bezero baten dni-a sartu behar duzu");
										salir = true;
									}
									eList.add(berria);
									lList.get(pos).setOkupatuta(1);
									System.out.println("Erreserba ondo egin da");
									reservahecha = true;
									logelaañadido = true;
									salir = true;
								}
							}

						}
						break;
					case 2:
						System.out.println("/////////////// ");
						System.out.println("2-Ikusi erreserbak ");
						System.out.println("/////////////// ");
						for (erreserbak ekont : eList) {
							ekont.pantailaratu();
						}
						break;

					case 3:
						System.out.println("/////////////// ");
						System.out.println("3-Erreserba ezabatu ");
						System.out.println("/////////////// ");

						salir = false;

						while (!salir) {

							existe = false;
							logelaencontrado = false;
							reservaencontrada = false;

							System.out.println("Zein erreserba ezabatu nahi duzu? Sartu logelaren id-a");
							erreserbaberria = sc.nextInt();
							for (int e = 0; e < eList.size(); e++) {
								if (erreserbaberria == eList.get(e).getId_logela()) {
									reservaencontrada = true;
									eList.remove(e);
								}
							}
							if (reservaencontrada) {
								for (int l = 0; l < lList.size(); l++) {
									if (erreserbaberria == lList.get(l).getId()) {
										lList.get(l).setOkupatuta(0);
										System.out.println("Erreserba ezabatu da");
										salir = true;
										reservahecha = true;
										logelaañadido = true;
									}
								}
							} else {
								salir = true;
							}
						}
						break;
					case 4:
						System.out.println("/////////////// ");
						System.out.println("4-Ikusi logelak ");
						System.out.println("/////////////// ");

						for (logelak lkont : lList) {
							lkont.pantailaratu();
						}
						break;
					}

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
						consulta = "INSERT INTO hotela VALUES (" + id + ",'" + izena + "','" + hiria + "','"
								+ nan_zuzendaria + "');";
						// ejecuto la consulta
						st.executeUpdate(consulta);
					}
					System.out.println("Hoteleko datuak gorde dira datu basean");

					// cierro el statement despues de realizar la consulta
					st.close();
					// cierro la conexion
					conexion.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					System.out.println("Error de conexion hotelak");
				}
			}

			else if (erarepe || erabiltzaileencontrado) {
				try {
					FileOutputStream fos = new FileOutputStream("users.dat");
					ObjectOutputStream oos = new ObjectOutputStream(fos);

					erabiltzailea eee = new erabiltzailea();
					for (int i = 0; i < er.size(); i++) {
						eee = er.get(i);
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

			else if (logelaañadido) {
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelak", "root", "");
					String consulta = "";
					Statement st = conexion.createStatement();

					consulta = "DELETE FROM hotelak.logelak;";
					st.executeUpdate(consulta);

					int id;
					String izena;
					String zerbitzuak;
					int okupatua;
					int id_hotel;

					for (int i = 0; i < lList.size(); i++) {
						// meto a cada variable su valor
						id = lList.get(i).getId();
						izena = lList.get(i).getIzena();
						zerbitzuak = lList.get(i).getZerbitzuak();
						id_hotel = lList.get(i).getId_hotel();
						okupatua = lList.get(i).getOkupatuta();

						// genero la consulta a ejecutar

						consulta = "INSERT INTO logelak VALUES (" + id + ",'" + izena + "','" + zerbitzuak + "',"
								+ id_hotel + "," + okupatua + ")";
						// ejecuto la consulta
						st.executeUpdate(consulta);
					}
					System.out.println("Logelen datuak gorde dira datu basean");

					// cierro el statement despues de realizar la consulta
					st.close();
					// cierro la conexion
					conexion.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					System.out.println("Error de conexion logela");
				}
			}
			if (reservahecha) {
				try {
					Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelak", "root", "");
					String consulta = "";
					Statement st = conexion.createStatement();

					consulta = "DELETE FROM hotelak.erreserbak;";
					st.executeUpdate(consulta);

					int id_reserva;
					int id_logela;
					String dni_cliente;

					for (int i = 0; i < eList.size(); i++) {
						// meto a cada variable su valor
						id_reserva = eList.get(i).getId_erreserba();
						id_logela = eList.get(i).getId_logela();
						dni_cliente = eList.get(i).getDni_cliente();

						// genero la consulta a ejecutar

						consulta = "INSERT INTO erreserbak VALUES (" + id_reserva + ",'" + id_logela + "','"
								+ dni_cliente + "')";
						// ejecuto la consulta
						st.executeUpdate(consulta);
					}
					System.out.println("Erreserben datuak gorde dira datu basean");

					// cierro el statement despues de realizar la consulta
					st.close();
					// cierro la conexion
					conexion.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
					System.out.println("Error de conexion logela");
				}
			}

		}

	}

}
