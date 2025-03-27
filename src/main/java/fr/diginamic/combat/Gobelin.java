package fr.diginamic.combat;

import java.util.Random;

public class Gobelin extends Creature {

    private static Random random = new Random();

    public Gobelin(int force, int sante) {
        super(force, sante);
    }

    @Override
    public Gobelin initierCreature() {
        int force = random.nextInt(10 - 5 + 1) + 5;  // Force entre 5 et 10
        int sante = random.nextInt(15 - 10 + 1) + 10; // Santé entre 10 et 15
        return new Gobelin(force, sante);
    }

    @Override
    public String getType() {
        return "Gobelin";
    }

    @Override
    public String toString() {
        return "Gobelin : " + super.toString();
    }
}
