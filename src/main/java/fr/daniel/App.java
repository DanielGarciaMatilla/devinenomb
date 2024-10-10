package fr.daniel;

import java.util.Random;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
         // Création d'un objet Random pour générer un nombre aléatoire entre 1 et 100
        Random random = new Random();
        int nombreADeviner = random.nextInt(100) + 1;  // Génère un nombre entre 1 et 100

        // Demande à l'utilisateur de deviner le nombre
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        
        // Utilisation de Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int proposition = scanner.nextInt();
        
        // Affichage des informations
        System.out.println("Vous proposez : " + proposition);
        System.out.println("Le nombre auquel je pensais était : " + nombreADeviner);
        
        // Calcul et affichage de la différence
        int difference = Math.abs(nombreADeviner - proposition);
        System.out.println("Vous étiez à " + difference + " de la bonne réponse.");
        
        // Fermeture du scanner
        scanner.close();
    }
    
}
