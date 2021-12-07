/*
Titel:
Teil 4 - Grundlagen der Programmiersprache Java
Übung 3
Autor: Sebastian Lewin
Datum: 07.11.2021

Aufgabenstellung: Es müssen folgende Bedingungen erfüllt sein:
1. a ist eine positive gerade Zahl
2. Die Ganzzahl a besitzt weniger als 3 Ziffern
3. Die Nachkommazahlen nk1 und nk2 sind (nahezu) gleich
4. Die Nachkommazahl nk2 hat genau eine Nachkommastelle

*/

import java.util.Scanner;

public class Kap4Uebung3 {

public static void main(String[] args) {

int a = 0;
float nk1 = 0;
float nk2 = 0;

Scanner i = new Scanner(System.in);
Scanner s = new Scanner(System.in);
System.out.print("Gib die Ganzzahl ein: ");
a = i.nextInt(); // Beispiel: 2
// 1. Abfrage: ist a größer als 0 und und Rest teilbar? Wenn ja, Bedingung 1 erfüllt.
if (a>0 && a%2==0) {

System.out.print("Die eingegebene Zahl ist eine Ganzzahl und gerade.");


}
// 2. Abfrage: liegt a im Bereich zwischen -99 und 99? (Nur dann hat a weniger als drei Ziffern)
if (a>-100 && a<100) {
System.out.println("Die eingegebene Zahl hat weniger als 3 Ziffern");

System.out.println("Gib zwei Nachkommazahlen ein ... ");
System.out.println("Erste Nachkommazahl: ");
nk1 = s.nextFloat(); // Beispiel: 4

System.out.println("Zweite Nachkommazahl: ");
nk2 = s.nextFloat(); // Beispiel: 3,9876

if ((int)(nk1*1000)==(int)(nk2*1000)) { // (int) hackt alle Nachkommastellen ab!
    System.out.println("Die Zahlen sind gleich.");
}
// 4 * 1000 == (int) 3,9876 * 1000
// 4.000     == 3.9876,6
// 4.000     == 3.9876      (int) hackt die ,6 weg
// Beispielzahlen ungleich, Bedingung nicht erfüllt -> else wird ausgeführt
else {
    System.out.println("Die Zahlen sind ungleich.");
}
if (nk2*10 == (int)(nk2*10)) {
    System.out.println("Die zweite Nachkommazahl hat eine Nachkommastelle");
}
// 3,9876 * 10 == (int) 3,9876 * 10
// 39,876      == (int) 39,876
// 39,876      == 39            (int) hack ,876 weg
// Beispielzahlen ungleich, Bedingung nicht erfüllt -> else wird ausgefüllt
else {
    System.out.println("Die zweite Nachkommazahl hat 0 oder mindestens 2 Nachkommastellen");
}
// richtig, da 3,9876 vier Nachkommazahlen besitzt.

}
}
}