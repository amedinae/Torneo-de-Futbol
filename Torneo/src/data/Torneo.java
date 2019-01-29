package data;

import data.Partida;
import java.util.Arrays;

public class Torneo {
	private String nombre ;
	private Equipo[] equipos;
	private Partida PSemi1;
	private Partida PSemi2;
	private Partida SubFinal;
	private Partida Final;
	
	public Torneo(String nombre, Equipo[] equipos) {
		this.nombre = nombre;
		this.equipos = equipos;
	}

	public Equipo[] getEquipos() {
		return equipos;
	}

	public Partida getPSemi1() {
		return PSemi1;
	}

	public void setPSemi1() {
		PSemi1 = new Partida(equipos[0],equipos[1]);
	}

	public Partida getPSemi2() {
		return PSemi2;
	}

	public void setPSemi2() {
		PSemi2 = new Partida(equipos[2],equipos[3]);
	}

	public Partida getSubFinal() {
		return SubFinal;
	}

	public void setSubFinal(Equipo A, Equipo B) {
		SubFinal = new Partida(A,B);
	}

	public Partida getFinal() {
		return Final;
	}

	public void setFinal(Equipo A, Equipo B) {
		Final = new Partida(A,B);
	}

	public void setEquipos(Equipo[] equipos) {
		this.equipos = equipos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Torneo [nombre=" + nombre + ", equipos=" + Arrays.toString(equipos) + "]";
	}
	
}
