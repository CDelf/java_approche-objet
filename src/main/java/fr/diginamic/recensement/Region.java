package fr.diginamic.recensement;


import java.util.List;
import java.util.Scanner;

public class Region implements Comparable<Region> {

    private String nomRegion;
    private int population;

    public Region(String nomRegion, int population) {
        this.nomRegion = nomRegion;
        this.population = population;
    }

    @Override
    public int compareTo(Region autre) {
        return Integer.compare(autre.getPopulation(), this.population); // Décroissant
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}