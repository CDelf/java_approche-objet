package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {

    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";

        // Afficher le premier caractère de la chaîne
        char premierCaractere = chaine.charAt(0);
        System.out.println("1) Premier caractère: " + premierCaractere);

        // Afficher la longueur de la chaîne
        System.out.println("2) Longueur de la chaîne : " + chaine.length());

        // Trouver le premier ; dans la chaîne
        int indexPremierSeparateur = chaine.indexOf(';');
        System.out.println("3) Le premier ; est situé à l'index : " + indexPremierSeparateur);

        // Extraire le nom de famille
        String nom = chaine.substring(0, indexPremierSeparateur);
        System.out.println("4) Le nom de famille est : " + nom);

        // Mettre le nom en majuscules puis en minuscules
        System.out.println("5) Nom en majuscules " + nom.toUpperCase());
        System.out.println("6) Nom en minuscules " + nom.toLowerCase());

        // Découper la phrase en utilisant les ; et retourner les mots dans un tableau
        String[] parties = chaine.split(";");
        System.out.println("7) Voici les parties de la chaîne : " + Arrays.toString(parties));

        // Création d'une instance de Salarie à partir de la chaine
        double salaire = Double.parseDouble(parties[2].replace(" ", ""));
        Salarie salarie = new Salarie(parties[0], parties[1], salaire);
        System.out.println("9) Salarié créé : " + salarie);
    }
}
