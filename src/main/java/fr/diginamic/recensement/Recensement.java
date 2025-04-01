package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
