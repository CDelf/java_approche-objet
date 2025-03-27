package fr.diginamic.entites;

public class Theatre {

    private String nom;
    private int capaciteMax;
    private int nbInscrits;
    private double recette;

    // Constructeur
    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.nbInscrits = 0;
        this.recette = 0;
    }

    // Inscrire des clients et recalculer la recette
    public void inscription(int nbClients, double prixPlace) {
        // Vérifier si le théâtre n'est pas plein
        if(this.capaciteMax < this.nbInscrits + nbClients) {
            System.out.println("Malheureusement il ne reste que " + (capaciteMax - nbInscrits) + " places.");
        } else {
            // Compte les nouveaux clients dans les inscrits
            this.nbInscrits += nbClients;
            // calcule les gains et les additionne à la recette
            this.recette += prixPlace * nbClients;
            // affiche la confirmation et la recette
            System.out.println("Inscription réussie! " + nbClients + " clients ajoutés. Recette totale : " + this.recette + "€.");
        }
    }

    @Override
    public String toString() {
        return "Theatre " + nom +
                ": capaciteMax : " + capaciteMax +
                ", nbInscrits : " + nbInscrits +
                ", recette : " + recette;
    }
}
