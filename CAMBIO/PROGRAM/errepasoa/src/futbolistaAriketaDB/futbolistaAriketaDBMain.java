package futbolistaAriketaDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class futbolistaAriketaDBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		futbolistas ffff = new futbolistas();
		equipo eeee = new equipo();
		
		ArrayList<futbolistas> fuList = new ArrayList<futbolistas>();
		ArrayList<equipo> eqList = new ArrayList<equipo>();
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/futbol", "root", "");
			Statement st = conexion.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM futbol.futbolistas;");
			while (rs.next()) {
				futbolistas fff = new futbolistas(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellido"), rs.getInt("salario"), rs.getInt("idEquipo"));
				fuList.add(fff);
			}
			rs = st.executeQuery("SELECT * FROM futbol.equipos;");
			while (rs.next()) {
				equipo eee = new equipo(rs.getInt("idEquipo"), rs.getString("nombre"), rs.getString("ciudad"));
				eqList.add(eee);
			}

			rs.close();
			st.close();
			conexion.close();
		} catch (SQLException e) {

			e.printStackTrace();
			System.out.println("Konexio errorea");
		}
		
		int aukera=0, idBerria=0;
		boolean equipoAñadido=false, futbolistaAñadido=false;
		
		do {
			try {
				System.out.println("0- Irten");
				System.out.println("1- Ver futbolistas");
				System.out.println("2- Ver equipos");
				System.out.println("3- Añadir futbolistas");
				System.out.println("4- Añadir equipos");
				

				aukera = sc.nextInt();
			} catch (InputMismatchException error) {
				System.out.println("Zenbaki bat bakarrik sartu ahal da. ");
			}
			switch (aukera) {
			case 1:
				System.out.println("Ver futbolistas.");
				
				System.out.println("-----");
				
				for(futbolistas kont:fuList) {
					kont.pantailaratu();
				}
				break;

			case 2:
				System.out.println("Ver equipos.");
				
				System.out.println("-----");
				
				for(equipo kont:eqList) {
					kont.pantailaratu();
				}
				break;

			case 3:
				System.out.println("Añadir futbolista.");
				
				System.out.println("-----");
				
				futbolistas fBerria=new futbolistas();
				fBerria.irakurri(sc);
				fuList.add(fBerria);
				
				futbolistaAñadido=true;
				break;

			case 4:
				System.out.println("Añadir equipo.");
				
				System.out.println("-----");
				
				equipo eBerria = new equipo();
				eBerria.setIdEquipo(eqList.get(eqList.size()-1).getIdEquipo()+1);
				eBerria.irakurri(sc);
						
				eqList.add(eBerria);
				
				equipoAñadido=true;
				break;

			case 0:
	}
	}while(aukera!=0);
		
		if(equipoAñadido) {
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/futbol", "root", "");
				String consulta = "";

				Statement st = conexion.createStatement();
				consulta = "DELETE FROM futbol.equipos;";
				st.executeUpdate(consulta);

				int idEquipo;
				String nombre;
				String ciudad;

				for (int i = 0; i < eqList.size(); i++) {

					eeee = eqList.get(i);

					idEquipo = eeee.getIdEquipo();
					nombre = eeee.getNombre();
					ciudad = eeee.getCiudad();

					consulta = "insert into futbol.equipos values (" + idEquipo + ",'" + nombre + "','" + ciudad
							+ "');";

					st.executeUpdate(consulta);
				}

				st.close();

				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion");
			}

		}
		else if(futbolistaAñadido) {
			try {
				Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/futbol", "root", "");
				String consulta = "";

				Statement st = conexion.createStatement();
				consulta = "DELETE FROM futbol.futbolistas;";
				st.executeUpdate(consulta);

				String dni;
				String nombre;
				String apellido;
				int salario;
				int idEquipo;

				for (int i = 0; i < eqList.size(); i++) {

					ffff = fuList.get(i);

					dni = ffff.getDni();
					nombre = ffff.getNombre();
					apellido = ffff.getApellido();
					salario = ffff.getSalario();
					idEquipo = ffff.getIdEquipo();

					consulta = "insert into futbol.futbolistas values ('" + idEquipo + "','" + nombre + "','" + apellido
							+ "'," + salario + "," + apellido +");";

					st.executeUpdate(consulta);
				}

				st.close();

				conexion.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				System.out.println("Error de conexion");
			}
		}
		
}
}