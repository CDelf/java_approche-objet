package sets;

import java.util.HashSet;
import java.util.Set;

public class TestPays {

    public static void main(String[] args) {
        Set<Pays> pays = new HashSet<>();
        pays.add(new Pays("USA", 340_000_000, 82769.41));
        pays.add(new Pays("France",68_290_000, 44690.93));
        pays.add(new Pays("Allemagne", 83_280_000, 54343.23));
        pays.add(new Pays("UK", 68_350_000, 49463.86));
        pays.add(new Pays("Italie", 58_990_000, 39003.32));
        pays.add(new Pays("Japon", 124_500_000, 33766.53));
        pays.add(new Pays("Chine", 1_411_000_000, 12614.06));
        pays.add(new Pays("Russie", 143_800_000, 13817.05));
        pays.add(new Pays("Inde", 1_438_000_000, 2480.79));
        System.out.println("Set initial : " + pays);

        // Pays ayant le plus grand PIB/hab
        Pays paysPibParHabMax = pays.iterator().next();
        for(Pays p : pays) {
            if(p.getPibParHabitant() > paysPibParHabMax.getPibParHabitant()) {
                paysPibParHabMax = p;
            }
        }
        System.out.println("Le pays ayant le pib/hab le plus élevé est : " + paysPibParHabMax);

        // Pays ayant le plus grand pib total
        Pays paysRiche = pays.iterator().next();
        for(Pays p : pays) {
            if((p.getPib()) > (paysRiche.getPib())) {
                paysRiche = p;
            }
        }
        System.out.println("Le pays ayant le pib le plus élevé est : " + paysRiche);

        // Trouver le pays ayant le pib total le plus petit et modifier la casse de son nom
        Pays paysPauvre = pays.iterator().next();
        for (Pays p : pays) {
           if(p.getPib() < paysPauvre.getPib()) {
               paysPauvre = p;
           }
        }
        // Modifier le nom du pays en majuscules
        paysPauvre.setNom(paysPauvre.getNom().toUpperCase());
        System.out.println("Set avec le pays ayant le pib le plus bas (" + paysPauvre.getNom() +") en majuscules " + pays);

        // Supprimer le pays avec le pib total le plus grand
        pays.remove(paysRiche);
        System.out.println("Set sans le pays ayant le pib le plus élevé (" + paysRiche.getNom() + ") :" + pays);

        // Vérifier que le nombre d'habitants ne peut pas être négatif @Rule
        Pays paysIvente = new Pays("Nom", -100, 190);
        System.out.println("Pays inventé : " + paysIvente);
    }
}
