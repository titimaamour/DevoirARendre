package com.supinfo.java.devoir;

public class Roman extends Livre {
	
	private long prixLitt;
	
	public Roman (int numEnreg,String titre, String auteur,
			int nbrPages, long prixLitt) 
	{
		
		super(numEnreg, titre, auteur, nbrPages);
		
		this.prixLitt = prixLitt;
		
		
		
	}

	public long getPrixLitt() {
		return prixLitt;
	}

	public void setPrixLitt(long prixLitt) {
		this.prixLitt = prixLitt;
	}

	@Override
	public String toString() {
		return "Roman [prixLitt=" + prixLitt + "]";
	}
	
	

	
}
