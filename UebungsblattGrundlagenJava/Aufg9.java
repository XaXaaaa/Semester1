package UebungsblattGrundlagenJava;


import java.util.Scanner;

public class Aufg9 {
 
    public static void main (String[] args) {    
    Scanner s = new Scanner(System.in);

    int zahl;

    System.out.println("Geben Sie eine Ganzzahl ein: ");
    zahl = s.nextInt();

    if (zahl < 0) {
        zahl++;
    } else {
        zahl--;
    }
    System.out.println("Nach Veränderung Richtung 0: " + zahl);

    }
}
