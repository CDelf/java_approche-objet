package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class Departement implements Comparable<Departement> {

    private String codeDpt;
    private int populationDpt;

    public Departement(String codeDpt, int populationDpt) {
        this.codeDpt = codeDpt;
        this.populationDpt = populationDpt;
    }

    @Override
    public int compareTo(Departement autre) {
        return Integer.compare(autre.getPopulationDpt(), this.populationDpt); // Décroissant
    }

    // Récupère le code département entré par l'utilisateur, retourne les villes si existantes
    public static List<Ville> obtenirVillesDuCodeDpt(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le code du département (ex: 75, 13, 69) : ");
        scanner.nextLine(); // Absorbe le retour à la ligne si besoin
        String codeDpt = scanner.nextLine().trim();

        // Pour les codes < 10, ajout d'un 0 devant si nécessaire
        if (codeDpt.length() == 1) {
            codeDpt = "0" + codeDpt;
        }
        // Récupération des villes du département
        List<Ville> villesDuDpt = recensement.rechercherVillesParDepartement(codeDpt);

        // Vérification si le département existe
        if (villesDuDpt.isEmpty()) {
            System.out.println("Aucune ville trouvée pour le département " + codeDpt + ". Vérifiez le code et réessayez.");
            return null;
        }
        // S'il existe, retourne la liste des villes du département
        return villesDuDpt;
    }

    public String getCodeDpt() {
        return codeDpt;
    }

    public int getPopulationDpt() {
        return populationDpt;
    }
}
