package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreationListe {

    public static void main(String[] args) {
        // Création d'une liste qui stocke tous les nombres de 1 à 100
        List<Integer> intList = new ArrayList<>();
        for(int i=1; i<=100; i++) {
            intList.add(i);
        }
        System.out.println("Taille de la liste : " + intList.size());
    }
}
