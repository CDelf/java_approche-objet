package pays;

public class TestEqualsPays {

    public static void main(String[] args) {
        // Créer 2 pays avec les mêmes attributs
        Pays p1 = new Pays("Pays imaginaire", 106);
        Pays p2 = new Pays("Pays imaginaire", 106);
        // Un 3ème avec un attribut différent
        Pays p3 = new Pays("Pays imaginaire", 105);


        // Les comparer avec la méthode réécrite equals
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1 == p2); // false
        System.out.println(p1 == p3); // false


    }
}
