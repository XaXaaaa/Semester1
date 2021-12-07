package UebungsblattGrundlagenJava;



import java.util.Scanner;

public class Aufg7 {

    public static void main (String[] args) {

    Scanner s = new Scanner(System.in);

    double zahl;
    System.out.println("Geben Sie eine Zahl zum Vergleich mit 10 ein: ");
    zahl = s.nextDouble();

    if (Math.abs(zahl)-10 < .4) { // Bis 10,4 wird als nahezu gleich akzeptiert.
        System.out.println("Die Zahlen sind nahezu gleich.");
    } else {
        System.out.println("Die Zahlen sind ungleich.");
    }

    }

}
