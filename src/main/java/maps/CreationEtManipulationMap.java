package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

    public static void main(String[] args) {
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");

        // Ajout d'éléments
        mapVilles.put(50, "Lille");
        mapVilles.put(60, "Lyon");
        mapVilles.put(33, "Bordeaux");

        // Afficher les clés
        System.out.println("Clés de la map: ");
        for(Integer k : mapVilles.keySet()) {
            System.out.println(k);
        }
        System.out.println("----------------------");

        // Afficher les valeurs
        System.out.println("Valeurs de la map: ");
        for(String v : mapVilles.values()) {
            System.out.println(v);
        }
        System.out.println("----------------------");

        // Taille de la map
        System.out.println("Taille de la map : " + mapVilles.size());


    }
}
