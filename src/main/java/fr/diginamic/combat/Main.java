package fr.diginamic.combat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialisation du personnage
        System.out.println("Bienvenue combattant! Voici ton personnage: ");
        Personnage p = Personnage.initierPersonnage();
        System.out.println(p);

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            Menu.afficherMenu();
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                p = Menu.choixOption(option, p); // Mise à jour du personnage
            } else {
                System.out.println("Ceci n'est pas une option valide, recommencez.");
                scanner.next();
                option = 0; // Assure que la boucle continue
            }
        } while (option != 5);

        System.out.println("Fin du jeu.");
        scanner.close();
    }
}
