package bussinesslogic;
import data.Equipo;
import data.Torneo;
import data.Partida;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo A = new Equipo("Cebollitas FC"); 
		Equipo B = new Equipo("Deportivo Tapitas"); 
		Equipo C = new Equipo("AC Frio"); 
		Equipo D = new Equipo("Las Sinteticas");
		Equipo[] sorteo = new Equipo[4]; 
		Torneo T = new Torneo("EL Torneo Galactico",null);
		
		int balota1 = (int) (Math.random() * 4);
		
		sorteo[balota1] = A;
		
		int balota2 = (int) (Math.random() * 4);

		while (balota1==balota2) {
			balota2 = (int) (Math.random() * 4);
		}
		sorteo[balota2] = B;
		
		int balota3 = (int) (Math.random() * 4);

		while (balota3==balota2||balota3==balota1) {
			balota3 = (int) (Math.random() * 4);
		}
		
		sorteo[balota3] = C;
		
		int balota4 = (int) (Math.random() * 4);

		while (balota4==balota3||balota4==balota2||balota4==balota1) {
			balota4 = (int) (Math.random() * 4);
		}
		sorteo[balota4] = D;
		T.setEquipos(sorteo);
		T.setPSemi1();
		T.setPSemi2();
		T.getPSemi1().getMarcador();
		T.getPSemi2().getMarcador();
		T.setSubFinal(T.getPSemi1().getPerdedor(), T.getPSemi2().getPerdedor());
		T.setFinal(T.getPSemi1().getGanador(),T.getPSemi2().getGanador());
		T.getSubFinal().getMarcador();
		T.getFinal().getMarcador();
		System.out.println("Gano el Torneo!");
		
	}
}
