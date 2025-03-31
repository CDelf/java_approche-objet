package maps;

import listes.Ville;

import java.util.HashMap;

public class MapVilles {

    public static void main(String[] args) {
        HashMap<String, Ville> mapVilles = new HashMap<>();
        mapVilles.put("Nice", new Ville("Nice", 343000));
        mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
        mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
        mapVilles.put("Lyon", new Ville("Lyon", 484000));
        mapVilles.put("Foix", new Ville("Foix", 9700));
        mapVilles.put("Pau", new Ville("Pau", 77200));
        mapVilles.put("Marseille", new Ville("Marseille", 850700));
        mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

        System.out.println("Taille initiale : " + mapVilles.size());

        int minValue = Integer.MAX_VALUE; //nb habitants le plus bas, intialisé max
        String minCle = ""; // Récupérer la clé pour la suppression

        for(String v : mapVilles.keySet()) {
            if(mapVilles.get(v).getNbHabitants() < minValue) {
                minValue = mapVilles.get(v).getNbHabitants();
                minCle = v;
            }
        }
        System.out.println("Ville avec le moins d'habitants: " + minCle);

        // Supprimer la ville avec le moins d'habitants
        mapVilles.remove(minCle);
        System.out.println("Map sans " + minCle + " : " + mapVilles);
        System.out.println("Nouvelle taille : " + mapVilles.size());
    }
}
