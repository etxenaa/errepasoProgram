package examenErrepaso;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class bezeroakSerializable {

	public static void main(String[] args) {

		bezeroak b1 = new bezeroak("antonio", "4321", 1);
		bezeroak b2 = new bezeroak("leire", "4321", 0);

		try {
			FileOutputStream fos = new FileOutputStream("users.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(b1);
			oos.writeObject(b2);

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