package com.supinfo.java.devoir;

public class Dictionnaire extends Documents {
	
	private String langue;
	
	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public Dictionnaire(int numEnreg,String titre,  String langue) {
	super(numEnreg,titre);
	
	this.langue = langue;
	}

	@Override
	public String toString() {
		return "Dictionnaire [langue=" + langue + "]";
	}
	

}
