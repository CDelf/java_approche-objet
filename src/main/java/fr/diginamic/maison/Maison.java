package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

    private Piece[] pieces;

    // Constructeur
    public Maison(Piece[] pieces) {
        this.pieces = pieces;
    }

    // Méthode pour ajouter une piece à la maison
    public void ajouterPiece(Piece piece) {
        // Gestion du null
        if (piece != null) {
            if (piece.superficie < 0 || piece.etage < 0) {
                System.out.println("Impossible d'ajouter une pièce avec une superficie ou un numéro d'étage négatif.");
            } else {
                // Ajout
                this.pieces = Arrays.copyOf(this.pieces, this.pieces.length + 1);
                this.pieces[this.pieces.length - 1] = piece;
            }
        } else {
            System.out.println("Impossible d'ajouter une pièce null");
        }
    }

    // Calcule la superficie totale en additionnant celle de chaque pièce
    public double getSuperficieTotale() {
        double superficieTotale = 0;
        if (hasPieces()) {
            for (Piece p : pieces) {
                superficieTotale += p.superficie;
            }
        }
        return superficieTotale;
    }

    // Calcule la superficie d'un étage donné
    public double getsuperficieEtage(int etage) {
        double superficieEtage = 0;
        if (hasPieces()) {
            for (Piece p : pieces) {
                if (p.etage == etage) {
                    superficieEtage += p.superficie;
                }
            }
        }
        return superficieEtage;
    }

    // Retourne la superficie d'un type de pièce donné
    public double getSuperficiePiece(String typePiece) {
        double superficiePiece = 0;
        if(hasPieces()) {
            for(Piece p : pieces) {
                if(p.getType().equalsIgnoreCase(typePiece.trim())) {
                    superficiePiece += p.superficie;
                }
            }
        }
        return superficiePiece;
    }

    // Retourne le nombre d'un type de pièce présent dans une maison
    public int getNbPieces(String typePiece) {
        int nbPieces = 0;
        if(hasPieces()) {
            for(Piece p : pieces) {
                if(p.getType().equalsIgnoreCase(typePiece.trim())) {
                    nbPieces++;
                }
            }
        }
        return nbPieces;
    }

    // Méthode utilitaire pour vérifier si la maison contient des pièces
    private boolean hasPieces() {
        return this.pieces != null && this.pieces.length > 0;
    }

    @Override
    public String toString() {
        return "Maison : " +
                "pieces : " + Arrays.toString(pieces);
    }
}
