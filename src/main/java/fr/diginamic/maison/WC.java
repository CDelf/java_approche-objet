package fr.diginamic.maison;

public class WC extends Piece {

    public WC(double superficie, int etage) {
        super(superficie, etage);
    }

    // Retourne "WC"
    public String getType() {
        return "WC";
    }

    @Override
    public String toString() {
        return "WC : " + super.toString();
    }
}
