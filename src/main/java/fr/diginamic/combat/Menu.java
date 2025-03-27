package fr.diginamic.combat;

import java.util.Scanner;

public class Menu {

    public static void afficherMenu() {
        System.out.println("\nMenu:");
        System.out.println(" 1. Créer un nouveau personnage. ");
        System.out.println(" 2. Combattre une créature. ");
        System.out.println(" 3. Prendre une potion.");
        System.out.println(" 4. Afficher mon score.");
        System.out.println(" 5. Quitter le jeu.");
    }

    public static Personnage choixOption(int option, Personnage p) {
        switch (option) {
            case 1:
                p = Personnage.initierPersonnage(); // Mise à jour du personnage
                System.out.println("Nouveau personnage : " + p);
                break;
            case 2:
                Combat combat = new Combat();
                combat.gererCombat(p); // Combat avec le personnage actuel
                break;
            case 3:
                System.out.println("Voici votre inventaire :");
                p.afficherInventaire();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Voulez-vous consommer une potion ? Entrez le numéro de la potion à consommer (1 - Potion de soin, 2 - Potion d'attaque mineure, 3 - Potion d'attaque majeure) ou 0 pour annuler.");
                if (scanner.hasNextInt()){
                    int choixPotion = scanner.nextInt();
                    if (choixPotion > 0 && choixPotion <= p.getInventaire().size()) {
                        p.consommerPotion(p.getInventaire().get(choixPotion - 1));
                    } else {
                        System.out.println("Choix invalide ou annulation.");
                    }
                } else {
                    System.out.println("L'entrée n'est pas un nombre.");
                }
                break;
            case 4:
                p.afficherScore();
                break;
            case 5:
                System.out.println("Merci d'avoir joué! Bye bye!");
                break;
            default:
                System.out.println("Option inconnue, recommencez.");
        }
        return p; // Retourne le personnage
    }
}
