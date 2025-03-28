package sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSetString {

    public static void main(String[] args) {
        // Manipulation d'un set de String
        Set<String> pays = new HashSet<>(List.of("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));
        System.out.println("Set initial : " + pays);

        // Rechercher le pays ayant le plus grand nombre de lettres
        String paysLong = "";
        for(String p : pays) {
            if(p.length() > paysLong.length()) {
                paysLong = p;
            }
        }
        System.out.println("Pays du set le plus long : " + paysLong);

        // Supprimer ce pays et afficher le nouveau set
        pays.remove(paysLong);
        System.out.println("Set sans " + paysLong + " : " + pays);
    }
}
