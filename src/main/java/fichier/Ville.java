package fichier;

public class Ville {

    private String nom;
    private String codeDpt;
    private String region;
    private int population;


    public Ville(String nom, String codeDpt, String region, int population) {
        this.nom = nom;
        this.codeDpt = codeDpt;
        this.region = region;
        this.population = population;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ville{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", codeDpt=").append(codeDpt);
        sb.append(", region='").append(region).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodeDpt() {
        return codeDpt;
    }

    public void setCodeDpt(String codeDpt) {
        this.codeDpt = codeDpt;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}


