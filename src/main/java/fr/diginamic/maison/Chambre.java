package fr.diginamic.maison;

public class Chambre extends Piece {

    public Chambre(double superficie, int etage) {
        super(superficie, etage);
    }

    // Retourne "Chambre"
    public String getType() {
        return "Chambre";
    }

    @Override
    public String toString() {
        return "Chambre : " + super.toString();
    }
}
