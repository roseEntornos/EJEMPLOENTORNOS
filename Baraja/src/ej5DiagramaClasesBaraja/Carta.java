package ej5DiagramaClasesBaraja;

public class Carta {
	private int palo;
	private int valor;
	private char tipo;
	private String auxPalo, auxValor;
	
	public Carta(int palo, int valor, char tipo) {
		super();
		this.palo = palo;
		this.valor = valor;
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	@Override
	public String toString() {
		if (tipo=='E'||tipo=='e') {
			switch(palo) {
			case 0:
				auxPalo="Oros";
				break;
			case 1:
				auxPalo="Copas";
				break;
			case 2:
				auxPalo="Espadas";
				break;
			case 3:
				auxPalo="Bastos";
				break;
			}
			switch(valor) {
			case 0:
				auxValor="AS";
				valor=1;
				break;
			case 1:
				auxValor="2";
				valor=2;
				break;
			case 2:
				auxValor="3";
				valor=3;
				break;
			case 3:
				auxValor="4";
				valor=4;
				break;
			case 4:
				auxValor="5";
				valor=5;
				break;
			case 5:
				auxValor="6";
				valor=6;
				break;
			case 6:
				auxValor="7";
				valor=7;
				break;
			case 7:
				auxValor="Sota";
				valor=10;
				break;
			case 8:
				auxValor="Caballo";
				valor=11;
				break;
			case 9:
				auxValor="Rey";
				valor=12;
				break;
			}
		}
		if (tipo=='F'||tipo=='f') {
			switch(palo) {
			case 0:
				auxPalo="Corazones";
				break;
			case 1:
				auxPalo="Rombos";
				break;
			case 2:
				auxPalo="Tréboles";
				break;
			case 3:
				auxPalo="Picas";
				break;
			}
			switch(valor) {
			case 0:
				auxValor="AS";
				valor=1;
				break;
			case 1:
				auxValor="2";
				valor=2;
				break;
			case 2:
				auxValor="3";
				valor=3;
				break;
			case 3:
				auxValor="4";
				valor=4;
				break;
			case 4:
				auxValor="5";
				valor=5;
				break;
			case 5:
				auxValor="6";
				valor=6;
				break;
			case 6:
				auxValor="7";
				valor=7;
				break;
			case 7:
				auxValor="8";
				valor=8;
				break;
			case 8:
				auxValor="9";
				valor=9;
				break;
			case 9:
				auxValor="10";
				valor=10;
				break;
			case 10:
				auxValor="J";
				valor=11;
				break;
			case 11:
				auxValor="Q";
				valor=12;
				break;
			case 12:
				auxValor="K";
				valor=13;
				break;
			}
		}
		return "Carta ["+ auxValor + " de " + auxPalo +"]";
	}
	
	

}
