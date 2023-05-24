package errepaso2final;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int i = 0, t = 0, g = 0, f = 0, posi = 0, e = 0, b = 0, pos = 0;
		double media = 0, max = 0, min = 0;

		String[] egunak = new String[7];

		egunak[0] = "Astelehena";
		egunak[1] = "Martitzena";
		egunak[2] = "Asteazkena";
		egunak[3] = "Osteguna";
		egunak[4] = "Ostirala";
		egunak[5] = "Zapatua";
		egunak[6] = "Igandea";

		int[] temperaturak = new int[7];

		temperaturak[0] = 20;
		temperaturak[1] = 21;
		temperaturak[2] = 14;
		temperaturak[3] = 0;
		temperaturak[4] = 30;
		temperaturak[5] = 6;
		temperaturak[6] = -1;

		while (i < 7) {
			media = media + temperaturak[i];
			i++;
		}
		while (t < 7) {
			if (temperaturak[t] > max) {
				max = temperaturak[t];
				t++;
				pos = t;
			} else {
				t++;
			}
		}

		while (f < 7) {
			if (temperaturak[f] < min) {
				min = temperaturak[f];
				f++;
				posi = f;
			} else {
				f++;
			}
		}

		while (e < 7) {
			if (media / 7 < temperaturak[e]) {
				g++;
				e++;
			} else if (media / 7 > temperaturak[e]) {
				b++;
				e++;
			} else {
				e++;
			}
		}
		System.out.println("Media: "+media / 7);
		System.out.println("Media: "+(media / 7) * 1.8 + 32);
		System.out.println("Beroa: "+egunak[pos - 1] + " " + max + " C");
		System.out.println("Hotza: "+egunak[posi - 1] + " " + min + " C");
		System.out.println(g + " egun media baino beroagoa");
		System.out.println(b + " egun media baino beroagoa");
	}

}
