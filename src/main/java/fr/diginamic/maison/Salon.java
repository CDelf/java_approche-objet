package fr.diginamic.maison;

public class Salon extends Piece {

    public Salon(double superficie, int etage) {
        super(superficie, etage);
    }

    // Retourne "Salon"
    public String getType() {
        return "Salon";
    }

    @Override
    public String toString() {
        return "Salon : " + super.toString();
    }
}
