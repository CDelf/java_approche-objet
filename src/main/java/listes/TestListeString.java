package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

    public static void main(String[] args) {
        // Manipuler une liste de String
        List<String> strings = new ArrayList<>(List.of("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
        System.out.println("Liste initiale :" + strings );

        // Rechercher le mot qui a le plus grand nombre de lettres
        String longest = "";
        for (String s : strings) {
            if (s.length() > longest.length()) { // Comparaison directe des longueurs
                longest = s;
            }
        }
        System.out.println("Mot le plus long : " + longest);

        // Mettre tous les mots en majuscules
        for(int i=0, size=strings.size()-1; i <= size; i++) {
            strings.set(i, strings.get(i).toUpperCase());
        }
        System.out.println("Liste en majuscules : " + strings);

        // Supprimer les mots qui commencent par N
        Iterator<String> it = strings.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.toUpperCase().startsWith("N")) {
                it.remove();
            }
        }
        System.out.println("Liste sans mots commençant par N : " + strings);
    }
}
