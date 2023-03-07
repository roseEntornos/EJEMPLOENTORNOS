package ej5DiagramaClasesBaraja;

public class Jugador {
	private String nombre;
	private Carta[] ganadas;
	private int contGanadas=0;
	private int puntuacion=0;
	
	public Jugador(String nombre, char tipoBaraja) {
		super();
		this.nombre = nombre;
		if(tipoBaraja=='e'||tipoBaraja=='E')
			this.ganadas = new Carta[40];
		if(tipoBaraja=='f'||tipoBaraja=='F')
			this.ganadas = new Carta[52];
	}

	public void setGanada(Carta ganada) {
		this.ganadas[contGanadas]=ganada;
		this.puntuacion+=(ganada.getValor());
		contGanadas++;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}

	public static String quienGana(Jugador j1, Jugador j2) {
		if(j1.puntuacion>j2.puntuacion)
			return j1.nombre;
		else
			if(j2.puntuacion>j1.puntuacion)
				return j2.nombre;
			else
				return "empate";
		
	}

}
