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


}
