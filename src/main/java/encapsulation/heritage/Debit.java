package encapsulation.heritage;

public class Debit extends Operation {
    // Constructeur
    public Debit(String date, double montant) {
        super(date, montant);
    }
    // Retourne le nom de l'opération
    public String getType() {
        return "DEBIT";
    }
    // Retourne -montant
    public double calculateAmount() {
        return -this.montant;
    }
}
