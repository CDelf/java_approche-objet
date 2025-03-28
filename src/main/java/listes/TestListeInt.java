package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>(List.of(-1, 5, 7, 3, -2, 4, 8, 5));
        System.out.println("Liste d'integers : " + ints);
        System.out.println("Taille de la liste : " + ints.size());

        // Recherche maximum de la liste (équivaut à Collections.max(ints))
        int max = Integer.MIN_VALUE; // Commencer par une petite valeur comme point de départ
        for(Integer i : ints) {
            if(i > max) {
                max = i;
            }
        }
        System.out.println("La valeur maximale est : " + max);

        // Recherche minimum de la liste (équivaut à Collections.max(ints)) et le supprimer
        Integer min = Collections.min(ints);
        ints.remove(min);
        System.out.println("Tableau sans sa valeur minimale (-2) : " + ints);

        // Modifier les éléments négatifs en positifs
        for(int i=0; i<ints.size(); i++) {
            if(ints.get(i) < 0) {
                ints.set(i, Math.abs(ints.get(i)));
            }
        }
        System.out.println("Tableau avec uniquement des positifs : " + ints);




    }
}
