package Gamer;

import java.util.ArrayList;
import java.util.Date;

public class Partida {
	
	private Date fecha;
	private String nombreJuego;
	private boolean online;
	ArrayList <Partida> p = new ArrayList<Partida>();
	
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	
}
