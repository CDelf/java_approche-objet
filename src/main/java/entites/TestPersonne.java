package entites;

import entites2.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        // 1ère instance de Personne
        AdressePostale ap1 = new AdressePostale(12, "Rue de Paris", 75001, "Paris");
        AdressePostale nvAp1 = new AdressePostale(62, "rue de la Campagne", 12340, "Trouville");

        Personne p1 = new Personne("Dupont", "Jean", ap1);
        p1.afficherIdentite();
        p1.setAdresse(nvAp1);

        // 2ème instance de personne
        AdressePostale ap2 = new AdressePostale(45, "Avenue des Champs", 75008, "Paris");
        AdressePostale nvAp2 = new AdressePostale(1, "avenue des Champs Elysees", 75000, "Paris");
        Personne p2 = new Personne("Martin", "Sophie", ap2);
        p2.afficherIdentite();
        p2.setAdresse(nvAp2);
    }
}
