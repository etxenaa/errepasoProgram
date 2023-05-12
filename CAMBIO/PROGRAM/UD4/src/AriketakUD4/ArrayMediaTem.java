package AriketakUD4;

import java.util.Scanner;

public class ArrayMediaTem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double[] c = new double[10];

		int a = 0, i = 0;
		double n = 0, total = 0, media = 0;
		int mayor = 0, igual = 0, menor = 0;

		while ((n != -999) && (i < c.length)) {

			System.out.println("Sartu tenperatura balore bat (-999 amaitzeko)");
			n = sc.nextDouble();

			if (n != -999) {
				c[i] = n;
				total = total + c[i];
				i++;
			}
		}

		media = total / i;

		System.out.println("La media es " + media);
		if (i > 0) {
			media = total / i;
			System.out.println("batazbestekoa " + media + " da.");

			for (int j = 0; j < i; j++) {
				System.out.println(c[i]);
				if (c[i] > media) {
					mayor++;
				} else if (c[i] < media) {
					menor++;
				} else if (c[i] == media) {
					igual++;
				}
			}
			System.out.println("Hay " + mayor + " temperaturas mayores q la media");
			System.out.println("Hay " + igual + " temperaturas iguales q la media");
			System.out.println("Hay " + menor + " temperaturas menores q la media");
		} else {
			System.out.println("ERROR");
		}
		/*
		 * if (i>0) { for (int m=0;m<i;m++) { if (c[m]<media) { menor++; } else if
		 * (c[m]==media) { igual++; } else { mayor++; } }
		 * 
		 * System.out.println("Hay "+mayor+" temperaturas mayores que la media.");
		 * 
		 * System.out.println("Hay "+igual+" temperaturas iguales que la media.");
		 * 
		 * System.out.println("Hay "+menor+" temperaturas menores que la media."); }
		 * 
		 * else { System.out.println("ERROR"); }
		 */

	}

}
