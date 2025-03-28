package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetDouble {

    public static void main(String[] args) {
        // Manipuler un set de doubles
        Set<Double> doubles = new HashSet<>(List.of(1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01));
        System.out.println(doubles);

        // Afficher le plus grand élément
        Double max = Collections.max(doubles);
        System.out.println("Valeur max : " + max);

        // Trouver et supprimer le plus petit élément
        Double min = Collections.min(doubles);
        doubles.remove(min);
        System.out.println("Set sans la valeur minimale (" + min + ") : " + doubles);




    }
}
