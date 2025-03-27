package fr.diginamic.maison;

public class Cuisine extends Piece {

    public Cuisine(double superficie, int etage) {
        super(superficie, etage);
    }

    // Retourne "Cuisine"
    public String getType() {
        return "Cuisine";
    }

    @Override
    public String toString() {
        return "Cuisine : " + super.toString();
    }
}
