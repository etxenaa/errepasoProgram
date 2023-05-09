package futbolistaAriketa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class futbolistasSerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		futbolistas f1 = new futbolistas("11111111A", "Antonio", "Rodelgo", 40000000, 1);
		
		try {
			FileOutputStream fos = new FileOutputStream("futbolistas.dat");
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
