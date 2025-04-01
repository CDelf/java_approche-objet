package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesRegionTop10 extends MenuService {


    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Récupérer la liste des villes à partir du nom de région entré par l'utilisateur
        List<Ville> villesRegion = Region.obtenirVillesRegion(recensement, scanner);
        if(villesRegion != null) {
            // Tri
            Collections.sort(villesRegion);

            // Afficher les 10 villes les plus peuplées de la région recherchée
            System.out.println("Les 10 villes les plus peuplées de la région" + villesRegion.get(0).getNomRegion() + " : ");
            for (int i = 0; i < Math.min(10, villesRegion.size()); i++) {
                Ville v = villesRegion.get(i);
                System.out.println((i + 1) + ". " + v.getNomCommune() + " : " + v.getPopulation() + " habitants");
            }
        }
    }
}
