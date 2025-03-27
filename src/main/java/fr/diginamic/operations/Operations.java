package fr.diginamic.operations;

public class Operations {

    // Méthode qui réalise une opération entre 2 variables de type double
    public static double calcul(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Erreur : Division par zéro impossible.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Erreur : Opérateur invalide.");
        }
    }
}
