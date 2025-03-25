package entites;

public class TestAdressePostale {

    public static void main(String[] args) {
        // Création de 2 instances d'AdressePostale
        AdressePostale ap1 = new AdressePostale();
        ap1.numeroRue =12;
        ap1.libelleRue = "Rue de Paris";
        ap1.codePostal = 75001;
        ap1.ville = "Paris";


        AdressePostale ap2 = new AdressePostale();
        ap2.numeroRue = 45;
        ap2.libelleRue = "Avenue des Champs";
        ap2.codePostal = 75008;
        ap2.ville= "Paris";
    }
}
