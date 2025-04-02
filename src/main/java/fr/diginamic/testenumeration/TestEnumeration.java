package fr.diginamic.testenumeration;

public class TestEnumeration {

    public static void main(String[] args) {

        // Afficher toutes les saisons
        for(Saison s : Saison.values()) {
            System.out.println(s.getLibelle());
        }

        // A partir d'un String, retrouver l'instance
        String nom = "ETE";
        System.out.println("L'instance correspondant au String nom : " + Saison.valueOf(nom));

        // Retourner une instance à partir d'un libelle
        String libelle = "Hiver" ;
        System.out.println("Instance ayant le nom Hiver : " + Saison.getInstanceFromLibelle(libelle));
    }
}
