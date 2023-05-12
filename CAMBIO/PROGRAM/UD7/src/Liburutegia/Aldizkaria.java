package Liburutegia;

import java.util.Scanner;

public class Aldizkaria extends Liburutegia {
	
	private int zenbakia;
	
	public Aldizkaria() {
		super();
		this.zenbakia=0;
	}
	
	public Aldizkaria(int k, String i, int u, int z) {
		super(k,i,u);
		this.zenbakia=z;
	}
	
	
	
	public Aldizkaria(Aldizkaria a) {
		super(a);
		this.zenbakia=a.zenbakia;
	}

	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Aldizkaria [zenbakia=" + zenbakia + "]";
	}
	
	

	public void irakurri(Scanner sc) {
		super.irakurri(sc);
		System.out.println("Sartu aldizkari zenbakia: ");
		this.zenbakia=sc.nextInt();
	}
}
