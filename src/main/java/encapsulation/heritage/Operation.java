package encapsulation.heritage;

public abstract class Operation {
    String date;
    double montant;
    // Constructeur
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }
    // Redéfinition de la méthode toString pour un affichage optimisé
    @Override
    public String toString() {
        return "Operation : " +
                this.getType() + " " +
                "effectué le " + date +
                ", montant = " + montant + "€";
    }
    // Retourne le type d'opération
    public abstract String getType();
    // Retourne le montant positif/négatif selon le type d'opération
    public abstract double calculateAmount();
}
