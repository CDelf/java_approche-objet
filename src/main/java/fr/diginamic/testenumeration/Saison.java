package fr.diginamic.testenumeration;

/**
 * Enumération contenant les 4 saisons de l'année
 * Chaque saison est définie avec un libellé et un numéro d'ordre
 */
public enum Saison {

    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    /** Libellé de la saison */
    private final String libelle;
    /** Numéro d'ordre */
    private final int numOrdre;

    /**
     * Constructeur de l'énumération Saison
     *
     * @param libelle libelle de la saison
     * @param numOrdre numéro d'ordre correspondant à la saison
     */
    private Saison(String libelle, int numOrdre) {
        this.libelle = libelle;
        this.numOrdre = numOrdre;
    }

    /**
     * Méthode permettant de récupérer une instance Saison à partir d'un String libellé
     *
     * @param libelle String permettant de rechercher une saison avec son libellé
     * @return l'instance Saison correspondant au libellé si existant
     * @throws IllegalArgumentException si aucune Saison ne correspond au libellé
     */
    public static Saison getInstanceFromLibelle(String libelle) {
        for (Saison saison : values()) {
            if (saison.getLibelle().equalsIgnoreCase(libelle)) {
                return saison;
            }
        }
        throw new IllegalArgumentException("Aucune saison ne correspond au libellé: " + libelle);
    }

    /**
     * Getter
     *
     * @return libelle
     */

    public String getLibelle() {
        return libelle;
    }

    /**
     * Getter du numéro d'ordre de la saison
     * @return le numéro d'ordre de la saison
     */
    public int getNumOrdre() {
        return numOrdre;
    }
}
