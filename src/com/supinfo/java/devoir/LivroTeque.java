package com.supinfo.java.devoir;

import java.util.ArrayList;

public class LivroTeque extends Bibliotheque {
	
	public ArrayList<Livre> listLivres;

	public LivroTeque() {
		listLivres = new ArrayList<Livre>();
	}
	
	@Override
	public void afficherAuteur() {
		 for(Livre livre : listLivres) {
			 System.out.println(livre.getAuteur());
		 }
	}

}
