package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesFranceTop10 extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Trier toutes les villes par ordre décroissant de population
        List<Ville> villesPeuplees = recensement.getVilles();
        Collections.sort(villesPeuplees);

        // Afficher les 10 villes les plus peuplées
        System.out.println("Les 10 villes les plus peuplées de France : ");
        for (int i = 0; i < Math.min(10, villesPeuplees.size()); i++) {
            Ville v = villesPeuplees.get(i);
            System.out.println((i + 1) + ". " + v.getNomCommune() + " : " + v.getPopulation() + " habitants");
        }
    }
}
