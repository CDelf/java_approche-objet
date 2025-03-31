package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriVille {

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
        System.out.println("Liste initiale " + villes);

        // Collections.sort(villes); // test comparable exercice 1 et 2

        // Collators exercice 4
        Collections.sort(villes, new ComparatorNomVille());
        System.out.println("Liste triées par ordre alphabétique : " + villes);

        Collections.sort(villes, new ComparatorNbHabitants());
        System.out.println("Liste triées par ordre croissant d'habitants : " + villes);
    }
}
