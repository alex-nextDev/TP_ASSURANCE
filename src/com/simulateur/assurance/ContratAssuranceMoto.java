package com.simulateur.assurance;

public  class ContratAssuranceMoto{

	private int cylindree;							
	private double majChevauxTab;					
	private double	bonusMalus;							

	int baseMoto = 30;									

	double [] majChevauxFiscaux = {1,1.1,1.2,1.3,1.4,1.5,1.6};			
	int [] anneeAssuranceTab = {0,1,2,3,4,5,6};						

	 ContratAssuranceMoto(){
			
			nbAnneeAssurance = 0;
			cylindree = 0;
			majChevauxTab = 0;
	 }



	ContratAssuranceMoto(int cylindree, int nbAnAssurance, double bonusMalus) {
		
		int nbChevaux = 0;
		if (cylindree > 50 && cylindree <= 200)
		{
			nbChevaux = 1 ;
		}
		if (cylindree > 200 && cylindree <= 400)
		{
			nbChevaux = 2;
		}
		if (cylindree > 400 && cylindree <= 600)
		{
			nbChevaux = 3;
		}
		if (cylindree > 600 && cylindree <= 800)
		{
			nbChevaux = 4;
		}
		if (cylindree > 800 && cylindree <= 1000)
		{
			nbChevaux = 5;
		}
		if (cylindree > 1000 && cylindree <= 1200)
		{
			nbChevaux = 6;
		}
		if (cylindree > 1200 && cylindree <= 1900)
		{
			nbChevaux = 7;
		}
		
		if (nbAnAssurance > 6)
		{										
			this.nbAnneeAssurance = anneeAssuranceTab[6];							
		}
		else
		{
			this.nbAnneeAssurance = anneeAssuranceTab[nbAnAssurance];				
		}
	
		
		this.majChevauxTab = majChevauxFiscaux[nbChevaux-1];					
	
	
		this.cylindree = cylindree;									
		this.bonusMalus = bonusMalus;
		
	}


	private int nbAnneeAssurance;						
	public int getNbAnneeAssurance() {
		return nbAnneeAssurance;
	}



	public void setNbAnneeAssurance(int nbAnneeAssurance) {
		this.nbAnneeAssurance = nbAnneeAssurance;
	}


	public int getCylindree() {
		return cylindree;
	}


	public void setCylindree(int cylindree) {
		this.cylindree = cylindree;
	}


	public double getMajChevauxTab() {
		return majChevauxTab;
	}


	public void setMajChevauxTab(double majChevauxTab) {
		this.majChevauxTab = majChevauxTab;
	}

	
	
	public double getBonusMalus() {
		return bonusMalus;
	}


	public void setBonusMalus(double bonusMalus) {
		this.bonusMalus = bonusMalus;
	}
	

}
