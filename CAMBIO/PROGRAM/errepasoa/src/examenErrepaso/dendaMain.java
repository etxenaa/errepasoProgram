package examenErrepaso;

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

import hotelak.bezeroa;
import hotelak.erabiltzailea;
import hotelak.erreserbak;
import hotelak.hotela;
import hotelak.logelak;

public class dendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean encontrado = false;
		int b = 0;
		String aukera, izena = "";

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
				erosketa lll = new erosketa(rs.getInt("idCompra"), rs.getInt("idOrdenador"), rs.getString("dni	"),
						rs.getInt("cantidad"));
				eList.add(lll);
			}
			rs = st.executeQuery("SELECT * FROM tienda.ordenador;");
			while (rs.next()) {
				ordenador eee = new ordenador(rs.getInt("id"), rs.getString("nombre"),
						rs.getString("caracteristicas"), rs.getInt("precio"), rs.getInt("stock"));
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
				encontrado = true;
			} else {
				System.out.println("Saiatu berriro");
			}
		}

		if (encontrado){
			System.out.println("Ongi etorri " + izena);
			
			
		}
	}

}
