package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    // Test des méthodes de la classe Maison
    public static void main(String[] args) {
        // Création d'une maison avec les 5 pièces réparties sur 2 étages
        Chambre chambre = new Chambre(15, 1);
        Cuisine cuisine = new Cuisine(18, 0);
        SalleDeBain sdb = new SalleDeBain(10, 1);
        Salon salon = new Salon(20, 0);
        WC wc = new WC(7, 1);

        // Créer une maison vide puis ajouter les pièces à la maison pour tester la méthode ajouterPiece
        Piece[] piecesMaison = new Piece[0];
        Maison maison = new Maison(piecesMaison);
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(sdb);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(wc);
        System.out.println("La maison contient : " + maison);

        // Calculer la superficie de la maison pour tester la méthode getSuperficieTotale
        double superficieMaison = maison.getSuperficieTotale();
        System.out.println("La superficie totale de la maison est : " + superficieMaison + "m²");

        // Calculer la superficie de chaque étage pour tester la méthode getSuperficieEtage
        double superficieEtage1 = maison.getsuperficieEtage(0); // rdc
        double superficieEtage2 = maison.getsuperficieEtage(1); // 1er
        System.out.println("La superficie du rez-de-chaussée est : " + superficieEtage1 + "m²");
        System.out.println("La superficie du premier étage est : " + superficieEtage2 + "m²");

        // Cas particulier, ajout d'un paramètre null ou valeurs incorrectes dans ajouterPiece
        Piece[] piecesMaison2 = new Piece[0];
        Maison maison2 = new Maison(piecesMaison2);
        Chambre c = new Chambre(10, 0);
        maison2.ajouterPiece(c);  // ajoutée
        maison2.ajouterPiece(null); // ignorée
        Salon s = new Salon(-20, 0);
        maison2.ajouterPiece(s); // ignorée
        WC w = new WC(5, -5);
        maison2.ajouterPiece(w); // ignorée
        Chambre c2 = new Chambre(15, 0);
        maison2.ajouterPiece(c2); // ajoutée

        System.out.println("Maison 2 (valeurs incorrectes ignorées sans interrompre le programme) : " + maison2);

        // Test méthode getSuperficiePiece sur maison2 avec ses 2 chambres
        double superficieChambres = maison2.getSuperficiePiece("chambre");
        System.out.println("La superficie des 2 chambres de maison2 : " + superficieChambres);
        // Retourne zéro si la pièce n'est pas présente dans la maison
        double superficieSdb = maison2.getSuperficiePiece("Salle de bain");
        System.out.println("La superficie sdb de maison 2 : " + superficieSdb);

        // Test la méthode getNbPieces
        int nbSdbM1 = maison.getNbPieces("Salle de bain");
        int nbChambresM2 = maison2.getNbPieces("Chambre");
        System.out.println("La maison 1 a " + nbSdbM1 + " salle(s) de bain.");
        System.out.println("La maison 2 a " + nbChambresM2 + " chambre(s).");



    }
}
