package com.simulateur.assurance;

public abstract class CalculTarifsContrats extends Contrat{
	
	abstract void tarifsAuto();			// M�thode pour calculer le tarif auto
	abstract void tarifsMoto();			// M�thode pour calculer le tarif auto
	abstract void tarifsMaison();		// M�thode pour calculer le tarif auto
	
}
