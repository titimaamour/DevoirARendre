package com.supinfo.java.devoir;

public class ListeDocument {
	private Documents[] tableau;
	
	public void ajouter(Documents doc) 
	{
	if (tableau.length <= doc.getNumEnreg())
	{
	Documents[] t = new Documents[tableau.length * 2];
	for (int i = 0; i < tableau.length; ++i) {
	t[i] = tableau[i];
	}
	tableau = t;
	}
	tableau[doc.getNumEnreg()] = doc;
	}
	public Documents getDocument(int index) {
	if (index >= tableau.length) {
	return null;
	}
	return tableau[index];
	}
	public ListeDocument() {
	tableau = new Documents[1];
	}
	public String toString() {
	String resultat = "";
	for (int i = 0; i < tableau.length; ++i) {
	Documents d = tableau[i];
	if (d != null) {
	resultat += d + "\n";
	}
	}
	return resultat;
	}
	}


