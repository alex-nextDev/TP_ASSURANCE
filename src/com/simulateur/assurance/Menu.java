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
				  
			}

//TO FINISH
}




