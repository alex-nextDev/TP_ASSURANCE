package com.simulateur.assurance;

public class Client {
	
	private String nom;
	private String prenom;
	private String dateNaissance;
	private boolean statut;
	private boolean nbEnfants;

	
	public Client(String nom, String prenom, String dateNaissance, boolean statut, boolean nbEnfants)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.statut = statut;
		this.nbEnfants = nbEnfants;
		
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

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public boolean isNbEnfants() {
		return nbEnfants;
	}

	public void setNbEnfants(boolean nbEnfants) {
		this.nbEnfants = nbEnfants;
	}

	
	

}
