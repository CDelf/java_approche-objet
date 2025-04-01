package fr.diginamic.recensement;


import java.util.List;
import java.util.Scanner;

public class Region implements Comparable<Region> {

    private String nomRegion;
    private int population;

    public Region(String nomRegion, int population) {
        this.nomRegion = nomRegion;
        this.population = population;
    }

    @Override
    public int compareTo(Region autre) {
        return Integer.compare(autre.getPopulation(), this.population); // Décroissant
    }

    // Récupérer la liste des villes à partir du nom de région entré par l'utilisateur
    public static List<Ville> obtenirVillesRegion(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        scanner.nextLine(); // Absorbe le retour à la ligne si besoin
        String nomRegion = scanner.nextLine().trim();

        // Récupération des villes de la région
        List<Ville> villesRegion = recensement.rechercherVillesParRegion(nomRegion);

        // Vérification si la région existe
        if (villesRegion.isEmpty()) {
            System.out.println("Région " + nomRegion + " non trouvée. Vérifiez l’orthographe et réessayez.");
            return null;
        }
        return villesRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}