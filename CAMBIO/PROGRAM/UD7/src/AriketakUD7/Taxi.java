package AriketakUD7;

import java.util.Scanner;

public class Taxi extends Ibilgailua {
	
	private int lizentziaZenbakia;


	public Taxi() {

	super();

	this.lizentziaZenbakia=0;

	}


	public Taxi(String ma, String mo, int po, int pl, String[] ko, int l) {

	super(ma, mo, po, pl, ko);

	this.lizentziaZenbakia=l;

	}


	public Taxi(Taxi tx) {

	super(tx);

	this.lizentziaZenbakia=tx.lizentziaZenbakia;

	}

	public int getLizentziaZenbakia() {

	return lizentziaZenbakia;

	}

	public void setLizentziaZenbakia(int lizentziaZenbakia) {

	this.lizentziaZenbakia = lizentziaZenbakia;

	}

	public void Pantailaratu() {

	super.Pantailaratu();

	System.out.println(this.lizentziaZenbakia);

	}


	public void Irakurri(Scanner sc) {

	super.irakurri(sc);

	System.out.println("Sartu lizentzia zenbakia:");

	this.lizentziaZenbakia=sc.nextInt();
	
	}
	
}
