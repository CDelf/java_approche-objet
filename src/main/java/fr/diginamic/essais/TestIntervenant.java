package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    // Test les méthodes du package salaire
    public static void main(String[] args) {
        // Création d'un salarié et d'un pigiste pour afficher leur salaire
        Salarie s = new Salarie("Dupont", "Jean", 1750);
        double s1 = s.getSalaire();
        Pigiste p = new Pigiste("Salami", "Mathieu", 15, 100);
        double s2 = p.getSalaire();
        System.out.println("Le salaire mensuel du salarié : " + s1);
        System.out.println("Le salaire mensuel du pigiste : " + s2);

        // Afficher les données des 2 intervenants
        s.afficherDonnees();
        p.afficherDonnees();
    }
}
