package fr.diginamic.recensement;

import java.util.*;

public class RechercheRegionPeupleeTop10 extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Map pour stocker la population totale par région
        Map<String, Integer> populationParRegion = new HashMap<>();

        // Parcourir toutes les villes du recensement pour calculer la population par région
        for (Ville ville : recensement.getVilles()) {
            // Récupérer le nom de la région et la population de la ville
            String region = ville.getNomRegion();
            int population = ville.getPopulation();
            // Ajouter la population de la ville à la région correspondante
            populationParRegion.put(region, populationParRegion.getOrDefault(region, 0) + population);
        }

        // Créer une liste de régions à partir de la map
        List<Region> regions = new ArrayList<>();
        for(String region : populationParRegion.keySet()) {
            Region r = new Region(region, populationParRegion.get(region));
            regions.add(r);
        }
        // Trier la liste des régions par population décroissante
        Collections.sort(regions);

        // Afficher les 10 régions les plus peuplées
        System.out.println("Les 10 régions les plus peuplées :");
        for (int i = 0; i < Math.min(10, regions.size()); i++) {
            Region region = regions.get(i);
            System.out.println((i + 1) + ". " + region.getNomRegion() + " : " + region.getPopulation() + " habitants");
        }
    }
}
