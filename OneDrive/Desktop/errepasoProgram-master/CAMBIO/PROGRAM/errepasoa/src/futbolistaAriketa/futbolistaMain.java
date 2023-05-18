package futbolistaAriketa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class futbolistaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		futbolistas f1 = new futbolistas();
		equipo e1 = new equipo();
		
		ArrayList<futbolistas> fList = new ArrayList<futbolistas>();
		ArrayList<equipo> eList = new ArrayList<equipo>();
		
		try {
			FileInputStream fis = new FileInputStream("equipo.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				e1 = (equipo) ois.readObject();
				eList.add(e1);
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
			FileInputStream fis = new FileInputStream("futbolistas.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				f1 = (futbolistas) ois.readObject();
				fList.add(f1);
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
		
		
		int aukera=0;
		boolean futbolistaAñadido=false, equipoAñadido=false;
		
		do {
			System.out.println("--MENU--");
			System.out.println("1-Ver futbolistas-");
			System.out.println("2-Ver equipo-");
			System.out.println("3-Añadir futbolistas-");
			System.out.println("4-Añadir equipo-");
			System.out.println("0-Irten-");
			
			aukera = sc.nextInt();
			
			switch(aukera) {
			
			case 1:
				System.out.println("1-Ver futbolistas-");
				for(futbolistas kont:fList) {
					kont.pantailaratu();
				}
				System.out.println("");
				System.out.println("");
				break;
				
			case 2:
				System.out.println("2-Ver equipo-");
				for(equipo kont:eList) {
					kont.pantailaratu();
				}
				System.out.println("");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("3-Añadir futbolistas-");
				
				futbolistas fBerria = new futbolistas();
				
				fBerria.irakurri(sc);
				
				fList.add(fBerria);
				
				futbolistaAñadido=true;
				
				System.out.println("");
				System.out.println("");
				break;
				
			case 4:
				System.out.println("4-Añadir equipo-");
				
				equipo eBerria = new equipo();
				
				eBerria.irakurri(sc);
				
				eList.add(eBerria);
				
				equipoAñadido=true;
				
				System.out.println("");
				System.out.println("");
				break;
				
			case 0:
				if(equipoAñadido) {
					
					try {
						FileOutputStream fos = new FileOutputStream("equipo.dat");
						ObjectOutputStream oos = new ObjectOutputStream(fos);

						equipo eee = new equipo();
						for (int i = 0; i < eList.size(); i++) {
							eee = eList.get(i);
							oos.writeObject(eee);
						}

						oos.close();
						fos.close();
					} catch (FileNotFoundException eah) {
						System.out.print("El archivo no existe");
						eah.printStackTrace();
					} catch (IOException eh) {
						System.out.print("El archivo no existe");
						eh.printStackTrace();
					}
					System.out.println("Cambios en el fichero de equipos");
					
					System.out.print("Cerrando el programa...");
					System.out.print("Adios!!!");
					System.exit(0);
				}
				
				else if(futbolistaAñadido) {
					try {
						FileOutputStream fos = new FileOutputStream("futbolistas.dat");
						ObjectOutputStream oos = new ObjectOutputStream(fos);

						futbolistas fff = new futbolistas();
						for (int i = 0; i < fList.size(); i++) {
							fff = fList.get(i);
							oos.writeObject(fff);
						}

						oos.close();
						fos.close();
					} catch (FileNotFoundException eah) {
						System.out.print("El archivo no existe");
						eah.printStackTrace();
					} catch (IOException eh) {
						System.out.print("El archivo no existe");
						eh.printStackTrace();
					}
					
					System.out.println("Cambios en el fichero de futbolistas");
					
					System.out.print("Cerrando el programa...");
					System.out.print("Adios!!!");
					System.exit(0);
					
				}
				
				else {
					System.out.println("Sin cambios en ninguno de los ficheros");
					
					System.out.print("Cerrando el programa...");
					System.out.print("Adios!!!");
					System.exit(0);
					
				}
				
			}
		}while(aukera!=0);
	}

}
