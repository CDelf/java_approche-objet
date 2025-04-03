package utils;

import annotations.ToString;

import java.lang.reflect.Field;

/**
 * Classe utilitaire permettant de générer la méthode toString d'une classe en fonction
 * de la présence d'annotations @ToString et de ses propriétés
 */
public final class StringUtils {
    /**
     * Méthode permettant de générer l'affichage d'attributs annotés @TOString d'un objet
     * @param obj objet dont on souhaite afficher les attributs annotés
     * @return l'affichage conditionné respectant la présence d'annotation et la valeur de ses propriétés
     */
    public static String genererStringSelonAnnotation(Object obj) {
        // Récupère la classe et les champs de l'objet en paramètre
        Field[] fields = obj.getClass().getDeclaredFields();
        StringBuilder sb = new StringBuilder();
        for(Field f : fields) {
            // permet de forcer la lecture d'un attribut privé
            f.setAccessible(true);
            if (f.isAnnotationPresent(ToString.class)) {
                try{
                    ToString annotation = f.getAnnotation(ToString.class);
                    Object value = f.get(obj);
                    if(annotation.upperCase()) {
                        value = ((String) value).toUpperCase();
                    }
                    // Créer l'affichage
                    sb.append(f.getName()).append(" : ").append(value);
                    if(!annotation.separateur().isEmpty()){
                        sb.append(annotation.separateur());
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return sb.toString();
    }

}
