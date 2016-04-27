package main;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import inputDati.InputDati;

public class Partita {
	private Map<Point, AbstractObject> casella = new HashMap<>();
	private Guerriero guerriero;
	private boolean continuare = true;
	private String RICHIESTA_CONTINUAZIONE = "Vuoi continuare la partita?";
	
	public Partita() {
		creaCasella(new Point(0,0), null);
		guerriero = new Guerriero();		
	}
	
	public void start() {
		while (continuare){
			eseguiSpostamento();
			continuare=chiediSeContinuare();
		}
		
	}

	private void eseguiSpostamento() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean chiediSeContinuare() {
		return InputDati.yesOrNo(RICHIESTA_CONTINUAZIONE );
	}

	

	private void creaCasella(Point coordinate, AbstractObject abstractObject){
		casella.put(coordinate, abstractObject);	
	}

	private Boolean esisteCasella(Point coordinate){
		return casella.containsKey(coordinate);
	}

	private AbstractObject contenutoCasella(Coordinate coordinate){
		return casella.get(coordinate);

	}

}