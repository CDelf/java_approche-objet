package utils;

public class TestMethodeStatic {

    public static void main(String[] args) {
        // Méthode statique pour convertir String en int via la classe Integer
        String chaine = "12";
        int i = Integer.parseInt(chaine);
        System.out.println("Résultat de la conversion de chaine : " + i);

        // Méthode statique pour obtenir le max entre 2 integers, via la classe Max
        int a = 1;
        int b = 2;
        System.out.println("Max entre 1 et 2 : " + Math.max(a,b) );
    }
}
