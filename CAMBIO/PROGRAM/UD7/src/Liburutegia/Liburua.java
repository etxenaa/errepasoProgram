package Liburutegia;

import java.util.Scanner;

public class Liburua extends Liburutegia implements Prestable {
	
	private boolean mailegua;
	
	public Liburua() {
		super();
		this.mailegua=false;
	}
	
	public Liburua(int k, String i, int u, boolean m) {
		super(k,i,u);
		this.mailegua=m;
	}
	
	public Liburua(Liburua l) {
		super(l);
		this.mailegua=l.mailegua;
	}
	

	
	public boolean isMailegua() {
		return mailegua;
	}

	public void setMailegua(boolean mailegua) {
		this.mailegua = mailegua;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Liburua [mailegua=" + mailegua + "]";
	}
	
	
	@Override
	public void mailegatu() {
		// TODO Auto-generated method stub
		this.mailegua=true;
	}

	@Override
	public void itzuli() {
		// TODO Auto-generated method stub
		this.mailegua=false;
	}

	@Override
	public boolean mailegatuta() {
		// TODO Auto-generated method stub
		return this.mailegua;
	}

	public void irakurri(Scanner sc) {
		super.irakurri(sc);
		System.out.println("Mailegatuta? (true/false)");
		this.mailegua=sc.nextBoolean();
	}
}