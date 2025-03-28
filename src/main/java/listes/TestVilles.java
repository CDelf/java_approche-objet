package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

    public static void main(String[] args) {
        // Liste de villes
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));
        System.out.println("Liste initiale : " + villes);

        // Rechercher la ville la plus peuplée
        Ville villePeuplee = villes.getFirst();
        for(Ville v : villes) {
            if(v.getNbHabitants() > villePeuplee.getNbHabitants()) {
                villePeuplee = v;
            }
        }
        System.out.println("Ville la plus peuplée : " + villePeuplee );

        // Trouver et supprimer la ville la moins peuplée
        Ville villeMoinsPeuplee = villes.getFirst();
        // Trouver
        for (Ville v : villes) {
            if (v.getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = v;
            }
        }
        // Supprimer
        if (villeMoinsPeuplee != null) {
            villes.remove(villeMoinsPeuplee);
        }
        System.out.println("Liste sans la ville la moins peuplée : " + villes );

    // Modifier les villes ayant plus de 100 000 habitants : 1ère lettre majuscule
        for(Ville v : villes) {
            if(v.getNbHabitants() < 100000) {
                // Transformer la première lettre en majuscule et conserver le reste
                v.setNom(v.getNom().toUpperCase());
            }
        }
        System.out.println("Tableau après modification si nbHabitants > 100 000 :" + villes);
    }
}
