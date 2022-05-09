package com.simulateur.assurance;

abstract class CalculTarif  extends CalculTarifsContrats {
			
	 public static double tarifsVoit(int base, double  majChevaux, int nbChevaux, double getReductionTab, double  conjoint, double  enfants, double  bonMal) {
				
		 double resultat;
		 
		 
		resultat = bonMal*((((base*majChevaux)-getReductionTab)+conjoint)+enfants);
		System.out.println();
		
		return resultat;
	 }
	 
	 public static  double tarifsMoto(int base, double  majChevaux,  double  bonMal, int anAssur) {
		 
			
		 double result;
		 
		
		 
		result = bonMal*((base*majChevaux)-anAssur);
		System.out.println();
		return result;
	 }
	 
	 public static double tarifsMaison(int base, double MajSurfaceTab, int majGrageTab, int nbPersonneMaison) {
		 
			
		 double resultat;
		 
		 
		resultat = ((base*MajSurfaceTab)+majGrageTab)+nbPersonneMaison;
		System.out.println();
		
		return resultat;
	 }
	 
	 
}
