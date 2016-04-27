package main;

import java.awt.Point;

import inputDati.InputDati;

public class Guerriero {
	private static final String richiestaNomeGuerriero = "Inserisci il nome del guerriero";
	private String nome;
	private Point posizione;
	public Guerriero(){
		this.nome=richiestaNome();
		posizione=new Point(0,0);
	}
	
	
	
	private String richiestaNome() {
		return InputDati.leggiStringaNonVuota(richiestaNomeGuerriero);
	}

}
