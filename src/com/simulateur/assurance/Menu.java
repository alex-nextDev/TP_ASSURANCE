package com.simulateur.assurance;

import java.util.Scanner;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.InputMismatchException;


public abstract class Menu extends Contrat
{

private static String nom;
private static String prenom;
private static String dateNaissance;
private static boolean statut;
private static boolean nbEnfants;
static boolean aEnfants = false;
static boolean aConjoint = false;
static int chevaux = 0;
static int cylindree = 0;
static double bonusMalus = 0.0;
static int anneeAssurance = 0;
static boolean aGarage;
static int surface;
static int nbPersonneMaison;
static boolean check = false;
static double majorationChevauxTab;
static double conjointTab;
static double enfantsTab;
static double reductionTab;


public static void saisirInfos() throws InputMismatchException
	{
		
		int choiceAssurance = 0;
		System.out.println("+-------------- ASSURANCE --------------+");
		
		Scanner lecteur = new Scanner(System.in) ;
		Scanner lecteur2 = new Scanner(System.in);
		
		System.out.print("Veuillez saisir votre nom ? : ");
				nom = lecteur2.next();
				
				System.out.print("Veuillez saisir votre prénom ? : ");
				prenom = lecteur2.next();
        
		do
		{																
			try 
			{	
			
			Scanner dateN = new Scanner(System.in);
			
			check = true;
			
			System.out.print("Veuillez saisir votre date de naissance (dd/mm/yyyy) ? : ");
			dateNaissance = dateN.next("^([0-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/[0-9]{4}$");
			Calendar calendar = Calendar.getInstance();
			int annee = calendar.get( Calendar.YEAR );
			int dateNaiss=Integer.parseInt(dateNaissance.substring(6, 10));
			if (dateNaiss > annee - 16)
				{														
					System.out.println("Il faut avoir au moins 16 ans pour être conducteur accompagné");
					  check = false;
				}
				if (dateNaiss > annee)
				{														
					System.out.println("Erreur");
					  check = false;
				}
				
			  }    
			  catch (InputMismatchException e)
			  {												
				  System.out.println("Erreur !!! vous ne respectez pas le format de date recommandé");
				  check = false;
			  }
		}
		while (check == false);
		
		do
		{
		Scanner choixAssurance = new Scanner(System.in);
		check = true;
		
		}
		try
			{
			System.out.println("\nQuel contrat souhaitez-vous ?\n");
			System.out.println("Veuillez saisir 1 pour Voiture");
			System.out.println("Veuillez saisir 2 pour Moto");
			System.out.println("Veuillez saisir 3 pour Maison\n");
			
			choiceAssurance = choixAssurance.nextInt();
			
			switch (choiceAssurance)
			
				{
				
				case 1 :
				System.out.println("CONTRAT VOITURE");
				char estMarie;
				
				do		
				{
				System.out.print("Etes vous marié ? Oui (O ou o) ou Non (N ou n)");
				aEnfants = lecteur.next().charAt(0);
				if (aEnfants!='o' && aEnfants!='O' && aEnfants!='n' && aEnfants!='N' )
				 {
				   System.out.println("Il faut répondre par Oui (O ou o) ou par Non (N ou n)");
				   
				 }
				 while (aEnfants!='o' && aEnfants!='O' && aEnfants!='n' && aEnfants!='N' );
				}
				if (aEnfants=='o' || aEnfants=='O')
				{				
				  nbEnfants = true;
				 }
				 else
				 {
				 nbEnfants = false;
				 }
				 
				 Client clients = new Client(nom, prenom, dateNaissance, statut, nbEnfants);	
				 ContratAssuranceVoiture voiture = new ContratAssuranceVoiture();
				 
				 do
				{ 
				  try 
				  {
				  System.out.print("Nombre de chevaux de votre voiture entre 4 et 10 : ");
				  chevaux = lecteur.nextInt();
				  check = true:
				  }
				  catch (InputMismatchException e)
				  {
				  System.out.println("Erreur !!! Vous devez saisir un chiffre entre 4 et 10");
				  check = false;
				  }
				 }
				 while (check == false || (chevaux < 4 || chevaux > 10));
				 
				 do
				 { 
				  Scanner choixBonusMalus = new Scanner( System.in );
				 }
				 try
				   {
				   System.out.print("Le bonus ou Malus de votre voiture doit être compris entre 0,5 et 1,5 : ");
				   String chiffreFormater = choixBonusMalus.next("^[0-9,]+$");
				   chiffreFormater = chiffreFormater.replaceAll(",",".");
				    bonusMalus = Double.parseDouble(chiffreFormater);
				   
				   if (bonusMalus < 0.5 || bonusMalus > 1.5)
				   {
				   System.out.println("Erreur !!! Veuillez saisir un chiffre entre 0,5 et 1,5");
				   }
				   check = true;
				   }    
				   catch (InputMismatchException e)
				   
				   }
				   
				   {									
					System.out.println("Erreur !!! Veuillez séparer les décimales par une virgule");
					check=false;
				   }
								   
						while (check == false || (bonusMalus < 0.5 || bonusMalus > 1.5));
						
						System.out.print("Nombre d'années d'assurance : ");
						anneeAssurance = lecteur.nextInt();
						
						while (anneeAssurance < 0)
						{
						  if (anneeAssurance < 0 )
						  {
						    System.out.println("Erreur !!! Veuillez saisir un chiffre supérieur à 0");
						  }
						}
						
						
						if (clients.isStatut())
						{
						  char conjoint = 0;
						 }
						
						  while (conjoint!='o' && conjoint!='O' && conjoint!='n' && conjoint!='N')
						  {
						    System.out.print("Votre conjoint sera assuré ? Oui (O ou o) ou (N ou n)");
						    conjoint = lecteur.next().charAt(0);
						  
						   if (conjoint !='o' && conjoint !='O' && conjoint !='n' && conjoint !='N')
						   {
						     System.out.println("Vous devez saisir O ou N");
						   }
						   if (conjoint == 'o' || conjoint == 'O')
						   {
						     aConjoint = true;
						   }
						   else
						   {
						   aConjoint = false;
						   }
						 }   
			                        }
						
					if (clients.isNbEnfants())
					{
					  char enfants = 0;
					}
					while (enfants!='o' && enfants!='O' && enfants!='n' && enfants!='N')
					{		
						System.out.print("Est-ce que votre enfant sera assuré(e) ?  Oui (O ou o) ou Non (N ou n)")
						enfants = lecteur.next().charAt(0);
								
							if (enfants!='o' && enfants!='O' && enfants!='n' && enfants!='N')
							{	
							  System.out.println("Veuillez saisir Oui (O ou o) ou Non (N ou n)");
							}
								
								if (enfants =='o' || enfants =='O')
								{
								nbEnfants = true;
								}
								else
								{
									nbEnfants = false;
								}
								
						}
			
						
				
						ContratAssuranceVoiture contratAssuranceVoiture = new ContratAssuranceVoiture(chevaux, bonusMalus, anneeAssurance, aConjoint, nbEnfants);
						double tarifVoiture = CalculTarif.tarifsVoit(contratAssuranceVoiture.baseAuto, contratAssuranceVoiture.getMajChevauxTab(),contratAssuranceVoiture.getNbChevaux(), contratAssuranceVoiture.getReductionTab(), contratAssuranceVoiture.getConjointTab(), contratAssuranceVoiture.getEnfantsTab(), contratAssuranceVoiture.getBonsuMalus());
						
						NumberFormat numformat = new DecimalFormat("#.00");
						System.out.println("Le tarif est de : " + numformat.format(tarifVoiture)+ "€");
						
						Imprimer.imprimerVoiture(getNom(),  getPrenom(), tarifVoiture , statut, nbEnfants );
						
						break;
						
							
						case 2 : 
						
						System.out.println("CONTRAT MOTO");
						
						ContratAssuranceMoto contratMoto = new ContratAssuranceMoto();
						
						do
						{ 
							Scanner bonusMalusVoiture = new Scanner(System.in);
							try
							{		
								System.out.print("Le bonnus/Malus de votre voiture doit être compris entre 0,5 et 1,5 : ");
								String chiffreDouble = bonusMalusVoiture.next("^[0-9,]+$");
								chiffreDouble = chiffreDouble.replaceAll(",",".");
								bonusMalus = Double.parseDouble(chiffreDouble);
								
								if (bonusMalus < 0.5 || bonusMalus > 1.5)
								{								
								  System.out.println("Erreur !!! Vous devez saisir un chiffre entre 0,5 et 1,5\n");
								 }
								check = true;	
								}    
							  catch (InputMismatchException e)
							   {									
								  System.out.println("");
								  check = false;
								  }
						}
						while (check == false || (bonusMalus < 0.5 || bonusMalus > 1.5));
						System.out.print("Quelle est la cylindrée ? ");
						cylindree = lecteur.nextInt();
						
						   while (cylindree < 50 || cylindree > 1900)
						   {			
		
							if (cylindree < 50 || cylindree > 1900)
							{
							    System.out.println("Veuillez saisir un nombre compris entre 50 et 1900");
							    }
							contratMoto.setCylindree(cylindree); 					
						}
						System.out.print("Nombre d'années d'assurance : ");
						anneeAssurance = lecteur.nextInt();
						while (anneeAssurance < 0)
						{				
		
							if (anneeAssurance < 0)
							{
								System.out.println("Veuillez saisir un chiffre supérieur à 0");
							}
						
						}
						Client clientsMoto = new Client(nom, prenom, dateNaissance, statut, nbEnfants);
						
						ContratAssuranceMoto contratmoto = new ContratAssuranceMoto(cylindree, anneeAssurance, bonusMalus) ;

						double tarifMoto = CalculTarif.tarifsMoto(contratmoto.baseMoto, contratmoto.getMajChevauxTab(), contratmoto.getBonusMalus(),contratmoto.getNbAnneeAssurance());

						NumberFormat numformat2 = new DecimalFormat("#.00");
						System.out.println("Le tarif est de : " + numformat2.format(tarifMoto) + "€");
						Imprimer.imprimerMoto(getNom(),  getPrenom(), tarifMoto );
						
						//ContratAuto auto = new ContratAuto();
						
						break;
						
						case 3 : 
						
						System.out.println("CONTRAT HABITATION");
						do
						{ 
							Scanner choixSurface = new Scanner(System.in);
							try 
							{		
								System.out.print("Quelle est la surface ? ");		
								surface = choixSurface.nextInt();
								check = true;
							}  
							
							catch (InputMismatchException e)
							
							{
							  System.out.println("Veuillez saisir un nombre supérieur ou égal à 10");
							  check = false;
							}
							
						}
						while (check == false || surface < 10);
						
						char possedeGarage;
						
						do
						{
							System.out.print("Avez vous un garage Oui (O ou o) ou Non (N ou n) ? : ");
							
							possedeGarage = lecteur.next().charAt(0);
							
							if (possedeGarage !='o' && possedeGarage !='O' && possedeGarage !='n' && possedeGarage !='N' )
							{		
								System.out.println("Vous devez saisir Oui (O ou o) ou Non (N ou n)");
							}
						
						}
						while (possedeGarage != 'o' && possedeGarage != 'O' && possedeGarage != 'n' && possedeGarage != 'N' );
						
							if (possedeGarage == 'o' || possedeGarage == 'O')
							]
							
