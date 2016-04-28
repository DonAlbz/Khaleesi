package main;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import inputDati.InputDati;
import inputDati.MyMenu;

public class Partita {
	private Map<Point, AbstractObject> casella = new HashMap<>();
	private Guerriero guerriero;
	private boolean continuare = true;
	private String RICHIESTA_CONTINUAZIONE = "Vuoi continuare la partita?";
	private String RICHIESTA_SPOSTAMENTO = "Seleziona una direzione di movimento del guerriero";
	private String[] SPOSTAMENTI_POSSIBILI={"NORD", "SUD", "OVEST", "EST", "TORNA IN CITTA'"};
	
	public Partita() {
		creaCasella(new Point(0,0), null);
		guerriero = new Guerriero();		
	}
	
	public void start() {
		while (continuare){
			richiediSpostamento();
		}
	}

	

	private void richiediSpostamento() {
		MyMenu menuSpostamento = new MyMenu(RICHIESTA_SPOSTAMENTO, SPOSTAMENTI_POSSIBILI);
		switch(menuSpostamento.scegli()){
		case 0: 
			continuare=false;
			break;
		case 1:
			eseguiSpostamento(0, 1);
			break;
		case 2:
			eseguiSpostamento(0, -1);
			break;
		case 3:
			eseguiSpostamento(-1, 0);
			break;
		case 4:
			eseguiSpostamento(1, 0);
			break;
		case 5:
			guerriero.getPosizione().setLocation(0, 0);
			break;
		}
		
	}
	
	/**Permette di effettuare uno spostamento differenziale dalla posizione in cui si trova il guerriero
	 * @param x spostamento intero dx
	 * @param y spostamento intero dy
	 */
	private void eseguiSpostamento(int x, int y) {
		guerriero.getPosizione().translate(x, y);
		if(!esisteCasella(guerriero.getPosizione())){
			Point newPosizione = new Point();
			newPosizione.setLocation(guerriero.getPosizione());
			creaCasella(newPosizione,null);
		}		
	}

	private void creaCasella(Point coordinate, AbstractObject abstractObject){
		casella.put(coordinate, abstractObject);	
		System.out.println("casella inserita con coordinate    " + coordinate.getX() + "    " + coordinate.getY());
	}

	private Boolean esisteCasella(Point coordinate){
		return casella.containsKey(coordinate);
	}

	private AbstractObject contenutoCasella(Point coordinate){
		return casella.get(coordinate);

	}

}