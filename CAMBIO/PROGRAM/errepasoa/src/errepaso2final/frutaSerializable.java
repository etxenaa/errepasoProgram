package errepaso2final;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class frutaSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fruta f1 = new fruta(1, "Sagarra", 1, 30);
		
		try {
			FileOutputStream fos = new FileOutputStream("fruta.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(f1);

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
