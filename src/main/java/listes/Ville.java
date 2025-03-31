package listes;

import java.text.Collator;
import java.util.Locale;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    @Override
    public String toString() {
        return nom + ", Nombre d'habitants : " + nbHabitants;
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
}
