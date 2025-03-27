package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    private double[] tableau;

    // Constructeur
    public CalculMoyenne(double[] tableau) {
        this.tableau = tableau;
    }

    // Méthode d'ajout d'un double dans le tableau
    public void ajoutTableau(double a) {
        this.tableau = Arrays.copyOf(this.tableau, this.tableau.length + 1);
        this.tableau[this.tableau.length - 1] = a;
    }

    // Méthode de calcul de la moyenne des éléments du tableau
    public double calculMoyenne() {
        if (tableau.length == 0) {
            throw new ArithmeticException("Impossible de calculer la moyenne d'un tableau vide !");
        }
        double sum = 0;
        for (double d : tableau) {
            sum += d;
        }
        return Math.round((sum / tableau.length) * 100) / 100.0; // Arrondi à 2 décimales
    }

    // Getter pour afficher le tableau
    public double[] getTableau() {
        return tableau;
    }
}
