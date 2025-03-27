package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

    double nbJoursTravail;
    double remunerationJour;

    public Pigiste(String nom, String prenom, double nbJoursTravail, double remunerationJour) {
        super(nom, prenom);
        this.nbJoursTravail = nbJoursTravail;
        this.remunerationJour = remunerationJour;
    }

    public String getType() {
        return "Pigiste";
    }

    @Override
    public double getSalaire() {
        return this.nbJoursTravail * remunerationJour;
    }
}
