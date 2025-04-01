package fr.diginamic.recensement;


public class Ville implements Comparable<Ville> {

    private int codeRegion;
    private  String nomRegion;
    private String codeDpt;
    private int codeCommune;
    private String nomCommune;
    private int population;

    public Ville(int codeRegion, String nomRegion, String codeDpt, int codeCommune, String nomCommune, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDpt = codeDpt;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.population = population;
    }

    @Override
    public int compareTo(Ville autre) {
        return Integer.compare(autre.getPopulation(), this.population); // Décroissant
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getCodeDpt() {
        return codeDpt;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
