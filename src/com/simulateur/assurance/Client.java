package com.simulateur.assurance;

public class Client {
	
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String statut;
	private int nbEnfants;
	private Contrat typeContrat;
	
	public Client(String nom, String prenom, String dateNaissance, String statut, int nbEnfants, Contrat typeContrat)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.statut = statut;
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

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
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
