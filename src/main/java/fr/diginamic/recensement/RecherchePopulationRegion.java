package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Récupérer la liste des villes à partir du nom de région entré par l'utilisateur
        List<Ville> villesRegion = Region.obtenirVillesRegion(recensement, scanner);
        if(villesRegion != null) {
            // Calcul de la population totale
            int populationTotale = 0;
            for (Ville ville : villesRegion) {
                populationTotale += ville.getPopulation();
            }
            // Affichage du résultat
            System.out.println("La population totale de la région " + villesRegion.get(0).getNomRegion() + " est de " + populationTotale + " habitants.");
        }
    }
}