								aGarage = true;
							}
							
							  else
							  {
							  
							aGarage = false;
							
						           }
							   
							   do
							   { 
								 Scanner personneFoyer = new Scanner( System.in );
								 try 
							         {
								     System.out.print("Nombre de personne dans le foyer ? ");
								     
								     String persFoy = personneFoyer.next("[0-9_]+");
								     nbPersonneMaison = Integer.parseInt(persFoy);
								     check = true;
								     
								      }    
							  catch (InputMismatchException e)
							{
							
							  System.out.println("Erreur !!! Il doit y avoir au minimum une personne dans un foyer");
							  
							  check = false;
							  }
						}
						while (check == false || nbPersonneMaison < 0);
						
						ContratAssuranceMaison contratMaison =  new ContratAssuranceMaison(surface, aGarage, nbPersonneMaison);
							
						double tarifMaison= CalculTarif.tarifsMaison(contratMaison.baseMaison, contratMaison.getMajSurfaceTab(), contratMaison.getMajGarageTab() , contratMaison.getMajNbPersooneSurface());
						
				   		NumberFormat numformatMaison = new DecimalFormat("#.00");
						System.out.println("Le tarif est de : " + numformatMaison.format(tarifMaison)+ "€");
						
						Imprimer.imprimerMaison(getNom(),  getPrenom(), tarifMaison );
						
						case 3 : 
						
						System.out.println("CONTRAT HABITATION");
						
						do
						{ 
						Scanner choixSurface = new Scanner(System.in);
							try 
							{	
							System.out.print("Quelle est la surface ? ");
								surface = choixSurface.nextInt();
								check = true;
								}    
							catch (InputMismatchException e)
							{
							
							System.out.println("Veuillez saisir un nombre supérieur ou égal à 10");
							
							check =  false;
							}
						}
						while (check == false || surface < 10);
						
				
						break;
						
					        default :
//TO FINISH
}




