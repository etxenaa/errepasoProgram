package principal;

import java.util.Scanner;

public class CalcularLetraDNI {
	private static Scanner teclado = new Scanner(System.in);
    private static final char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
	public static void main(String[] args) {
		System.out.print("Introduce tu DNI sin letra: ");
		String dniSinLetra = teclado.next();
		System.out.print("Tu DNI con letra es: " + obtenerDNIyLetra(dniSinLetra));
	}
    public static String obtenerDNIyLetra(String dniSinLetra){
        int resto = Integer.valueOf(dniSinLetra) % 23;
        return dniSinLetra+letras[resto];
    }
}
