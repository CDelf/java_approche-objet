package geometrie;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
    // Méthodes de l'interface ObjetGeometrique
    @Override
    public double perimetre() {
        return Math.round(2 * Math.PI * rayon * 100) / 100.0 ;
    }

    @Override
    public double surface() {
        return Math.round(rayon * rayon * Math.PI * 100) / 100.0;
    }


}
