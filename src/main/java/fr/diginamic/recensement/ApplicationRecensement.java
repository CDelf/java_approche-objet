package fr.diginamic.recensement;

import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) {
        System.out.println("Bienvenue! Chargement des données...");

        // Chargement des données
        Recensement recensement = new Recensement();
        recensement.chargerDepuisFichier();

        // Création du scanner
        Scanner scanner = new Scanner(System.in);

        // Gestion du menu via MenuHandler
        int option;
        do {
            MenuHandler.afficherMenu();
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                MenuHandler.choixOption(option, recensement, scanner);
            } else {
                System.out.println("Ceci n'est pas une option valide, recommencez.");
                scanner.next(); // Nettoie l'entrée invalide
                option = 0; // Assure que la boucle continue
            }
        } while (option != 9);

        System.out.println("Programme terminé.");
        scanner.close(); // Fermeture du scanner
    }
}
