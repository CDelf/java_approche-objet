package fr.diginamic.recensement;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RechercheVillesDepartementTop10 extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Retourne une liste de villes à partir du codeDpt entré par l'utilisateur
        List<Ville> villesDuDpt = Recensement.obtenirVillesDuCodeDpt(recensement, scanner);
        if(villesDuDpt != null) {
            // tri
            Collections.sort(villesDuDpt);

            // Afficher les 10 villes les plus peuplées du département recherché
            System.out.println("Les 10 villes les plus peuplées du département" + villesDuDpt.get(0).getCodeDpt() + " : ");
            for (int i = 0; i < Math.min(10, villesDuDpt.size()); i++) {
                Ville v = villesDuDpt.get(i);
                System.out.println((i + 1) + ". " + v.getNomCommune() + " : " + v.getPopulation() + " habitants");
            }
        }
    }
}
