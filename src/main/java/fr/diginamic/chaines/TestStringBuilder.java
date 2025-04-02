package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {

        // Concaténation + chronométrée
        String s = "";
        long debutConcat = System.currentTimeMillis();
        for(int i=0; i<=100_000; i++) {
            s += i;
        }
        long finConcat = System.currentTimeMillis();
        System.out.println("Concaténation (en millisecondes) :" + (finConcat - debutConcat));

        // StringBuilder chronométré
        StringBuilder sb= new StringBuilder();
        long debutSB = System.currentTimeMillis();
        for(int i=0; i<=100_000; i++) {
            sb.append(i);        }
        long finSB = System.currentTimeMillis();
        System.out.println("StringBuilder (en millisecondes) :" + (finSB - debutSB ));
    }
}
