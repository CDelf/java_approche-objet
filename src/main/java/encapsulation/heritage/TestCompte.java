package encapsulation.heritage;

public class TestCompte {

    public static void main(String[] args) {
        // Création d'instances Compte et CompteTaux
        Compte c1 = new Compte(12345, 500);
        CompteTaux c2 = new CompteTaux(23456, 109, 0.8f);
        // Tableau de Comptes
        Compte[] comptes = {c1, c2};
        // Affichage des informations de ces 2 comptes
        for(Compte c : comptes) {
            System.out.println(c);
        }
    }
}
