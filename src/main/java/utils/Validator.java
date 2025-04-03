package utils;

import annotations.Rule;
import java.lang.reflect.Field;

/**
 * Classe utilitaire de validation qui fonctionne avec l'annotation @Rule
 * Vérifie qu'un integer n'est pas inférieur à une valeur minimale
 */
public final class Validator {

    /**
     * Vérifie que les attributs annotés @Rule d'un objet respecte le minimum
     * @param obj objet sur lequel la vérification d'attributs annotés s'applique
     */
    public static void validate(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(Rule.class)) {
                Rule rule = field.getAnnotation(Rule.class);
                field.setAccessible(true); // Accéder aux champs privés

                try {
                    int value = (int) field.get(obj);
                    // Vérification de la règle min (>= 0 par défaut)
                    if (value < rule.min()) {
                        throw new IllegalArgumentException("Erreur: " + field.getName() + " doit être >= " + rule.min());
                    }

                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Impossible d'accéder à l'attribut " + field.getName(), e);
                }
            }
        }
    }
}
