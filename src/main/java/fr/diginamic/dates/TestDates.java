package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) throws Exception {
        // Date du jour
        Date dateAuj = new Date();
        SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date du jour : " + formateur1.format(dateAuj));

        // Date : 19/05/2016 à 23 :59 :30 au format 19/05/2016 à 23 :59 :30
        Date date1 = new Date(116, Calendar.MAY, 19, 23, 59, 30);
        SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy à HH:mm:ss");
        System.out.println("Date au format demandé: " + formateur2.format(date1));
        // Date du jour au même format
        System.out.println("Date système : " + formateur2.format(dateAuj));
    }
}
