package fr.diginamic.recensement;

import java.util.*;

public class RechercheDptPeupleTop10 extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Map pour stocker la population totale par département
        Map<String, Integer> populationParDpt = new HashMap<>();

        // Parcourir toutes les villes du recensement pour calculer la population par département
        for (Ville ville : recensement.getVilles()) {
            // Récupérer le code du département et la population de la ville
            String codeDpt = ville.getCodeDpt();
            int population = ville.getPopulation();
            // Ajouter la population de la ville au département correspondant
            populationParDpt.put(codeDpt, populationParDpt.getOrDefault(codeDpt, 0) + population);
        }

        // Créer une liste de départements à partir de la map
        List<Departement> departements = new ArrayList<>();
        for(String dpt : populationParDpt.keySet()) {
            Departement d = new Departement(dpt, populationParDpt.get(dpt));
            departements.add(d);
        }
        // Trier la liste des départements par population décroissante
        Collections.sort(departements);

        // Afficher les 10 départements les plus peuplés
        System.out.println("Les 10 départements les plus peuplés :");
        for (int i = 0; i < Math.min(10, departements.size()); i++) {
            Departement d = departements.get(i);
            System.out.println((i + 1) + ". " + d.getCodeDpt() + " : " + d.getPopulationDpt() + " habitants");
        }

    }
}
