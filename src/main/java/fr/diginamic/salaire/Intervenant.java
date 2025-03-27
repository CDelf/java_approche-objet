package fr.diginamic.salaire;

public abstract class Intervenant {

    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double getSalaire();

    public abstract String getType();

    // Méthode pour afficher les données d'un intervenant
    public void afficherDonnees() {
        // Utilisation de la méthode toString et des méthodes abstraites pour afficher les informations
        System.out.println(this.toString() + ", Statut : " + getType() + ", Salaire : " + getSalaire());
    }

    @Override
    public String toString() {
        return "Intervenant : " +
                "Nom : " + nom +
                ", Prenom : " + prenom;
    }
}
