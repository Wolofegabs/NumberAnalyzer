package com.gabrielstech.entrainement;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestTask {
	

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		

		Operation boom = new Operation();
	     
		int choix = boom.messagedebienvenu();
		if(choix==1) {
			System.out.println(" Veuillez entrer le premier nombre pour le ppcm");
			int o = clavier.nextInt();
			System.out.println(" Veuillez entrer le second nombre pour le ppcm");
			int p = clavier.nextInt();
			System.out.println(boom.ppcm(o, p));
		}else if(choix==2) {
			System.out.println(" Veuillez entrer le premier nombre pour le pgcd");
			int o = clavier.nextInt();
			System.out.println(" Veuillez entrer le second nombre pour le pgcd");
			int p = clavier.nextInt();
			System.out.println(boom.pgcd(o, p));
		}else if(choix==3) {
			System.out.println(" Veuillez entrer le nombre pour voir le nombre de diviseur(s)");
			int m = clavier.nextInt();
			System.out.println(boom.verifNombreDeDiviseurs(m));
			
		}else if(choix==4) {
			System.out.println(" Veuillez entrer le nombre pour voir le premier");
			int n = clavier.nextInt();
			System.out.println(boom.verifNombrePremier(n));
		}else if(choix==5) {
			System.out.println(" Veuillez entrer le nombre pour voir la factorielle");
			int n = clavier.nextInt();
			System.out.println(boom.factorielle(n));
		}else if(choix==6) {
			System.out.println(" Veuillez entrer l'entier positif à convertir en binaire");
			int n = clavier.nextInt();
			
			boom.binaire(n);
		}
		else {
			System.out.println("Veuillez choisir un nombre compris entre 1 et 4 svp!");
			while(choix<1 && choix >4) {
				
				int rechoix = boom.messagedebienvenu();
				if(rechoix==1) {
					System.out.println(" Veuillez entrer le premier nombre pour le ppcm");
					int o = clavier.nextInt();
					System.out.println(" Veuillez entrer le second nombre pour le ppcm");
					int p = clavier.nextInt();
					System.out.println(boom.ppcm(o, p));
				}else if(rechoix==2) {
					System.out.println(" Veuillez entrer le premier nombre pour le pgcd");
					int o = clavier.nextInt();
					System.out.println(" Veuillez entrer le second nombre pour le pgcd");
					int p = clavier.nextInt();
					System.out.println(boom.pgcd(o, p));
				}else if(rechoix==3) {
					System.out.println(" Veuillez entrer le nombre pour voir le nombre de diviseur(s)");
					int m = clavier.nextInt();
					System.out.println(boom.verifNombreDeDiviseurs(m));
					
				}else if(rechoix==4) {
					System.out.println(" Veuillez entrer le nombre pour voir le premier");
					int n = clavier.nextInt();
					System.out.println(boom.verifNombrePremier(n));
				}
				else if(choix==5) {
					System.out.println(" Veuillez entrer le nombre pour voir la factorielle");
					int n = clavier.nextInt();
					System.out.println(boom.factorielle(n));
				}else if(choix==6) {
					System.out.println(" Veuillez entrer l'entier positif à convertir en binaire");
					int n = clavier.nextInt();
					
					boom.binaire(n);
				}
			}
		}
		
		
		
clavier.close();
	}

}
