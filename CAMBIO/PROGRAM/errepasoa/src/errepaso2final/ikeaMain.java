package errepaso2final;

import java.util.ArrayList;
import java.util.Scanner;

public class ikeaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList erosketa = new ArrayList();

		String izena;
		int kop = 0, pos = 0, prezioa = 0, prezioaFinal = 0, aukera = 0;
		boolean encontrado = false, compraecha = false;

		katalogoa p = new katalogoa();

		p.fillData();
		p.stockpositiboa();

		while (!encontrado) {
			System.out.println("");
			System.out.println("Erosi nahi duzun produktuaren izena sartu-->");
			izena = sc.next();
			if (p.produktuPosizioa(izena) != -1) {
				encontrado = true;
				pos = p.produktuPosizioa(izena);
			}
			if (!encontrado) {
				System.out.println("Produktu hori ez dago gure katalogoan");
			} else {
				if (p.getLista().get(pos).getStock() == 0) {
					System.out.println("Ez dago katalogoan");
					encontrado = false;
				} else {
					do {
						System.out.println("Zenbat erosi nahi dituzu?");
						kop = sc.nextInt();
						if (kop > p.getLista().get(pos).getStock()) {
							System.out.println("Ez daude hainbeste produktu");
							System.out.println(
									p.getLista().get(pos).getStock() + " ale baino ez dira geratzen. Sartu berriro");
							encontrado = false;
						} else {
							encontrado = true;
						}
					} while (!encontrado);
					p.getLista().get(pos).setStock(p.getLista().get(pos).getStock() - kop);
					System.out.println("Erosketa egin da");
					prezioa = p.getLista().get(pos).getPrezioa() * kop;
					erosketa.add(izena);
					prezioaFinal = prezioaFinal + prezioa;
					compraecha = false;
					while (!compraecha) {
						System.out.println("Erosketa gehiago egin nahi dituzu? ");
						System.out.println("BAI=1 / EZ=0 ");
						aukera = sc.nextInt();
						if (aukera == 1) {
							encontrado = false;
							compraecha = true;
						} else if (aukera != 1 && aukera != 0) {
							System.out.println("Soilik 1 edo 0");
						} else {
							compraecha = true;
							encontrado = true;
						}
					}
					if (encontrado) {
						System.out.println("Erosketa: " + erosketa);
						System.out.println("Prezio finala--> " + prezioaFinal);
					}
				}
			}
		}
	}

}
