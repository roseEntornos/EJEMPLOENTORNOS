package ej5DiagramaClasesBaraja;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Jugador[] jugadores=new Jugador[2];
		Baraja baraja;
		Carta cartaJug1, cartaJug2, cartasEmpate[] = null;
		String nombre;
		int contCartasEmpate=0, numRonda=1;
		char tipoBaraja;
		cartasEmpate=new Carta[52];
		
		do {
			System.out.println("¿Qué tipo de baraja desea? ¿Española(E) o Francesa(F)?");
			tipoBaraja=sc.nextLine().charAt(0);
		}while(tipoBaraja!='E'&&tipoBaraja!='F'&&tipoBaraja!='e'&&tipoBaraja!='f');
		baraja=new Baraja(tipoBaraja);
		
		for(int i=0;i<jugadores.length;i++) {
			System.out.println("Introduzca nombre jugador: ");
			nombre=sc.nextLine();
			jugadores[i]=new Jugador(nombre,tipoBaraja);
		}
		
		do {
			System.out.println("");
			System.out.println("Ronda "+numRonda);
			cartaJug1=baraja.repartirCarta();
			System.out.println("Jugador 1: "+cartaJug1.toString());
			cartaJug2=baraja.repartirCarta();
			System.out.println("Jugador 2: "+cartaJug2.toString());
			if (cartaJug1.getValor()>cartaJug2.getValor()) {
				System.out.println("Gana jugador 1");
				jugadores[0].setGanada(cartaJug1);
				jugadores[0].setGanada(cartaJug2);
				if(contCartasEmpate!=0) {
					int aux=contCartasEmpate;
					for(int i=0;i<aux;i++) {
						jugadores[0].setGanada(cartasEmpate[i]);
						contCartasEmpate--;
					}
				}
			}
			else 
				if (cartaJug2.getValor()>cartaJug1.getValor()) {
					System.out.println("Gana jugador 2");
					jugadores[1].setGanada(cartaJug1);
					jugadores[1].setGanada(cartaJug2);
					if(contCartasEmpate!=0) {
						int aux=contCartasEmpate;
						for(int i=0;i<aux;i++) {
							jugadores[1].setGanada(cartasEmpate[i]);
							contCartasEmpate--;
						}
					}
				}
				else {
					System.out.println("Empate");
					cartasEmpate[contCartasEmpate]=cartaJug1;
					contCartasEmpate++;
					cartasEmpate[contCartasEmpate]=cartaJug2;
					contCartasEmpate++;
				}
			System.out.println("Quedan "+ baraja.getContadorCartas() +" cartas en el mazo.");
			System.out.println("Jugador 1: "+ jugadores[0].getPuntuacion() +" puntos.");
			System.out.println("Jugador 2: "+ jugadores[1].getPuntuacion() +" puntos.");
			if(baraja.getContadorCartas()!=0)	{
				System.out.println("Pulse ENTER para seguir sacando cartas");
				sc.nextLine();
			}
			numRonda++;
		}while(baraja.getContadorCartas()!=0);
		System.out.println("");
		System.out.println("HA GANADO LA PARTIDA: "+Jugador.quienGana(jugadores[0], jugadores[1]));
	}

}
