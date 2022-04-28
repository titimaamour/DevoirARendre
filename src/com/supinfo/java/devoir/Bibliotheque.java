package com.supinfo.java.devoir;

import java.util.ArrayList;

public class Bibliotheque {
	
	public ArrayList<Documents> ListeDocument;



	public Bibliotheque() {
		ListeDocument = new ArrayList<Documents>();
	}

	public void afficherDoc() {
		System.out.println("Liste des Documents: " + ListeDocument);
	}

	public Documents document(int i) {
		return ListeDocument.get(i);
	}

	public void ajouter(Documents document) {
		ListeDocument.add(document);
	}

	public boolean supprimer(Documents document) {
		if (ListeDocument.contains(document)) {
			ListeDocument.remove(document);
			return true;
		}
		
		return false;
		
	}

	public void afficherAuteur() {
		 for(int i=0;i<ListeDocument.size();i++){
            if(ListeDocument.get(i) instanceof Livre)
                System.out.println( ((Livre) ListeDocument.get(i)).getAuteur() );
	    }
	}

}
