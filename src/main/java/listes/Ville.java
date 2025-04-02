package listes;

import fr.diginamic.testenumeration.Continent;

import java.text.Collator;
import java.util.Locale;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitants;
    private Continent continent;


    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public Ville(String nom, int nbHabitants, Continent continent) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.continent = continent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ville {");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", nbHabitants=").append(nbHabitants);
        sb.append(", continent=").append(continent);
        sb.append('}');
        return sb.toString();
    }

    // Tri exercice 1 : alphabétique par nom de ville
//    @Override
//    public int compareTo(Ville autre) {
//        Collator collator = Collator.getInstance(Locale.FRANCE);
//        return collator.compare(this.getNom(), autre.getNom());
//    }

    // Exercice 2 : par nb d'habitant, non utilisé car Comparator
    @Override
    public  int compareTo(Ville autre){
        return Integer.compare(this.nbHabitants, autre.getNbHabitants()); // croissant
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public Continent getContinent() {
        return continent;
    }
}
