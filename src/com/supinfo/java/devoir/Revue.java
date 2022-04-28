package com.supinfo.java.devoir;

public class Revue extends Documents {
	private int mois;
	private int annee;
	
	
	public Revue(int numEnreg,String titre, int mois, int annee) {
		super(numEnreg,titre);
		
		this.mois = mois;
		this.annee = annee;
		
		}


	@Override
	public String toString() {
		return "Revue [mois=" + mois + ", annee=" + annee + "]";
	}


	public int getMois() {
		return mois;
	}


	public void setMois(int mois) {
		this.mois = mois;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}

}
