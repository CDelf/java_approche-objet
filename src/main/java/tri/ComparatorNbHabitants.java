package tri;

import listes.Ville;

import java.util.Comparator;

public class ComparatorNbHabitants implements Comparator<Ville> {

    @Override
    public  int compare(Ville v1, Ville v2){
        return Integer.compare(v1.getNbHabitants(), v2.getNbHabitants());
    }
}
