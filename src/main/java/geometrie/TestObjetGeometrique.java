package geometrie;

public class TestObjetGeometrique {

    public static void main(String[] args) {
        // Tableau d'objets géométriques
        Cercle c = new Cercle(3);
        Rectangle r = new Rectangle(5, 2);
        ObjetGeometrique[] ogs = {c, r};

        // Afficher périmètre et surface de chaque objet
        for(ObjetGeometrique og : ogs) {
            System.out.println("Périmètre : " + og.perimetre() + ", Surface : " + og.surface());
        }
    }
}
