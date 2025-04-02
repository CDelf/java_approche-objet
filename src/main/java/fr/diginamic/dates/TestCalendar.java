package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        // Utiliser Calendar pour créer date 19 mai 2016 à 23h59 et 30 secondes au format jour/mois/année
        Calendar cal = Calendar.getInstance();
        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);
        Date d1 = cal.getTime();
        SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date à partir de Calendar : " + f1.format(d1));

        // Date du jour au format année/mois/jour heure : minute : seconde
        Date d2 = Calendar.getInstance().getTime();
        SimpleDateFormat f2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Date du jour : " + f2.format(d2));

        // Affichez la même instance avec le nom des jours et des mois en français, russe,
        //chinois et allemand.
        String pattern = "EEEE dd MMMM yyyy HH:mm:ss";
        // Français
        SimpleDateFormat fr = new SimpleDateFormat(pattern, Locale.FRANCE);
        System.out.println("Date du jour en français : " + fr.format(d2));
        // Russe
        SimpleDateFormat ru = new SimpleDateFormat(pattern, Locale.of("ru", "RU"));
        System.out.println("Date du jour en russe : " + ru.format(d2));
        // Chinois
        SimpleDateFormat ch = new SimpleDateFormat(pattern, Locale.CHINA);
        System.out.println("Date du jour en chinois : " + ch.format(d2));
        // Allemand
        SimpleDateFormat al = new SimpleDateFormat(pattern, Locale.GERMANY);
        System.out.println("Date du jour en allemand : " + al.format(d2));



    }
}
