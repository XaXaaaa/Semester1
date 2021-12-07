

import java.io.*;
import java.text.DecimalFormat;

public class kartenautomat {

    public static void main(String[] args) throws IOException {

     InputStreamReader isr = new InputStreamReader(System.in); // Eingabe eingerichtet
     BufferedReader br = new BufferedReader(isr);

     double preisTarif;
     double preisGesamt;

     DecimalFormat df = new DecimalFormat("#.00 €"); // Ein hübsches Ausgabeformat der Doublewerte festgelegt

     System.out.println("Bitte wählen Sie Ihre Wunschkarte aus: "); // Kartenauswahl
     System.out.println("1 - Einzelkarte");
     System.out.println("2 - Wochenkarte");
     System.out.println("3 - Monatskarte");

     String eingabe = br.readLine();
     int auswahlKarte = Integer.parseInt(eingabe); // Eingabeparameter in Integer konvertieren und an Switch übergeben

     switch (auswahlKarte) { //
         case 1:
             System.out.println("Bitte wählen Sie Ihre Tarifzone aus: ");
             System.out.println("Tarifzohne 1 ");
             System.out.println("Tarifzohne 2 ");
             String eingabeTarif = br.readLine();
             int tarif = Integer.parseInt(eingabeTarif);

             if (tarif == 1) {
                 preisTarif = 2;
                 System.out.println("Ihr Ticket kostet: " + df.format(preisTarif));
             }
                 else if (tarif == 2) {
                     preisTarif = 2.80;
                     System.out.println("Ihr Ticket kostet " + df.format(preisTarif));
                 }

                 else {
                     System.out.println("Fehlerhafte Eingabe");
                 }
                 break;
         case 2:
             System.out.println("Bitte wählen Sie Ihre Tarifzone aus: ");
             System.out.println("Tarifzohne 1 ");
             System.out.println("Tarifzohne 2 ");
             eingabeTarif = br.readLine();
             tarif = Integer.parseInt(eingabeTarif);

             if (tarif == 1) {
                 preisTarif = 2;
                 preisGesamt = preisTarif * 6;
                 System.out.println("Ihr Ticket kostet " + df.format(preisGesamt));
             }
                 else if (tarif == 2) {
                     preisTarif = 2.80;
                     preisGesamt = preisTarif * 6;
                     System.out.println(" Ihr Ticket kostet " + df.format(preisGesamt));
                 }
                 else {
                     System.out.println("Fehlerhafte Eingabe");
             }
                 break;
         case 3:
             System.out.println("Bitte wählen Sie Ihre Tarifzone aus: ");
             System.out.println("Tarifzohne 1 ");
             System.out.println("Tarifzohne 2 ");
             eingabeTarif = br.readLine();
             tarif = Integer.parseInt(eingabeTarif);

             if (tarif == 1) {
                 preisTarif = 2;
                 preisGesamt = preisTarif * 25;
                 System.out.println("Ihr Ticket kostet " + df.format(preisGesamt));
             }
             else if (tarif == 2) {
                 preisTarif = 2.80;
                 preisGesamt = preisTarif * 25;
                 System.out.println(" Ihr Ticket kostet " + df.format(preisGesamt));
             }
             else {
                 System.out.println("Fehlerhafte Eingabe");
             }
             break;
         default:
             System.out.println("Fehlerhafte Eingabe");
     }

    }
}
