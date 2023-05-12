package AriketakUD6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListMediaTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> tmp = new ArrayList<Double>();
		
		double znb,total=0,media=0;
		int mayor = 0, igual = 0, menor = 0;
		
		System.out.println("Sartu temperatura bat:");
		znb=sc.nextDouble();
		
		while (znb!=-999) {
			tmp.add(znb);
			total+=znb;
			System.out.println("Sartu temperatura bat:");
			znb=sc.nextDouble();
		}
		
		media = total/(tmp.size());
		
		
		for (double kopia : tmp) {
			if (kopia > media) {
			mayor++;
			} else if (kopia < media) {
				menor++;
			} else if (kopia == media) {
				igual++;
			}
		}
		
		System.out.println("Media "+media);
		System.out.println("Media baino handiagoak "+mayor+" dira.");
		System.out.println("Media baino txikiagoak "+menor+" dira.");
		System.out.println("Mediaren berdinak "+igual+" dira.");
		
	}

}
