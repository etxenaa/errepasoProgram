package hotelak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class erabiltzaileaSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		erabiltzailea e1 = new erabiltzailea("111111111A", "Lucas", "Lucas123", 1);
		erabiltzailea e2 = new erabiltzailea("111111111B", "Mario", "MarioBros", 1);
		erabiltzailea e3 = new erabiltzailea("111111111C", "Pepe", "PepeCalcetin", 2);
		
		try {
			FileOutputStream fos = new FileOutputStream("users.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
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
