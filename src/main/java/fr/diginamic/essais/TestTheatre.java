package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    // Test le bon fonctionnement de l'inscription dans la classe Theatre
    public static void main(String[] args) {
        // Créer une instance
        Theatre theatre = new Theatre("Big Show", 100);

        // Affichage des résultats des tests
        System.out.println("Avant inscription : " + theatre);
        // Inscription réussie
        System.out.println("--------------------------------------");
        theatre.inscription(80, 20);
        System.out.println("Après inscription réussie : " + theatre);
        // Inscription échouée par manque de places
        System.out.println("--------------------------------------");
        theatre.inscription(30, 20);
        System.out.println("Après inscription échouée : " + theatre);
    }
}
