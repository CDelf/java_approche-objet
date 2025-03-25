package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        // 1ère instance de Personne
        AdressePostale ap1 = new AdressePostale();
        ap1.numeroRue =12;
        ap1.libelleRue = "Rue de Paris";
        ap1.codePostal = 75001;
        ap1.ville = "Paris";

        Personne p1 = new Personne();
        p1.nom = "Dupont";
        p1.prenom = "Jean";
        p1.adresse = ap1;

        // 2ème instance de personne
        AdressePostale ap2 = new AdressePostale();
        ap2.numeroRue = 45;
        ap2.libelleRue = "Avenue des Champs";
        ap2.codePostal = 75008;
        ap2.ville= "Paris";

        Personne p2 = new Personne();
        p2.nom = "Martin";
        p2.prenom = "Sophie";
        p2.adresse = ap2;
    }
}
