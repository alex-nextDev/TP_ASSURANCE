package com.simulateur.assurance;

public class Client {
	
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String marier;
	private int nbEnfants;
	private Contrat typeContrat;
	
	public Client(String nom, String prenom, String dateNaissance, String marier, int nbEnfants, Contrat typeContrat)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.marier = marier;
		this.nbEnfants = nbEnfants;
		this.typeContrat = typeContrat;
		
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getMarier() {
		return marier;
	}

	public void setMarier(String marier) {
		this.marier = marier;
	}

	public int getNbEnfants() {
		return nbEnfants;
	}

	public void setNbEnfants(int nbEnfants) {
		this.nbEnfants = nbEnfants;
	}

	public Contrat getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(Contrat typeContrat) {
		this.typeContrat = typeContrat;
	}
	
	
	
	
	

}
