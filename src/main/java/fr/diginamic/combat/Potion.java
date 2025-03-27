package fr.diginamic.combat;

import java.util.Random;

public class Potion {

    // Types de potions
    public enum Type {
        SOIN, ATTAQUE_MINEURE, ATTAQUE_MAJEURE
    }

    private Type type;
    private int effet;
    private int duree;

    public Potion(Type type) {
        this.type = type;

        // Déterminer l'effet et la durée en fonction du type
        switch (type) {
            case SOIN:
                this.effet = new Random().nextInt(6) + 5;  // Soigne entre 5 et 10 points
                this.duree = 1;  // Effet instantané
                break;
            case ATTAQUE_MINEURE:
                this.effet = 3;  // Augmente l'attaque de 3 points
                this.duree = 1;  // Effet valable pour un combat
                break;
            case ATTAQUE_MAJEURE:
                this.effet = 5;  // Augmente l'attaque de 5 points
                this.duree = 2;  // Effet valable pour 2 combats
                break;
        }
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Potion de " + type + " : effet " + effet + " pendant " + duree + " combat(s)";
    }
}
