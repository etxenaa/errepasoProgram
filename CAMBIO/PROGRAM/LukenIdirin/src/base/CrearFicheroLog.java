package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class CrearFicheroLog{

	private static Scanner teclado = new Scanner(System.in);

	private static CaracteresNoPermitidos caracteresNoPermitidos = new CaracteresNoPermitidos("Caracteres No Permitidos");
	
	public static void main(String[] args) {

		System.out.println("Este programa crea un fichero de log con el nombre introducido por el usuario.");

		String nombre_fichero = null;

		do {
			System.out.println("Introduce nombre del fichero: ");
			nombre_fichero = teclado.next();
		} while (!nombreValido(nombre_fichero));

		// TODO Configuraci�n inicial del ficheros de log: (dentro del m�todo
		// configurarLog)
		
		try {
            FileHandler fileHandler = new FileHandler("./ficheroLogLuken.log");
        } catch (IOException exception) {
            
        }
		configurarLog(nombre_fichero);

		String textoFichero = null;
		System.out.println("Introduce el texto que quieres introducir en el fichero de log: ");
		textoFichero = teclado.next();
		
		//prueba para ver que muestra
		System.out.println(nombre_fichero+" "+textoFichero);
		
		//TODO guardar el texto en el fichero de log

	}

	/**
	 * Crea un boolean con valor true, en un for llama a caracteresNoPermitidos
	 * y comprueba si todos los caracteres de nombre_fichero son validos, si alguno
	 * de los caracteres del nombre coincide con alguno de CaracteresNoPermitidos
	 * el boolean pasara a ser false y el metodo devolvera nombreValido como false,
	 * en cambio si recorre todo el for y ningun caracter coincide con un caracter no
	 * permitido, el metodo devolvera nombreValido como true, afirmando la validez del nombre
	 * @author luken
	 * @param nombreValido, caracter, nombre_fichero
	 * @return nombreValido
	 */
	public static boolean nombreValido(String nombre_fichero) {
		boolean nombreValido = true;
		for (String caracter : caracteresNoPermitidos.getCaracteres()) {
			if (nombre_fichero.contains(caracter)) {
				nombreValido = false;
			}
		}
		return nombreValido;
	}

	public static void configurarLog(String nombre_fichero) {

	}
}
