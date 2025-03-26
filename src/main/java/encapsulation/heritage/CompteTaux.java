package encapsulation.heritage;

public class CompteTaux extends Compte {

    float tauxRemuneration;

    // Constructeur
    public CompteTaux(int numCompte, double soldeCompte, float tauxRemuneration) {
        super(numCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    // Redéfinition toString pour tout afficher
    @Override
    public String toString() {
        return super.toString() + ", Taux de Remuneration=" + tauxRemuneration;
    }
}
