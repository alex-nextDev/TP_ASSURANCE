package com.simulateur.assurance;

public abstract class CalculTarifsContrats extends Contrat{
	
	abstract void tarifsAuto();			// Methode pour calculer le tarif auto
	abstract void tarifsMoto();			// Methode pour calculer le tarif auto
	abstract void tarifsMaison();		       // M�thode pour calculer le tarif auto
	
}
