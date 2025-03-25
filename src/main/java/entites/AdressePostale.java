package entites;

public class AdressePostale {

    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    // Constructeur
    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
