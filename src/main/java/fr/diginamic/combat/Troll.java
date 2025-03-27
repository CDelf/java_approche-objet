package fr.diginamic.combat;

import java.util.Random;

public class Troll extends Creature {

    private static Random random = new Random();

    public Troll(int force, int sante) {
        super(force, sante);
    }

    @Override
    public Troll initierCreature() {
        int force = random.nextInt(15 - 10 + 1) + 10;  // Force entre 10 et 15
        int sante = random.nextInt(30 - 20 + 1) + 20; // Santé entre 20 et 30
        return new Troll(force, sante);
    }

    @Override
    public String getType() {
        return "Troll";
    }

    @Override
    public String toString() {
        return "Troll : " + super.toString();
    }
}
