package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class Departement implements Comparable<Departement> {

    private String codeDpt;
    private int populationDpt;

    public Departement(String codeDpt, int populationDpt) {
        this.codeDpt = codeDpt;
        this.populationDpt = populationDpt;
    }

    @Override
    public int compareTo(Departement autre) {
        return Integer.compare(autre.getPopulationDpt(), this.populationDpt); // Décroissant
    }

    public String getCodeDpt() {
        return codeDpt;
    }

    public int getPopulationDpt() {
        return populationDpt;
    }
}
