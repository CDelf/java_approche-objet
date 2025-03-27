package fr.diginamic.combat;

public abstract class Participant {

    int force;
    int sante;

    public Participant(int force, int sante) {
        this.force = force;
        this.sante = sante;
    }

    @Override
    public String toString() {
        return "Force = " + force +
                ", Sante = " + sante;
    }
}
