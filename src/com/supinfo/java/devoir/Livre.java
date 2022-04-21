package com.supinfo.java.devoir;

public class Livre extends Documents {
	
	private String auteur;
	private int nbrPages;
	
	public Livre(String titre, String auteur, int nbrPages) {
	
		super(titre);
	
	this.nbrPages = nbrPages;
	this.auteur = auteur;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getNbrPages() {
		return nbrPages;
	}
	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	
	}
	@Override
	public String toString() {
		return "Livre [auteur=" + auteur + ", nbrPages=" + nbrPages + "]";
	}
	

}
