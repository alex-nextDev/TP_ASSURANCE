package com.simulateur.assurance;

public class ContratAssuranceVoiture {
	
	public ContratAssuranceVoiture()
	{
	
	private double bonsuMalus;						
	private int nbAnneeAssurance;						
	private int nbChevaux;							
	private double majChevauxTab;					
	private double nbAnTab;							
	private double conjointTab;						
	private double enfantsTab;						
	private double reductionTab;					
	int baseAuto = 20;
	

	double [] majChevauxFiscaux = {1,1.1,1.2,1.3,1.4,1.5,1.6};			
	int [] anAssur = {0,1,2,3,4,5,6};						
	int [] marieChevaux = {1,2,3,4,5,6,7};						
	int [] enfantMajoration	= {1,2,3,4,5,6,7};	
		
	}
	
	 ContratAssuranceVoiture()
	 {
			bonsuMalus=0;
			nbAnneeAssurance=0;
			nbChevaux=0;
			majChevauxTab=0;
			nbAnTab=0;
			conjointTab=0;
			enfantsTab=0;
			reductionTab=0;
	 }

	ContratAssuranceVoiture(int nbChevaux, double bonsuMalus, int nbAnneeAssurance, boolean conjoint, boolean enfants)
	{
		this.majChevauxTab=majChevauxFiscaux[nbChevaux-4];		
		

		if (nbAnneeAssurance>6)
		{							
			this.reductionTab= anAssur[6];
			
			if (conjoint)
			{								
				this.conjointTab=marieChevaux[6];
			}
			if (enfants)
			{								
				this.enfantsTab=enfantMajoration[6];
			}
		
		}
		else
		{											
			this.reductionTab= anAssur[nbAnneeAssurance];
			if (conjoint)
			{
				this.conjointTab=marieChevaux[nbChevaux-4];
			}
			if (enfants)
			{
				this.enfantsTab=enfantMajoration[nbChevaux-4];
			}
		}

		this.bonsuMalus = bonsuMalus;								
		this.nbAnneeAssurance = nbAnneeAssurance;						
		this.nbChevaux = nbChevaux;								
	}
	
	public double getBonsuMalus() {
		return bonsuMalus;
	}


	public void setBonsuMalus(double bonsuMalus) {
		this.bonsuMalus = bonsuMalus;
	}
	
	public int getNbAnAssurance() {
		return nbAnneeAssurance;
	}
	
	public void setNbAnAssurance(int nbAnAssurance) {
		this.nbAnneeAssurance = nbAnAssurance;
	}
	
	
	public int getNbChevaux() {
		return nbChevaux;
	}

}
