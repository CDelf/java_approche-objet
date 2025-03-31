package tri;

import listes.Ville;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ComparatorNomVille implements Comparator<Ville> {

    @Override
    public int compare(Ville v1, Ville v2) {
        Collator collator = Collator.getInstance(Locale.FRANCE);
        return collator.compare(v1.getNom(), v2.getNom());
    }
}
