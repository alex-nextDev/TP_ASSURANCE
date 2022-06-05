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
				
			  }    
			  catch (InputMismatchException e)
			  {												
				  System.out.println("Erreur !!! vous ne respectez pas le format de date recommandé");
				  check = false;
			  }
		}
		while (check == false);

//TO FINISH
}




