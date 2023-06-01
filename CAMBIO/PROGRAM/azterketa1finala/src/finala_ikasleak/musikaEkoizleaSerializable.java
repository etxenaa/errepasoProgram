package finala_ikasleak;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class musikaEkoizleaSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		musikaEkoizlea m1 = new musikaEkoizlea("12345678A", "Leire", "trap");
		musikaEkoizlea m2 = new musikaEkoizlea("87654321B", "Antonio", "pop");

		
		try {
			FileOutputStream fos = new FileOutputStream("musikaEkoizlea.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(m1);
			oos.writeObject(m2);

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
