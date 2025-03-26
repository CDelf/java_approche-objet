package encapsulation.heritage;

public class Credit extends Operation {
    // Constructeur
    public Credit(String date, double montant) {
        super(date, montant);
    }
    // Retourne le nom de l'opération
    public String getType() {
        return "CREDIT";
    }
    // Retourne +montant
    public double calculateAmount() {
        return +this.montant;
    }
}
