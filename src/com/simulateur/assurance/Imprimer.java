package com.simulateur.assurance;

import java.text.DecimalFormat;

import java.text.NumberFormat;

public abstract class Imprimer extends Menu {
	
	
	 public static  void imprimerVoiture(String nom,  String prenom, double tarif , boolean marie , boolean enfants ) {
		 				
		System.out.println("+------------------------------------------------------+");
		System.out.println("DEVIS ASSURANCE VOITURE");
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		NumberFormat numformat = new DecimalFormat("#.00");
		System.out.println("Le tarif à payer pour l'assurance voiture est de " + numformat.format(tarif) + "€");
		System.out.println("Veuillez joindre :");
		System.out.println("Copie de carte grise");
		System.out.println("Copie de permis");
		System.out.println("+------------------------------------------------------+");
		
		if (marie) {
			System.out.println("Copie permis conjoint");
		}
		if (enfants) {
			System.out.println("Copie permis enfant");
		}
		System.out.println("RIB");
		System.out.println("Carte d'identité assureur");
	 }
	 
	 public static  void imprimerMoto(String nom,  String prenom, double tarif) {
			
		System.out.println("+------------------------------------------------------+");
		System.out.println("DEVIS ASSURANCE MOTO");
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		NumberFormat numformat2 = new DecimalFormat("#.00");
		System.out.println("Le tarif à payer pour l'assurance moto est de " + numformat2.format(tarif) + "€");
		System.out.println("Veuillez joindre :");
		System.out.println("Copie de carte grise");
		System.out.println("Copie de permis moto");
		System.out.println("RIB");
		System.out.println("Carte d'identité assureur");
		System.out.println("+------------------------------------------------------+");
	 }
	 
	 public static  void imprimerMaison(String nom,  String prenom, double tarif) {
			
		System.out.println("+------------------------------------------------------+");
		System.out.println("DEVIS ASSURANCE HABITATION\n\n");
		System.out.println("Nom : " + nom);
		System.out.println("Prénom : " + prenom);
		NumberFormat numformat3 = new DecimalFormat("#.00");
		System.out.println("Le tarif à payer pour l�assurance habitation est de " + numformat3.format(tarif) + "€");
		System.out.println("Veuillez joindre :");
		System.out.println("Contrat de location");
		System.out.println("RIB");
		System.out.println("Carte d'identité assureur");
		System.out.println("+------------------------------------------------------+");
	 }
	 
}