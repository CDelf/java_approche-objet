package fr.diginamic.testenumeration;

import listes.Ville;

import java.util.*;

public class TestContinentAvecEnum {

    public static void main(String[] args) {
        // Créer une liste de villes
        List<Ville> villes = new ArrayList<>(Arrays.asList(
                new Ville("New York", 20_000_000, Continent.AMERIQUES),
                new Ville("Paris", 2_100_000, Continent.EUROPE),
                new Ville("Pékin", 21_300_000, Continent.ASIE),
                new Ville("Moscou", 13_100_000, Continent.ASIE),
                new Ville("Berlin", 3_800_000, Continent.EUROPE),
                new Ville("Sydney", 5_249_000, Continent.OCEANIE),
                new Ville("Sao Paulo", 12_396_000, Continent.AMERIQUES),
                new Ville("Dakar", 3_630_000, Continent.AFRIQUE)
        ));

        // Boucle qui affiche les villes et leur continent respectif
        for(Ville v : villes) {
            System.out.println(v.getNom() + ", continent : " + v.getContinent().getLibelle());
        }
    }
}