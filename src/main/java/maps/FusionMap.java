package maps;

import java.util.*;

public class FusionMap {

    public static void main(String[] args) {
        // Création map1
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
        // Création map2
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        // Création map 3 contenant les clés-valeurs de map1 et map2
        Map<Integer, String> map3 = new HashMap<>();
        // On aurait pu faire map3.putAll(map1) puis map3.putAll(map2);
        for(Integer i : map1.keySet()) {
            map3.put(i, map1.get(i));
        }
        for(Integer i : map2.keySet()) {
            map3.put(i, map2.get(i));
        }

        // Afficher map3
        System.out.println("Map3 : " + map3);
    }
}
