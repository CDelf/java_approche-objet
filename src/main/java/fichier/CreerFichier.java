package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) {
        // Définition des chemins des fichiers
        Path sourcePath = Paths.get("src/main/java/fichier/recensement.csv");
        Path outputPath = Paths.get("src/main/java/fichier/recensement_extrait.csv");

        try {
            // Lire toutes les lignes du fichier source
            List<String> lines = Files.readAllLines(sourcePath, StandardCharsets.UTF_8);

            // Vérifier si le fichier contient au moins 100 lignes
            int limit = Math.min(lines.size(), 100);
            // Extrait des 100 premières lignes
            List<String> first100Lines = lines.subList(0, limit);

            // Écrire ces lignes dans un nouveau fichier
            Files.write(outputPath, first100Lines, StandardCharsets.UTF_8);

            System.out.println("Fichier créé avec succès : " + outputPath);
        } catch (IOException e) {
            System.out.println("Erreur lors de la lecture ou écriture du fichier : " + e.getMessage());
        }
    }
}
