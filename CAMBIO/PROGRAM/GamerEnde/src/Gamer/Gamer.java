package Gamer;

import java.util.ArrayList;

public class Gamer extends Usuario {
	
	private String nickname;
	ArrayList <Gamer> g = new ArrayList <Gamer>(2);
	
	public Gamer(String nknm) {
		this.nickname=nknm;
	}
	
	public void setEdad (int edad) {
		if (edad<18) {
			super.setEdad(0);
		} else {
			super.setEdad(edad);
		}
	}
}
