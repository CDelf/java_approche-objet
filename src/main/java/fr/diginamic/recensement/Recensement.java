package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recensement {

    private List<Ville> villes;
    public static final String FILE_PATH = "src/main/java/fichier/recensement.csv";

    public Recensement() {
        this.villes = new ArrayList<>();
    }

    // Recherche une ville par son nom
    public Ville rechercherVille(String nomVille) {
        for (Ville ville : villes) {
            if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
                return ville;
            }
        }
        System.out.println("La ville " + nomVille + " n'a pas été trouvée.");
        return null; // Si la ville n'est pas trouvée
    }

    // Recherche les villes d'un département donné
    public List<Ville> rechercherVillesParDepartement(String codeDpt) {
        List<Ville> villesDpt = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getCodeDpt().equalsIgnoreCase(codeDpt)) {
                villesDpt.add(ville);
            }
        }
        return villesDpt;
    }

    // Recherche les villes d'une région donnée
    public List<Ville> rechercherVillesParRegion(String nomRegion) {
        List<Ville> villesRegion = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getNomRegion().equalsIgnoreCase(nomRegion)) {
                villesRegion.add(ville);
            }
        }
        return villesRegion;
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

    // Récupérer la liste des villes à partir du nom de région entré par l'utilisateur
    public static List<Ville> obtenirVillesRegion(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        scanner.nextLine(); // Absorbe le retour à la ligne si besoin
        String nomRegion = scanner.nextLine().trim();

        // Récupération des villes de la région
        List<Ville> villesRegion = recensement.rechercherVillesParRegion(nomRegion);

        // Vérification si la région existe
        if (villesRegion.isEmpty()) {
            System.out.println("Région " + nomRegion + " non trouvée. Vérifiez l’orthographe et réessayez.");
            return null;
        }
        return villesRegion;
    }

    // Méthode pour charger les villes depuis le fichier CSV
    public void chargerDepuisFichier() {
        try {
            // Lecture du fichier recensement.csv
            Path path = Paths.get(FILE_PATH);
            List<String> lignes = Files.readAllLines(path);

            // Ignorer l'en-tête
            for (int i = 1; i < lignes.size(); i++) {
                String ligne = lignes.get(i);
                String[] valeurs = ligne.split(";"); // Adapte le séparateur selon ton fichier

                // Vérifier que la ligne contient suffisamment de colonnes
                if (valeurs.length >= 10) {
                    int codeRegion = Integer.parseInt(valeurs[0].replaceAll(" ", ""));
                    String nomRegion = valeurs[1].trim();
                    String codeDpt = valeurs[2].trim();
                    int codeCommune = Integer.parseInt(valeurs[5].replaceAll(" ", ""));
                    String nomCommune = valeurs[6].trim();
                    int populationTotale = Integer.parseInt(valeurs[9].replaceAll(" ", ""));

                    // Ajouter la ville à la liste
                    villes.add(new Ville(codeRegion, nomRegion, codeDpt, codeCommune, nomCommune, populationTotale));
                }
            }
            System.out.println("Chargement terminé : " + villes.size() + " villes importées.");
        } catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format dans le fichier : " + e.getMessage());
        }
    }

    public List<Ville> getVilles() {
        return villes;
    }

}
