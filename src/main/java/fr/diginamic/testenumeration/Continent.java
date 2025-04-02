package fr.diginamic.testenumeration;

/**
 * Enumération des cinq continents du monde.
 */
public enum Continent {

    EUROPE("Europe"),
    AFRIQUE("Afrique"),
    AMERIQUES("Amérique"),
    ASIE("Asie"),
    OCEANIE("Océanie");

    /**
     * Correspond au libellé de chaque continent
     */
    private final String libelle;

    /**
     * Constructeur de Continent
     * @param libelle libellé du continent
     */
    private Continent(String libelle) {
        this.libelle = libelle;
    }

    /**
     * Getter de libellé
     * @return le libellé du continent
     */
    public String getLibelle() {
        return libelle;
    }
}
