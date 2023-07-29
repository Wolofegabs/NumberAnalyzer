package com.gabrielstech.entrainement;
import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Operation {
	Scanner clavier = new Scanner(System.in);
	
	String votrenom() {
		System.out.println("Entrez votre prénom svp!");
		String nom = clavier.next();
		
		return nom;
		
	}
	
	int messagedebienvenu(){
		System.out.println(" Soyez le/la bienvenu(e) "+this.votrenom());
		System.out.println("Quelle opération voulez vous réaliser ?\n"
	+ " Entrez 1 pour le ppcm\n 2 pour le pgcd\n 3 pour determiner le nombre de diviseur entier"
	+ "\n 4 pour determiner un nombre premier\n"
	+ "5 pour la factorielle \n 6 pour convertir un entier positif en binaire");
		int num = clavier.nextInt();
		return num;
	}
	
	
	String factorielle(int a) {
		
		int i=1;
		int j=1;
		String resultat=null;
		for(i=1;i<=a;i++) {
			j *=i;
			
		}
		resultat = " La factorielle de "+a+" est :"+j;
		return resultat;
	}
	
	String verifNombrePremier(int a) {
		String resultat = null;
		if(a>=2 && a>=0) {
			int j = 0;
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					 
					j++;
				}
				if(j==2) {
					 resultat = "Le nombre "+a+" est un nombre premier";
				}else {
					 resultat = "Le nombre "+a+" n'est pas un nombre premier";
				}
			}
			
		}else {
			 resultat = "Le nombre "+a+" n'est pas un nombre premier";
		}
		return resultat;
		
	}
	
	String verifNombreDeDiviseurs(int a) {
	 String resultat;
		if(a>0) {
			int j = 0;
			for(int i=1;i<=a;i++) {
				if(a%i==0) {
					 
					j++;
					System.out.println(i+" divise "+a);
				}
				
			}
			 resultat ="Le nombre "+a+" a "+j+" diviseur(s)";
			
		}else {
			resultat = "Veuillez entrer un nombre entier positif svp.";
		}
		return resultat;
		
		
		
	}
	
	String ppcm(int a,int b) {
		String resultat=null;
		int i=0;
		if(a>0&&b>0) {
			do {
				i++;
			}while(i%a !=0 || i%b!=0);
			resultat= "Le ppcm de "+a+" et "+b+" est "+i;
			
		}else if(a==0 ||b==0){
			resultat= "Le ppcm de "+a+" et "+b+" est 0";
		}
		else {
			resultat = "Veuillez entrer deux nombres strictement positif";
		}
		return resultat;
		
	}
	String pgcd(int a,int b) {
		String resultat=null;
		int i=0;
		if(a>0 && b>0) {
			for(i=1;i<= min(a, b);i++) {
				if(a%i==0 && b%i==0) {
					resultat= "Le pgcd de "+a+" et "+b+" est"+i;
				}
				
			}
		}else if (a==0 || b==0) {
			resultat= a+ " et "+b+" n'admet pas de pgcd";
		}
		else {
			resultat= " Veuillez entrer deux nombres entier positif svp";
		}
		return resultat;
		
		
	}
	void binaire(int n) {
		if(n>=0) {
			ArrayList<Integer>tab= new ArrayList<Integer>();
		     int i=0;
		     tab.add((int) pow(2,i));
		     while(n>= tab.get(i)) {
		    	 i++;
		    	 tab.add((int) pow(2,i));
		     }
		     int taille = tab.size();
		     for(int j= taille-2;j>=0;j--) {
		    	 n= n- tab.get(j);
		    	 if(n>=0) {
		    		 System.out.print("1");
		    	 }else {
		    		 System.out.print("0");
			    	 n= n+ tab.get(j);
		    	 }
		    	
		     }
		}else {
			System.out.print("Le nombre "+n+" n'est pas un entier positif.");
			
		}
		
	}
	
	
}
