package com.supinfo.java.devoir;

public class Documents {
	static private int numeroSuivant = 0;
	private int numEnreg;
	private String titre;
	
	public Documents(String titre)
	{
	this.numEnreg = numeroSuivant;
	numeroSuivant++;
	this.titre = titre;
	}
	public Documents(String titre, int numEnreg) {
	if (numEnreg < numeroSuivant) {
		numEnreg = numeroSuivant;
	}
	this.numEnreg = numEnreg;
	numeroSuivant = numEnreg + 1;
	this.titre = titre;
	
	}
	public int getNumEnreg() {
		return numEnreg;
	}
	public void setNumEnreg(int numEnreg) {
		this.numEnreg = numEnreg;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	@Override
	public String toString() {
		return "Documents [numEnreg=" + numEnreg + ", titre=" + titre + "]";
	}
	
	
}
