package entites2;

import entites.AdressePostale;

public class Personne {

    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur nom prenom uniquement
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Constructeur complet
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this(nom, prenom);
        this.adresse = adresse;
    }
}
