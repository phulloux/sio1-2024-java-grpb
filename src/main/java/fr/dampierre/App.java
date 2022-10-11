package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    int nbLancers = 5;
    int caseObjectif = 20;
    int laCase = 0;

    boolean gagne = false;
    while (!gagne) {
      laCase = 0;
      for (int i = 1; i <= nbLancers; i++) {
        // lancer le dé
        Random generateur = new Random();
        int lancer = generateur.nextInt(6) + 1;
        System.out.println("Vous avez fait " + lancer);

        // avancer le pion
        laCase = laCase + lancer;
        System.out.println("Vous êtes sur la case " + laCase);
      }

      // Tester si on a gagné
      if (laCase == caseObjectif) {
        System.out.println("Vous avez gagné !");
        gagne = true;
      } else {
        System.out.println("Vous avez perdu !");
      }
    }
  }

  // public static void main(String[] args) {
  // int salaire = 400;
  // int prime = 250;
  // int quota = 10;

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez votre nombre de ventes : ");
  // int nbVentes = clavier.nextInt();
  // clavier.close();

  // // Le IF/ELSE est nécessaire parce qu'on n'affiche
  // // pas le même message en fonction du nombre de ventes
  // if (nbVentes >= quota) {
  // System.out.println("Félicitations !");
  // salaire = salaire + prime;
  // } else {
  // int nbVentesManquantes = quota - nbVentes;
  // System.out.println("Il vous manque " + nbVentesManquantes + " ventes");
  // }

  // System.out.println("Votre salaire est de : " + salaire);
  // }

  // public static void main(String[] args) {

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez les heures : ");
  // int heures = clavier.nextInt();
  // System.out.print("Entrez les minutes : ");
  // int minutes = clavier.nextInt();
  // System.out.print("Entrez les secondes : ");
  // int secondes = clavier.nextInt();
  // clavier.close();

  // int secondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

  // System.out.println("Il s'est écoulé " + secondesDepuisMinuit + " secondes depuis minuit.");
  // }


  // public static void main(String[] args) {
  // int heures = 12;
  // int minutes = 34;
  // int secondes = 56;

  // int secondesDepuisMinuit = heures * 60 * 60 + minutes * 60 + secondes;

  // System.out.println("Il s'est écoulé " + secondesDepuisMinuit + " secondes depuis minuit.");
  // }



  // public static void main(String[] args) {
  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez un premier mot : ");
  // String mot1 = clavier.nextLine();
  // System.out.print("Entrez un nombre : ");
  // int nombre = clavier.nextInt();
  // clavier.nextLine();
  // System.out.print("Entrez un deuxième mot : ");
  // String mot2 = clavier.nextLine(); // comm
  // System.out.print("Entrez un adjectif : ");
  // String adjectif = clavier.nextLine();

  // String phrase = "Il était une fois un " + mot1 + " qui avait " + nombre + " " + mot2
  // + ". Cela le rendait très " + adjectif + ".";

  // System.out.println(phrase);
  // }

  // public static void main(String[] args) {
  // System.out.println("Bonjour !");

  // // Récupérer le nombre d’heures travaillées

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez votre nombre d'heures travaillées : ");
  // int heuresTravaillees = clavier.nextInt();

  // // Récupérer le taux horaire
  // System.out.print("Entrez votre taux horaire : ");
  // double tauxHoraire = clavier.nextDouble();

  // clavier.close();

  // // Multiplier le nombre d’heures par le taux horaire
  // double salaireBrut = heuresTravaillees * tauxHoraire;

  // // Afficher le résultat
  // // System.out.print("Le salaire brut est de : ");
  // // System.out.println(salaireBrut);
  // System.out.println("Le salaire brut est de : " + salaireBrut);
  // }

}
