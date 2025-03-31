package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {

    public static void main(String[] args) {

        // Créer une ArrayList contenant des instances de Pays
        List<Pays> pays = new ArrayList<>();
        pays.add(new Pays("France", 65_000_000, "Europe"));
        pays.add(new Pays("Allemagne", 80_000_000, "Europe"));
        pays.add(new Pays("Belgique", 10_000_000, "Europe"));
        pays.add(new Pays("Russie", 150_000_000, "Asie"));
        pays.add(new Pays("Chine", 1_400_000_000, "Asie"));
        pays.add(new Pays("Indonésie", 220_000_000, "Océanie"));
        pays.add(new Pays("Australie", 20_000_000, "Océanie"));

        // Créer une map String,Integer contenant le nom du continent et le nombre d'occurences
        Map<String, Integer> mapContinent = new HashMap<>();
        // Compteur avec la méthode getOrDefault qui récupère le compteur si existant et 0 sinon puis lui incrémente 1
        for (Pays p : pays) {
            mapContinent.put(p.getContinent(), mapContinent.getOrDefault(p.getContinent(), 0) + 1);
        }
        System.out.println("Map des continents :" + mapContinent);
    }
}
