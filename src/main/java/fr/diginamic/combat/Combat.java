package fr.diginamic.combat;
import java.util.Random;

public class Combat {
    private Random random = new Random();
    private static final double CHANCE_RECOMPENSE = 0.5;  // 50% de chance d'obtenir une récompense

    public void gererCombat(Personnage p) {
        // Initialiser et afficher une créature aléatoire
        Creature c = getRandomCreature();
        System.out.println("Voici ton ennemi : " + c);

        // Attaques successives
        int attaquePersonnage = 0;
        int attaqueCreature = 0;
        int resultat = 0;

        do {
            attaquePersonnage = p.force + getRandomForce();
            attaqueCreature += c.force + getRandomForce();

            System.out.println("Votre force d'attaque est de : " + attaquePersonnage);
            System.out.println("La force d'attaque de la créature est de : " + attaqueCreature);

            if (attaquePersonnage > attaqueCreature) {
                resultat = attaquePersonnage - attaqueCreature;
                c.sante -= resultat;
                System.out.println("La santé de la créature est à présent de : " + c.sante);
                System.out.println(" -------------------------------------------------- ");
            } else {
                resultat = attaqueCreature - attaquePersonnage;
                p.sante -= resultat;
                System.out.println("Votre santé est désormais de : " + p.sante);
                System.out.println(" -------------------------------------------------- ");
            }
        } while (p.sante > 0 && c.sante > 0);

        // Fin du combat
        if (p.sante <= 0) {
            System.out.println("Vous avez perdu...");
        } else {
            System.out.println("Félicitations, vous avez remporté ce combat!");
            p.incrementerScore(c.getType()); // Ajoute un score après une victoire
            donnerRecompense(p); // Logique de récompense après un combat gagné
        }
    }

    public Creature getRandomCreature() {
        int choice = random.nextInt(3) + 1; // Génère 1, 2 ou 3
        switch (choice) {
            case 1: return new Loup(0, 0).initierCreature();
            case 2: return new Gobelin(0, 0).initierCreature();
            case 3: return new Troll(0, 0).initierCreature();
            default: throw new IllegalStateException("Valeur inattendue : " + choice);
        }
    }

    public int getRandomForce() {
        int force = random.nextInt(10 - 5 + 1) + 5;
        return force;
    }

    // Récompense après un combat
    private void donnerRecompense(Personnage p) {
        Random random = new Random();

        // 50% de chance d'obtenir une récompense
        if (random.nextDouble() < CHANCE_RECOMPENSE) {
            // Choisir une récompense aléatoire (potion ou score)
            int choixRecompense = random.nextInt(5); // 0 à 4
            switch (choixRecompense) {
                case 0:
                    System.out.println("Vous avez obtenu une potion de soin!");
                    p.getInventaire().add(new Potion(Potion.Type.SOIN));
                    break;
                case 1:
                    System.out.println("Vous avez obtenu une potion d'attaque mineure!");
                    p.getInventaire().add(new Potion(Potion.Type.ATTAQUE_MINEURE));
                    break;
                case 2:
                    System.out.println("Vous avez obtenu une potion d'attaque majeure!");
                    p.getInventaire().add(new Potion(Potion.Type.ATTAQUE_MAJEURE));
                    break;
                case 3:
                    System.out.println("Vous avez obtenu un bonus de score (+5)!");
                    int nouveauScore = p.getScore() + 5;
                    p.setScore(nouveauScore);
                    break;
                case 4:
                    // Aucune récompense
                    System.out.println("Pas de récompense cette fois.");
                    break;
            }
        } else {
            System.out.println("Vous n'avez pas obtenu de récompense cette fois.");
        }
    }
}
