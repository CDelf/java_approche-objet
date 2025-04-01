package fr.diginamic.recensement;

import java.util.Scanner;

public class MenuHandler {

    public static void afficherMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Population d’une ville donnée");
        System.out.println("2. Population d’un département donné");
        System.out.println("3. Population d’une région donnée");
        System.out.println("4. Afficher les 10 régions les plus peuplées");
        System.out.println("5. Afficher les 10 départements les plus peuplés");
        System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
        System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
        System.out.println("8. Afficher les 10 villes les plus peuplées de France");
        System.out.println("9. Quitter");
        System.out.print("Votre choix : ");
    }

    public static void choixOption(int option, Recensement recensement, Scanner scanner) {
        switch (option) {
            case 1:
                RecherchePopulationVille recherche = new RecherchePopulationVille();
                recherche.traiter(recensement, scanner);
                break;
            case 2:
                RecherchePopulationDpt rechercheDpt = new RecherchePopulationDpt();
                rechercheDpt.traiter(recensement, scanner);
                break;
            case 3:
                RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
                rechercheRegion.traiter(recensement, scanner);
                break;
            case 4:
                RechercheRegionPeupleeTop10 regionPeuplees = new RechercheRegionPeupleeTop10();
                regionPeuplees.traiter(recensement, scanner);
                break;
            case 5:
                RechercheDptPeupleTop10 dptPeuples = new RechercheDptPeupleTop10();
                dptPeuples.traiter(recensement, scanner);
                break;
            case 6:
                RechercheVillesDepartementTop10 villesDptTop10 = new RechercheVillesDepartementTop10();
                villesDptTop10.traiter(recensement, scanner);
                break;
            case 7:
                RechercheVillesRegionTop10 villesRegionTop10 = new RechercheVillesRegionTop10();
                villesRegionTop10.traiter(recensement, scanner);
                break;
            case 8:
                RechercheVillesFranceTop10 villesTop10 = new RechercheVillesFranceTop10();
                villesTop10.traiter(recensement, scanner);
                break;
            case 9:
                System.out.println("Merci d’avoir utilisé ce programme !");
                break;
            default:
                System.out.println("Option inconnue, recommencez.");
                break;
        }
    }
}
