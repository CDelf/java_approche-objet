package fr.diginamic.maison;

public class SalleDeBain extends Piece {

    public SalleDeBain(double superficie, int etage) {
        super(superficie, etage);
    }

    // Retourne "Salle de bain"
    public String getType() {
        return "Salle de bain";
    }

    @Override
    public String toString() {
        return "Salle de bain : " + super.toString();
    }
}
