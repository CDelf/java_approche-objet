package pays;

import java.util.Objects;

public class Pays {

    private String nom;
    private int population;

    @Override
    public final boolean equals(Object o) {
        if (o instanceof Pays pays) {
            return population == pays.population && Objects.equals(nom, pays.nom);
        }
        return false;
    }

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
