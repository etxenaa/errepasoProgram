package base;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		CaracteresNoPermitidos caracteresNoPermitidos = new CaracteresNoPermitidos("fichero^logs.txt");
		CaracteresNoPermitidos caracteresNoPermitidos2 = new CaracteresNoPermitidos("fichero*logs.txt");
		caracteresNoPermitidos.getNombreJuegoDeCaracteres();
		caracteresNoPermitidos2.getNombreJuegoDeCaracteres();
		caracteresNoPermitidos.setNombreJuegoDeCaracteres("fichero^logs.txt");
		caracteresNoPermitidos2.setNombreJuegoDeCaracteres("fichero*logs.txt");
		caracteresNoPermitidos.getCaracteres();
		caracteresNoPermitidos2.getCaracteres();
		caracteresNoPermitidos.setCaracteres(null);
		caracteresNoPermitidos2.setCaracteres(null);
		nombreValido(caracteresNoPermitidos, caracteresNoPermitidos2);
		nombreValido(caracteresNoPermitidos2, caracteresNoPermitidos2);
		
	}

	
	
	
	
	
	
	
	
	private boolean nombreValido(CaracteresNoPermitidos caracteresNoPermitidos2, Caracteres caracteresNoPermitidos) {
		// TODO Auto-generated method stub
		boolean nombreValido = true;
		for (String caracter : caracteresNoPermitidos.getCaracteres()) {
			String nombre_fichero = null;
			if (nombre_fichero.contains(caracter)) {
				nombreValido = false;
			}
		}
		return nombreValido;
	}

}
