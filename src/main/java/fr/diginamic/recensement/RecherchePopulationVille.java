package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la ville : ");
        scanner.nextLine(); // Absorbe le retour à la ligne après nextInt() dans `ApplicationRecensement`
        String nomVille = scanner.nextLine().trim();

        Ville ville = recensement.rechercherVille(nomVille);

        if (ville != null) {
            System.out.println("La population de " + ville.getNomCommune() + " est de " + ville.getPopulation() + " habitants.");
        } else {
            System.out.println("Ville " + nomVille + " non trouvée. Vérifiez l’orthographe et réessayez.");
        }
    }
}
