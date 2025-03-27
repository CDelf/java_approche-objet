package fr.diginamic.combat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personnage extends Participant {

    private int score = 0;
    private List<Potion> inventaire;
    static Random random = new Random();

    public Personnage(int force, int sante) {
        super(force, sante);
        this.inventaire = new ArrayList<>();
        // Initialisation de l'inventaire avec les potions par défaut
        this.inventaire.add(new Potion(Potion.Type.SOIN));
        this.inventaire.add(new Potion(Potion.Type.ATTAQUE_MINEURE));
        this.inventaire.add(new Potion(Potion.Type.ATTAQUE_MAJEURE));
    }

    public static Personnage initierPersonnage() {
        int force = random.nextInt(18 - 12 + 1) + 12;  // Génère un nombre entre 12 et 18
        int sante = random.nextInt(50 - 20 + 1) + 20;  // Génère un nombre entre 20 et 50
        return new Personnage(force, sante);
    }

    public void afficherScore() {
        System.out.println("Ton score est : " + this.score);
    }

    // Incrémente le score du joueur en cas de victoire, selon le type de créature affrontée
    public void incrementerScore(String typeCreature) {
        if(typeCreature.trim().equalsIgnoreCase("loup")) {
            this.score += 1;
            System.out.println("Vous avez gagné 1 point!");
        } else if(typeCreature.trim().equalsIgnoreCase("gobelin")) {
            this.score += 2;
            System.out.println("Vous avez gagné 2 points!");
        } else if(typeCreature.trim().equalsIgnoreCase("troll")) {
            this.score += 5;
            System.out.println("Vous avez gagné 5 points!");
        } else {
            System.out.println("Erreur, score non incrémenté.");
        }
    }

    // Récupère l'inventaire du personnage
    public List<Potion> getInventaire() {
        return inventaire;
    }

    // Consommer une potion
    public void consommerPotion(Potion potion) {
        // Appliquer l'effet de la potion
        switch (potion.getType()) {
            case SOIN:
                this.sante += potion.getEffet();
                System.out.println("Vous avez utilisé une potion de soin, vous récupérez " + potion.getEffet() + " points de santé.");
                break;
            case ATTAQUE_MINEURE:
                this.force += potion.getEffet();
                System.out.println("Vous avez utilisé une potion d'attaque mineure, votre force augmente de " + potion.getEffet() + " points.");
                break;
            case ATTAQUE_MAJEURE:
                this.force += potion.getEffet();
                System.out.println("Vous avez utilisé une potion d'attaque majeure, votre force augmente de " + potion.getEffet() + " points pendant " + potion.getDuree() + " combats.");
                break;
        }
        // Retirer la potion de l'inventaire après consommation
        inventaire.remove(potion);
    }

    // Afficher l'inventaire
    public void afficherInventaire() {
        System.out.println("Votre inventaire : ");
        for (Potion p : inventaire) {
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Personnage : " +
                super.toString() +
                " Score = " + score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
