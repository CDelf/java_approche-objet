package encapsulation;

public class Compte {
    private int numCompte;
    private double soldeCompte;

    // Constructeur
    public Compte(int numCompte, double soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    // Getters et setters
    public int getNumCompte() {
        return numCompte;
    }
    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }
    public double getSoldeCompte() {
        return soldeCompte;
    }
    public void setSoldeCompte(double soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Compte : " +
                "numCompte = " + numCompte +
                ", soldeCompte = " + soldeCompte;
    }
}
