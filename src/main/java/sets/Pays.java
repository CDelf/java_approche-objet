package sets;

public class Pays {

    private String nom;
    private int nbHabitants;
    private double pibParHabitant;

    public Pays(String nom, int nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }

    public double getPib() {
        return nbHabitants * pibParHabitant;
    }

    @Override
    public String toString() {
        return nom + " : " +
                nbHabitants + " habitants" +
                ", PIB/Habitant : " + pibParHabitant + " USD";
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
