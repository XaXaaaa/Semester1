package UebungsblattGrundlagenJava;
/*
@autor Sebastian Lewin
@date 11/18/2021
@title Pruefen ob Integer gerade oder ungerade ist.
*/

import java.util.Scanner;

public class Aufg6 {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int zahl;

    System.out.println("Geben Sie eine ganze Zahl ein: ");
    zahl = s.nextInt();

    if (zahl % 2 == 0) {
        System.out.println("Die Zahl ist gerade.");
    } else {
        System.out.println("Die Zahl ist ungerade.");
    }

    }

}
