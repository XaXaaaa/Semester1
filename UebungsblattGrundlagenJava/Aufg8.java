package UebungsblattGrundlagenJava;


import java.util.Scanner;

public class Aufg8 {
 
    public static void main (String[] args) {

    Scanner s = new Scanner(System.in);

    double r;

    System.out.println("Geben Sie den Rechnungsbetrag ein: ");
    r = s.nextDouble();

    if (r <= 100) {
        r *= 0.97;
    } else if (r <= 500) {
        r *= 0.95;
    } else {
        r *= 0.93;
    }
    System.out.println("Sie zahlen nach Rabattabzug " + r);




}
}