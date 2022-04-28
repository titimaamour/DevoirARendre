package com.supinfo.java.devoir;

public class Manuel extends Livre {
	
	private int niveau;
	
	
	public Manuel(int numEnreg,String titre, String auteur,
			int nbrPages, int niveau)
	{
		super(numEnreg, titre, auteur, nbrPages);
		
		this.niveau = niveau;
		
	}


	public int getNiveau() {
		return niveau;
	}


	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}


	@Override
	public String toString() {
		return "Manuel [niveau=" + niveau + "]";
	}

}
