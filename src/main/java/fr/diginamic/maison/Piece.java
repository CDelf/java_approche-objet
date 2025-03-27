package fr.diginamic.maison;

public abstract class Piece {

    double superficie;
    int etage;

    // Constructeur
    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    // Pour chaque type de Piece, retourne son nom
    public abstract String getType();

    // Redéfinition de toString pour afficher correctement le descriptif des pièces
    @Override
    public String toString() {
        return " superficie : " + superficie +
                ", etage : " + etage;
    }
}
