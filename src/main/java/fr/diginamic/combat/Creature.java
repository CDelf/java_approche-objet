package fr.diginamic.combat;

public abstract class Creature extends Participant {

    public Creature(int force, int sante) {
        super(force, sante);
    }

    public abstract  Creature initierCreature();

    public abstract String getType();

}
