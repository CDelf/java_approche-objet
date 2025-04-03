package sets;

import annotations.Rule;
import annotations.ToString;
import utils.StringUtils;
import utils.Validator;


public class Pays {

    @ToString(upperCase = true, separateur = " , ")
    private String nom;
    @ToString(separateur = " | ")
    @Rule
    private int nbHabitants;
    private double pibParHabitant;

    public Pays(String nom, int nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
        Validator.validate(this); // Vérifie à chaque création d'instance si @Rule fonctionne
    }

    public double getPib() {
        return nbHabitants * pibParHabitant;
    }

    @Override
    public String toString() {
       return StringUtils.genererStringSelonAnnotation(this);
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

    public double getPibParHabitant() {
        return pibParHabitant;
    }
}
