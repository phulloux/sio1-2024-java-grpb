package fr.dampierre;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    System.out.print("Entrez un premier mot : ");
    String mot1 = clavier.nextLine();
    System.out.print("Entrez un nombre : ");
    int nombre = clavier.nextInt();
    clavier.nextLine();
    System.out.print("Entrez un deuxième mot : ");
    String mot2 = clavier.nextLine();
    System.out.print("Entrez un adjectif : ");
    String adjectif = clavier.nextLine();

    String phrase = "Il était une fois un " + mot1 + " qui avait " + nombre + " " + mot2
        + ". Cela le rendait très " + adjectif + ".";

    System.out.println(phrase);
  }

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
