package geometrie;

public class Rectangle implements ObjetGeometrique {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (largeur + longueur)*2;
    }

    @Override
    public double surface() {
        return largeur * longueur;
    }
}
