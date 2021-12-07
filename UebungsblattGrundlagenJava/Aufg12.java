// Primzahl höhöööööö
package UebungsblattGrundlagenJava;
import java.util.Scanner;

public class Aufg12 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int zahl;
    System.out.print("Gib eine ganze Zahl ein: ");
    zahl = s.nextInt();

    for (int i = 1; i <= 1; i++) {
        if (zahl % 2 == 0 && zahl % 3 == 0) {
            System.out.print("Die eingegebene Zahl ist keine Primzahl.");
        } else {
            System.out.println("Die eingegebene Zahl ist eine Primzahl.");
        }

    }

    }
}
