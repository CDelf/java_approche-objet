package encapsulation;

public class TestCompte {

    public static void main(String[] args) {
        // Création d'instance, lecture et modification
        Compte c = new Compte(12345, 500);
        c.setNumCompte(54321);
        c.setSoldeCompte(499);
        System.out.println(c.getNumCompte());
        System.out.println( c.getSoldeCompte());
        System.out.println(c.toString());
    }
}
