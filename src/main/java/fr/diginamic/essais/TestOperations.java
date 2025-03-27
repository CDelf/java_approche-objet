package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    // Test de la méthode calcul de la classe Operations
    public static void main(String[] args) {
        try {
            // Tester chaque type d'opérations
            System.out.println("Addition : " + Operations.calcul(2, 2, '+'));
            System.out.println("Soustraction : " + Operations.calcul(5, 3, '-'));
            System.out.println("Multiplication : " + Operations.calcul(2, 3, '*'));
            System.out.println("Division : " + Operations.calcul(10, 2, '/'));

            // Cas particuliers
            System.out.println("Division par zéro : " + Operations.calcul(10, 0, '/'));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Opérateur invalide : " + Operations.calcul(5, 2, 'h'));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
