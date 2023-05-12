package AriketakUD6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
		
		int znb,total=0;
		System.out.println("Sartu zenbaki bat:");
		znb=sc.nextInt();
		
		while (znb>=0) {
			arrayListInteger.add(znb);
			total+=znb;
			System.out.println("Sartu zenbaki bat:");
			znb=sc.nextInt();
		}
		System.out.println("Media "+total/(arrayListInteger.size()));
	}

}
