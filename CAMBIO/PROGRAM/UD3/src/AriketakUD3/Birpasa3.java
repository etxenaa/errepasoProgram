package AriketakUD3;

import java.util.Scanner;

public class Birpasa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int z1,z2,z3;
		
		System.out.println("Esan hiru zenbaki");
		z1 = sc.nextInt();
		z2 = sc.nextInt();
		z3 = sc.nextInt();
		
		if (z1==z2 && z1==z3) {
			System.out.println("Berdinak dira.");
		}
		else if (z1>=z2 && z1>=z3) {
			System.out.println(z1+" handiena da.");
		}
		else if (z2>z1 && z2>z3) {
			System.out.println(z2+" handiena da.");
		}
		else if (z3>z1 && z3>z2) {
			System.out.println(z3+" handiena da.");
		}
	}

}
