package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeurs
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this(nom, prenom);
        this.adresse = adresse;
    }

    // Getters
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public AdressePostale getAdresse() {
        return adresse;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    // Méthode qui retoure nom & prenom en majuscules
    public void afficherIdentite() {
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
    }
}
