package data;

import java.util.HashMap;

public class Partida {
	private Equipo participante1;
	private Equipo participante2;
	private Equipo ganador;
	private Equipo perdedor;
	
	HashMap<Equipo,Integer> marcador= new HashMap <Equipo,Integer>();
	
	public void getMarcador() {
		int n=(int) Math.random() * 5;
		marcador.put(participante1, n);
		int m=(int) Math.random() * 5;;
		while (n==m) {
			 m=(int) Math.random() * 5;
		}
		marcador.put(participante2, m);
	}
	
	public Equipo Ganador() {
		if (marcador.get(participante1)>marcador.get(participante2)) {
			ganador = participante1;
			perdedor = participante2;
		} else {
			ganador = participante2;
			perdedor = participante1;
		}
		return ganador;
	}

	public Equipo getGanador() {
		return ganador;
	}

	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}

	public Equipo getPerdedor() {
		return perdedor;
	}

	public void setPerdedor(Equipo perdedor) {
		this.perdedor = perdedor;
	}

	public void setMarcador(HashMap<Equipo, Integer> marcador) {
		this.marcador = marcador;
	}

	public Equipo getParticipante1() {
		return participante1;
	}

	public void setParticipante1(Equipo participante1) {
		this.participante1 = participante1;
	}

	public Equipo getParticipante2() {
		return participante2;
	}

	public void setParticipante2(Equipo participante2) {
		this.participante2 = participante2;
	}

	public Partida(Equipo participante1, Equipo participante2) {
		this.participante1 = participante1;
		this.participante2 = participante2;
	}
}
