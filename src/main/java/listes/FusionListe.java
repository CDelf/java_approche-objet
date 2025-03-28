package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {
        // Créer une 3e liste qui contient les données des 2 listes précédentes
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");
        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<>();
        for(String s1 : liste1) {
            liste3.add(s1);
        }
        for(String s2 : liste2) {
            liste3.add(s2);
        }
        System.out.println("liste 3 : " + liste3);
    }
}
