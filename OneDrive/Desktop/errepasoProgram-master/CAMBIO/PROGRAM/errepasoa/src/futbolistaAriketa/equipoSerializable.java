package futbolistaAriketa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class equipoSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equipo e1 = new equipo(1, "Athletic", "Bilbao");
		
		try {
			FileOutputStream fos = new FileOutputStream("equipo.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			// lo grabo
			oos.writeObject(e1);
			

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
