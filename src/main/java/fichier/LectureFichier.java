package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LectureFichier {

    public static final String FILE_PATH = "src/main/java/fichier/recensement.csv";
    public static final String FILE_PATH_OUT = "src/main/java/fichier/recensement_grandesVilles.csv";

    public static void main(String[] args) {
        // Exercice instanciation
        List<Ville> villeList = new ArrayList<>();
        // Exercice générerFichier
        List<Ville> gdesVillesList = new ArrayList<>();

        // Lecture du fichier recensement.csv
        Path path = Paths.get(FILE_PATH);

        if (Files.exists(path)) {
            try {
                List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

                for (int i = 1, size= lines.size(); i < size; i++) {  // Ignorer l'en-tête
                    String[] tokens = lines.get(i).split(";");

                    // Vérification que la ligne contient au moins 10 colonnes
                    if (tokens.length >= 10) {
                        String nom = tokens[6];  // Nom de la ville
                        String codeDepartement = tokens[2]; // Code département
                        String nomRegion = tokens[1]; // Nom de la région
                        int population = Integer.parseInt(tokens[9].trim().replaceAll(" ", "")); // Population totale

                        Ville ville = new Ville(nom, codeDepartement, nomRegion, population);
                        villeList.add(ville);

                        // Filtrer les villes de plus de 25000 habitants
                        if (population > 25_000) {
                            gdesVillesList.add(ville);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
            }
        } else {
            System.out.println("Le fichier n'existe pas !");
        }

        // Génération du fichier pour les grandes villes
        Path outputPath = Paths.get(FILE_PATH_OUT);

        try {
            // Trié selon nb habitant décroissant
            Collections.sort(gdesVillesList);
            List<String> lignesFichier = new ArrayList<>();
            // Ajouter l'en-tête
            lignesFichier.add("Nom;Code Département;Nom Région;Population");

            // Ajouter les données des villes
            for (Ville v : gdesVillesList) {
                lignesFichier.add(v.getNom() + ";" + v.getCodeDpt() + ";" + v.getRegion() + ";" + v.getPopulation());
            }

            // Écriture dans le fichier
            Files.write(outputPath, lignesFichier, StandardCharsets.UTF_8);
            System.out.println("Fichier généré avec succès : " + outputPath.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Erreur lors de l'écriture du fichier : " + e.getMessage());
        }
    }
}
