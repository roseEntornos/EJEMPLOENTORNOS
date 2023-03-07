package ej5DiagramaClasesBaraja;

public class Baraja {
	private boolean cartas[][];
	private int contadorCartas;
	private int cartasTotales;

	public Baraja(char tipoBaraja) {
		super();
		if(tipoBaraja=='E'||tipoBaraja=='e')
			cartasTotales=40;
		if(tipoBaraja=='F'||tipoBaraja=='f')
			cartasTotales=52;
		cartas=new boolean[4][cartasTotales/4];
		contadorCartas=cartasTotales;
	}
	
	public Carta repartirCarta() {
		Carta c=null;
		boolean check=false;
		
		if (contadorCartas==0) {
			return c;
		}

		do {
			int palo = (int) (Math.random() * 4);
			int valor = (int) (Math.random() * (cartasTotales/4));
			
			
			
			if (cartas[palo][valor]==false) {
				check=true;
				contadorCartas--;
				cartas[palo][valor]=true;
				if(cartasTotales==40)
					c=new Carta(palo,valor,'e');
				else
					c=new Carta(palo,valor,'f');
			}
		}while(check==false);
		return c;
		
	}

	public int getContadorCartas() {
		return contadorCartas;
	}


}
