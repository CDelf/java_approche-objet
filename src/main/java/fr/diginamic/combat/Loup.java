package fr.diginamic.combat;

import java.util.Random;

public class Loup extends Creature {

    private static Random random = new Random();

    public Loup(int force, int sante) {
        super(force, sante);
    }

    @Override
    public Loup initierCreature() {
        int force = random.nextInt(8 - 3 + 1) + 3;  // Force entre 3 et 8
        int sante = random.nextInt(10 - 5 + 1) + 5; // Santé entre 5 et 10
        return new Loup(force, sante);
    }

    @Override
    public String getType() {
        return "Loup";
    }
    @Override
    public String toString() {
        return "Loup : " + super.toString();
    }
}
