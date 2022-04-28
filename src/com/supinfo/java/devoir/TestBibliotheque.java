package com.supinfo.java.devoir;

public abstract class TestBibliotheque {

	public static void main(String[] args) 
	{
		Dictionnaire dictionnaire = new Dictionnaire(1, "Le Grand Robert", "Francais");
		System.out.println(dictionnaire);
		
		Livre livre = new Livre(2, "Les contes D'amadou Koumba", "Birago Diop", 181);
		System.out.println(livre);
		
		Manuel manuel = new Manuel(3, "Java Comme un pro!", "Batobad", 358, 5);
		System.out.println(manuel);

		Revue revue = new Revue(4, "Revue de Mars 2018", 5, 2018);
		System.out.println(revue);

		//Roman roman = new Roman(5, "Des processeurs et des processus", "Danesh", 500 );
		//System.out.println(roman);

	}
	

	}


