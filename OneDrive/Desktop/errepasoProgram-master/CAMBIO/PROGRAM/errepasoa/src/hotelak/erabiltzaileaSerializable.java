package hotelak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class erabiltzaileaSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		erabiltzailea e1 = new erabiltzailea("11111111A", "Lucas", "Lucas123", 0);
		erabiltzailea e11 = new erabiltzailea("11111111B", "Paco", "paquito", 0);
		erabiltzailea e2 = new erabiltzailea("11111111C", "Mario", "MarioBros", 1);
		erabiltzailea e22 = new erabiltzailea("11111111D", "Luis", "Luisfelipe", 1);
		erabiltzailea e3 = new erabiltzailea("11111111E", "Pepe", "PepeCalcetin", 2);
		erabiltzailea e33 = new erabiltzailea("11111111F", "Manolito", "manaolitogafotas", 2);
		
		try {
			FileOutputStream fos = new FileOutputStream("users.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(e11);
			oos.writeObject(e22);
			oos.writeObject(e33);
			oos.writeObject(e1);
			oos.writeObject(e2);
			oos.writeObject(e3);
			

			// cierro el fichero
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
