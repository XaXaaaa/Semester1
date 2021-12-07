/*
@titel      Berechnung Pi
@author     Sebastian Lewin
@version    12.11.2021
*/

import java.util.Scanner;

public class Uebung5_Pi {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int z;
    double x = 1;
    double y = 3;

    System.out.print("Gib die Schleifenlänge an: ");
    z = s.nextInt();

    for (int i = 0; i < z; i++  ) {

    x = x - 1/y;
    y+=2;
    x = x + 1/y;
    y+=2;

    }

    x*=4;
    System.out.println(x);

    }
}


