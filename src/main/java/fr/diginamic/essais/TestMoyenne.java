package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;
import java.util.Arrays;

public class TestMoyenne {
    public static void main(String[] args) {
        // Création d'instances avec des tableaux initiaux
        CalculMoyenne moy1 = new CalculMoyenne(new double[]{2.0, 5.0, 1.0});
        CalculMoyenne moy2 = new CalculMoyenne(new double[]{2.0, -5.0, 0.0});

        // Ajout de nouvelles valeurs
        moy1.ajoutTableau(1.0);
        moy2.ajoutTableau(2.0);

        // Affichage des tableaux après ajout
        System.out.println("Tableau 1 : " + Arrays.toString(moy1.getTableau()));
        System.out.println("Moyenne 1 : " + moy1.calculMoyenne());

        System.out.println("Tableau 2 : " + Arrays.toString(moy2.getTableau()));
        System.out.println("Moyenne 2 : " + moy2.calculMoyenne());
    }
}
