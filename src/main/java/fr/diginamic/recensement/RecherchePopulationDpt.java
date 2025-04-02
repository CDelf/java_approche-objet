package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class RecherchePopulationDpt extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Retourne une liste de villes à partir du codeDpt entré par l'utilisateur
        List<Ville> villesDuDpt = Recensement.obtenirVillesDuCodeDpt(recensement, scanner);
        if(villesDuDpt != null) {
            // Calcul de la population totale
            int populationTotale = 0;
            for (Ville ville : villesDuDpt) {
                populationTotale += ville.getPopulation();
            }

            // Affichage du résultat
            System.out.println("La population totale du département " + villesDuDpt.get(0).getCodeDpt() + " est de " + populationTotale + " habitants.");
        }
    }
}
