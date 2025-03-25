package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        // 1ère instance de Personne
        AdressePostale ap1 = new AdressePostale(12, "Rue de Paris", 75001, "Paris");

        Personne p1 = new Personne("Dupont", "Jean", ap1);

        // 2ème instance de personne
        AdressePostale ap2 = new AdressePostale(45, "Avenue des Champs", 75008, "Paris");

        Personne p2 = new Personne("Martin", "Sophie", ap2);
    }
}
