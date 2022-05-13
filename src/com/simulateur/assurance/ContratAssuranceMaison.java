package com.simulateur.assurance;


public  class ContratAssuranceMaison  {
	private int surface;						
	private int nbPersonneMaison;				
	private double majSurfaceTab;				
	private int majGarageTab;					
	private int majNbPersooneSurface;			

	
	int baseMaison = 15;								

	double [] majSurface = {1,1.1,1.2,1.3,1.4,1.5,1.6};			
	int [] majNbPersonneMaison = {0,1,2,3,4,5,6};						
	int [] majGarage = {0,1,2,3,4,5,6};
	
		ContratAssuranceMaison(){
		surface=0;
		nbPersonneMaison=0;
		majSurfaceTab=0;
		majGarageTab=0;
	}



	ContratAssuranceMaison(int surface, boolean garage, int nbPersonneFoyer) {
		
		
		int indiceSurface = 0;
		if (surface > 10 && surface <= 50)
		{
			indiceSurface = 1;
		}
		if (surface > 50 && surface <= 60)
		{
			indiceSurface = 2;
		}
		if (surface > 60 && surface <= 70)
		{
			indiceSurface = 3;
		}
		if (surface > 70 && surface <= 80)
		{
			indiceSurface = 4;
		}
		if (surface > 80 && surface <= 90)
		{
			indiceSurface = 5;
		}
		if (surface > 90 && surface <= 100)
		{
			indiceSurface = 6;
		}
		if (surface > 100) {
			indiceSurface = 7;
		}
		
			this.majSurfaceTab=majSurface[indiceSurface-1];						

			this.majGarageTab=majGarage[indiceSurface-1];							
			
		if (nbPersonneFoyer > 6)
		{
			nbPersonneFoyer = 6;
		}
			this.majNbPersooneSurface = majNbPersonneMaison[nbPersonneFoyer];		
			
		}


	public int getSurface() {
		return surface;
	}


	public void setSurface(int surface) {
		this.surface = surface;
	}


	public int getNbPersonneMaison() {
		return nbPersonneMaison;
	}


	public void setNbPersonneMaison(int nbPersonneMaison) {
		this.nbPersonneMaison = nbPersonneMaison;
	}


	public double getMajSurfaceTab() {
		return majSurfaceTab;
	}


	public void setMajSurfaceTab(double majSurfaceTab) {
		this.majSurfaceTab = majSurfaceTab;
	}


	public int getMajGarageTab() {
		return majGarageTab;
	}


	public void setMajGrageTab(int majGarageTab) {
		this.majGarageTab = majGarageTab;
	}


	public int getMajNbPersooneSurface() {
		return majNbPersooneSurface;
	}


	public void setMajNbPersooneSurface(int majNbPersooneSurface) {
		this.majNbPersooneSurface = majNbPersooneSurface;
	}


	public int[] getMajNbPersonneMaison() {
		return majNbPersonneMaison;
	}


	public void setMajNbPersonneMaison(int[] majNbPersonneMaison) {
		this.majNbPersonneMaison = majNbPersonneMaison;
	}	
}
