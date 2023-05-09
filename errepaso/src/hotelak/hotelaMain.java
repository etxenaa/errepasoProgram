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

		String erabiltzailea, pasahitza;

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

		ArrayList<hotela> hList = new ArrayList<hotela>();
		ArrayList<logelak> lList = new ArrayList<logelak>();
		ArrayList<bezeroa> bList = new ArrayList<bezeroa>();

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/hotelak", "root", "");
			Statement st = conexion.createStatement();
// bezeroen datuak
			ResultSet rs = st.executeQuery("SELECT * FROM hotelak.hotela;");
			while (rs.next()) {
				hotela hhh = new hotela(rs.getInt("id"), rs.getString("izena"), rs.getString("hiria"),
						rs.getString("nan_zuzendaria"));
				hList.add(hhh);
			}
// bazkideen datuak
			rs = st.executeQuery("SELECT * FROM hotelak.logelak;");
			while (rs.next()) {
				logelak lll = new logelak(rs.getInt("id"), rs.getString("izena"), rs.getString("zerbitzuak"),
						rs.getInt("id_hotel"), rs.getBoolean("okupatuta"));
				lList.add(lll);
			}
// ez bazkideen datuak
			rs = st.executeQuery("SELECT * FROM hotelak.bezeroa;");
			while (rs.next()) {
				bezeroa bbb = new bezeroa(rs.getString("dni"), rs.getString("izena"));
				bList.add(bbb);
			}

// konexioa ixten dugu
			rs.close();
			st.close();
			conexion.close();
		} catch (SQLException e) {
// si NO se ha conectado correctamente
			e.printStackTrace();
			System.out.println("Konexio errorea");
		}

		System.out.println("LOGIN");
		erabiltzailea erabiltzaileaLogin = new erabiltzailea();
		erabiltzaileaLogin.irakurri(sc);

	}

}